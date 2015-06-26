/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.dto;

/**
 *
 * @author Damith
 */
public class ProductDto {

    private Integer code;
    private String description;
    private String size;
    private String name;
    private Integer productTypeCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setCode(String code) {
        try {
            if (code != null && !code.equals("")) {
                this.code = Integer.parseInt(code);
            }
        } catch (Exception e) {
            this.code = 0;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(Integer productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        try {
            if (productTypeCode != null && !productTypeCode.equals("")) {
                this.productTypeCode = Integer.parseInt(productTypeCode);
            }
        } catch (Exception e) {
            this.productTypeCode = 0;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
