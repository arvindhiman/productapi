package org.example.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.metadata.CallMetaDataContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.*;

@RestController
public class GenericController {

    public Logger log = LoggerFactory.getLogger(GenericController.class);

    static Map<String, String> uriToProcMap = new HashMap<>();
    static {
        uriToProcMap.put("/products", "PROC_PRODUCTS");
        uriToProcMap.put("/named-products", "PROC_NAMED_PRODUCTS");
    }

    @Autowired
    DataSource dataSource;

    @Autowired
    FieldNameMapper fieldNameMapper;

    @GetMapping("/**")
    public ResponseEntity<Object> getAnything(HttpServletRequest request) {

        String procName = uriToProcMap.get(request.getRequestURI());

        if (procName == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        CallMetaDataContext context = new CallMetaDataContext();
        context.setFunction(true);
        context.setSchemaName("ADMIN");
        context.setProcedureName(procName);
        context.initializeMetaData(dataSource);
        context.processParameters(Collections.emptyList());

        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName(uriToProcMap.get(request.getRequestURI()));

        List<SqlParameter> sqlParameters = context.getCallParameters();

        MapSqlParameterSource in = new MapSqlParameterSource();

        String outputParamName = null;

        for(SqlParameter sqlParameter: sqlParameters) {
            if (sqlParameter.isInputValueProvided()) {
                String name = sqlParameter.getName().toLowerCase();
                String value = request.getParameter(name);
                in.addValue(name, value);
            }

            if (!sqlParameter.isInputValueProvided() && !sqlParameter.isResultsParameter()) {
                outputParamName = sqlParameter.getName();
            }
        }

        Map output = simpleJdbcCall.execute(in);

        List<Map> records = (List<Map>) output.get(outputParamName);

        List<Map> newRecords = new ArrayList<>();
        int i = 1;


        for(Map<String, Object> record: records) {

            Map<String, Object> newMap = new HashMap<>();

            newRecords.add(newMap);

            for(String key: record.keySet()) {
                Object value = record.get(key);

                String newKey = fieldNameMapper.convert(key);
                newMap.put(newKey, value);

            }

        }

        return new ResponseEntity<>(newRecords, HttpStatus.OK);

    }

}
