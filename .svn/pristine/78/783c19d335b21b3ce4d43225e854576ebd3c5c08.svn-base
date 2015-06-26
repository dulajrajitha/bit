/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.dto;

import TIMS.app.lib.hbm.TimsProduct;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ProductComboItem {

    private Integer code;
    private String name;
    private TimsProduct timsProduct;

    public ProductComboItem(TimsProduct timsProduct) {
        this.timsProduct = timsProduct;
        this.name = timsProduct.getName();
        this.code = timsProduct.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimsProduct getTimsProduct() {
        return timsProduct;
    }

    public void setTimsProduct(TimsProduct timsProduct) {
        this.timsProduct = timsProduct;
    }

    public String toString() {
        return this.getName();
    }
}
