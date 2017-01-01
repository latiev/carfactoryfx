package aplikasi.model;
// Generated Apr 9, 2015 6:12:42 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer productId;
     private int manufacturerId;
     private String productCode;
     private BigDecimal purchaseCost;
     private Integer quantityOnHand;
     private BigDecimal markup;
     private String available;
     private String description;
     private String formatCost;

    public Product() {
    }

	
    public Product(Integer productId, int manufacturerId, String productCode) {
        this.productId = productId;
        this.manufacturerId = manufacturerId;
        this.productCode = productCode;
    }

    public Product(Integer productId, int manufacturerId, String productCode, BigDecimal purchaseCost, Integer quantityOnHand, BigDecimal markup, String available, String description, String fPurchaseCost) {
        this.productId = productId;
        this.manufacturerId = manufacturerId;
        this.productCode = productCode;
        this.purchaseCost = purchaseCost;
        this.quantityOnHand = quantityOnHand;
        this.markup = markup;
        this.available = available;
        this.description = description;
        this.formatCost = fPurchaseCost;
    }
    
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public int getManufacturerId() {
        return this.manufacturerId;
    }
    
    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public BigDecimal getPurchaseCost() {
        return this.purchaseCost;
    }
    
    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }
    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }
    
    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
    public BigDecimal getMarkup() {
        return this.markup;
    }
    
    public void setMarkup(BigDecimal markup) {
        this.markup = markup;
    }
    public String getAvailable() {
        return this.available;
    }
    
    public void setAvailable(String available) {
        this.available = available;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormatCost() {
        String format = "$ "+getPurchaseCost().toString();
        return format;
    }

    public void setFormatCost(String fPurchaseCost) {
        this.formatCost = fPurchaseCost;
    }

}


