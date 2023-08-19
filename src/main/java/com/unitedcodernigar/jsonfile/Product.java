package com.unitedcodernigar.jsonfile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    @JsonProperty("product-name")
    private String productName;
    @JsonProperty("product-code")
    private String productCode;
    @JsonProperty("category")
    private String productCategory;
    public Product(){
    }
    public Product(String productName, String productCode, String productCategory) {
        this.productName = productName;
        this.productCode = productCode;

        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }
    public String getProductCode() {
        return productCode;
    }
    public String getProductCategory() {
        return productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
