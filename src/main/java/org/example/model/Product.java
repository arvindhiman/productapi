package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-18T03:58:06.468Z[GMT]")


public class Product   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("productDescription")
  private String productDescription = null;

  @JsonProperty("productSubcategory")
  private String productSubcategory = null;

  @JsonProperty("prodSubcategoryId")
  private Integer prodSubcategoryId = null;

  @JsonProperty("productSubcategoryDescription")
  private String productSubcategoryDescription = null;

  @JsonProperty("productCategory")
  private String productCategory = null;

  @JsonProperty("productCategoryId")
  private String productCategoryId = null;

  @JsonProperty("productCategoryDescription")
  private String productCategoryDescription = null;

  @JsonProperty("productWeightClass")
  private Integer productWeightClass = null;

  @JsonProperty("productUnitOfMeasure")
  private String productUnitOfMeasure = null;

  @JsonProperty("productPackSize")
  private String productPackSize = null;

  @JsonProperty("supplierId")
  private Integer supplierId = null;

  @JsonProperty("productStatus")
  private String productStatus = null;

  @JsonProperty("productListPrice")
  private BigDecimal productListPrice = null;

  @JsonProperty("productMinPrice")
  private BigDecimal productMinPrice = null;

  @JsonProperty("productTotal")
  private String productTotal = null;

  @JsonProperty("productTotalId")
  private Integer productTotalId = null;

  @JsonProperty("productSourceId")
  private Integer productSourceId = null;

  @JsonProperty("productEffectiveFrom")
  private String productEffectiveFrom = null;

  @JsonProperty("productEffectiveTo")
  private String productEffectiveTo = null;

  @JsonProperty("productValid")
  private String productValid = null;

  public Product id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Product productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
   **/
  
  
    public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Product productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
   **/
  
  
    public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Product productSubcategory(String productSubcategory) {
    this.productSubcategory = productSubcategory;
    return this;
  }

  /**
   * Get productSubcategory
   * @return productSubcategory
   **/
  
  
    public String getProductSubcategory() {
    return productSubcategory;
  }

  public void setProductSubcategory(String productSubcategory) {
    this.productSubcategory = productSubcategory;
  }

  public Product prodSubcategoryId(Integer prodSubcategoryId) {
    this.prodSubcategoryId = prodSubcategoryId;
    return this;
  }

  /**
   * Get prodSubcategoryId
   * @return prodSubcategoryId
   **/
  
  
    public Integer getProdSubcategoryId() {
    return prodSubcategoryId;
  }

  public void setProdSubcategoryId(Integer prodSubcategoryId) {
    this.prodSubcategoryId = prodSubcategoryId;
  }

  public Product productSubcategoryDescription(String productSubcategoryDescription) {
    this.productSubcategoryDescription = productSubcategoryDescription;
    return this;
  }

  /**
   * Get productSubcategoryDescription
   * @return productSubcategoryDescription
   **/
  
  
    public String getProductSubcategoryDescription() {
    return productSubcategoryDescription;
  }

  public void setProductSubcategoryDescription(String productSubcategoryDescription) {
    this.productSubcategoryDescription = productSubcategoryDescription;
  }

  public Product productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
   **/
  
  
    public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  public Product productCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
    return this;
  }

  /**
   * Get productCategoryId
   * @return productCategoryId
   **/
  
  
    public String getProductCategoryId() {
    return productCategoryId;
  }

  public void setProductCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
  }

  public Product productCategoryDescription(String productCategoryDescription) {
    this.productCategoryDescription = productCategoryDescription;
    return this;
  }

  /**
   * Get productCategoryDescription
   * @return productCategoryDescription
   **/
  
  
    public String getProductCategoryDescription() {
    return productCategoryDescription;
  }

  public void setProductCategoryDescription(String productCategoryDescription) {
    this.productCategoryDescription = productCategoryDescription;
  }

  public Product productWeightClass(Integer productWeightClass) {
    this.productWeightClass = productWeightClass;
    return this;
  }

  /**
   * Get productWeightClass
   * @return productWeightClass
   **/
  
  
    public Integer getProductWeightClass() {
    return productWeightClass;
  }

  public void setProductWeightClass(Integer productWeightClass) {
    this.productWeightClass = productWeightClass;
  }

  public Product productUnitOfMeasure(String productUnitOfMeasure) {
    this.productUnitOfMeasure = productUnitOfMeasure;
    return this;
  }

  /**
   * Get productUnitOfMeasure
   * @return productUnitOfMeasure
   **/
  
  
    public String getProductUnitOfMeasure() {
    return productUnitOfMeasure;
  }

  public void setProductUnitOfMeasure(String productUnitOfMeasure) {
    this.productUnitOfMeasure = productUnitOfMeasure;
  }

  public Product productPackSize(String productPackSize) {
    this.productPackSize = productPackSize;
    return this;
  }

  /**
   * Get productPackSize
   * @return productPackSize
   **/
  
  
    public String getProductPackSize() {
    return productPackSize;
  }

  public void setProductPackSize(String productPackSize) {
    this.productPackSize = productPackSize;
  }

  public Product supplierId(Integer supplierId) {
    this.supplierId = supplierId;
    return this;
  }

  /**
   * Get supplierId
   * @return supplierId
   **/
  
  
    public Integer getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }

  public Product productStatus(String productStatus) {
    this.productStatus = productStatus;
    return this;
  }

  /**
   * Get productStatus
   * @return productStatus
   **/
  
  
    public String getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
  }

  public Product productListPrice(BigDecimal productListPrice) {
    this.productListPrice = productListPrice;
    return this;
  }

  /**
   * Get productListPrice
   * @return productListPrice
   **/
  

    public BigDecimal getProductListPrice() {
    return productListPrice;
  }

  public void setProductListPrice(BigDecimal productListPrice) {
    this.productListPrice = productListPrice;
  }

  public Product productMinPrice(BigDecimal productMinPrice) {
    this.productMinPrice = productMinPrice;
    return this;
  }

  /**
   * Get productMinPrice
   * @return productMinPrice
   **/
  

    public BigDecimal getProductMinPrice() {
    return productMinPrice;
  }

  public void setProductMinPrice(BigDecimal productMinPrice) {
    this.productMinPrice = productMinPrice;
  }

  public Product productTotal(String productTotal) {
    this.productTotal = productTotal;
    return this;
  }

  /**
   * Get productTotal
   * @return productTotal
   **/
  
  
    public String getProductTotal() {
    return productTotal;
  }

  public void setProductTotal(String productTotal) {
    this.productTotal = productTotal;
  }

  public Product productTotalId(Integer productTotalId) {
    this.productTotalId = productTotalId;
    return this;
  }

  /**
   * Get productTotalId
   * @return productTotalId
   **/
  
  
    public Integer getProductTotalId() {
    return productTotalId;
  }

  public void setProductTotalId(Integer productTotalId) {
    this.productTotalId = productTotalId;
  }

  public Product productSourceId(Integer productSourceId) {
    this.productSourceId = productSourceId;
    return this;
  }

  /**
   * Get productSourceId
   * @return productSourceId
   **/
  
  
    public Integer getProductSourceId() {
    return productSourceId;
  }

  public void setProductSourceId(Integer productSourceId) {
    this.productSourceId = productSourceId;
  }

  public Product productEffectiveFrom(String productEffectiveFrom) {
    this.productEffectiveFrom = productEffectiveFrom;
    return this;
  }

  /**
   * Get productEffectiveFrom
   * @return productEffectiveFrom
   **/
  
  
    public String getProductEffectiveFrom() {
    return productEffectiveFrom;
  }

  public void setProductEffectiveFrom(String productEffectiveFrom) {
    this.productEffectiveFrom = productEffectiveFrom;
  }

  public Product productEffectiveTo(String productEffectiveTo) {
    this.productEffectiveTo = productEffectiveTo;
    return this;
  }

  /**
   * Get productEffectiveTo
   * @return productEffectiveTo
   **/
  
  
    public String getProductEffectiveTo() {
    return productEffectiveTo;
  }

  public void setProductEffectiveTo(String productEffectiveTo) {
    this.productEffectiveTo = productEffectiveTo;
  }

  public Product productValid(String productValid) {
    this.productValid = productValid;
    return this;
  }

  /**
   * Get productValid
   * @return productValid
   **/
  
  
    public String getProductValid() {
    return productValid;
  }

  public void setProductValid(String productValid) {
    this.productValid = productValid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productDescription, product.productDescription) &&
        Objects.equals(this.productSubcategory, product.productSubcategory) &&
        Objects.equals(this.prodSubcategoryId, product.prodSubcategoryId) &&
        Objects.equals(this.productSubcategoryDescription, product.productSubcategoryDescription) &&
        Objects.equals(this.productCategory, product.productCategory) &&
        Objects.equals(this.productCategoryId, product.productCategoryId) &&
        Objects.equals(this.productCategoryDescription, product.productCategoryDescription) &&
        Objects.equals(this.productWeightClass, product.productWeightClass) &&
        Objects.equals(this.productUnitOfMeasure, product.productUnitOfMeasure) &&
        Objects.equals(this.productPackSize, product.productPackSize) &&
        Objects.equals(this.supplierId, product.supplierId) &&
        Objects.equals(this.productStatus, product.productStatus) &&
        Objects.equals(this.productListPrice, product.productListPrice) &&
        Objects.equals(this.productMinPrice, product.productMinPrice) &&
        Objects.equals(this.productTotal, product.productTotal) &&
        Objects.equals(this.productTotalId, product.productTotalId) &&
        Objects.equals(this.productSourceId, product.productSourceId) &&
        Objects.equals(this.productEffectiveFrom, product.productEffectiveFrom) &&
        Objects.equals(this.productEffectiveTo, product.productEffectiveTo) &&
        Objects.equals(this.productValid, product.productValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productName, productDescription, productSubcategory, prodSubcategoryId, productSubcategoryDescription, productCategory, productCategoryId, productCategoryDescription, productWeightClass, productUnitOfMeasure, productPackSize, supplierId, productStatus, productListPrice, productMinPrice, productTotal, productTotalId, productSourceId, productEffectiveFrom, productEffectiveTo, productValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productSubcategory: ").append(toIndentedString(productSubcategory)).append("\n");
    sb.append("    prodSubcategoryId: ").append(toIndentedString(prodSubcategoryId)).append("\n");
    sb.append("    productSubcategoryDescription: ").append(toIndentedString(productSubcategoryDescription)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
    sb.append("    productCategoryDescription: ").append(toIndentedString(productCategoryDescription)).append("\n");
    sb.append("    productWeightClass: ").append(toIndentedString(productWeightClass)).append("\n");
    sb.append("    productUnitOfMeasure: ").append(toIndentedString(productUnitOfMeasure)).append("\n");
    sb.append("    productPackSize: ").append(toIndentedString(productPackSize)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    productStatus: ").append(toIndentedString(productStatus)).append("\n");
    sb.append("    productListPrice: ").append(toIndentedString(productListPrice)).append("\n");
    sb.append("    productMinPrice: ").append(toIndentedString(productMinPrice)).append("\n");
    sb.append("    productTotal: ").append(toIndentedString(productTotal)).append("\n");
    sb.append("    productTotalId: ").append(toIndentedString(productTotalId)).append("\n");
    sb.append("    productSourceId: ").append(toIndentedString(productSourceId)).append("\n");
    sb.append("    productEffectiveFrom: ").append(toIndentedString(productEffectiveFrom)).append("\n");
    sb.append("    productEffectiveTo: ").append(toIndentedString(productEffectiveTo)).append("\n");
    sb.append("    productValid: ").append(toIndentedString(productValid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
