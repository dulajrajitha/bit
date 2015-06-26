/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.dto;

import TIMS.app.lib.hbm.TimsBarnd;
import TIMS.app.lib.hbm.TimsProductBrand;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ProductBarndComboItem {

    private TimsProductBrand productBrand;

    public TimsProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(TimsProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public ProductBarndComboItem(TimsProductBrand timsProductBrand) {
        productBrand = timsProductBrand;
    }

    public TimsBarnd getBarnd() {
        return this.getProductBrand().getTimsBarnd();
    }

    @Override
    public String toString() {
        return getBarnd().getName();
    }

    public Double getPurchasePrice() {
        return getProductBrand().getPurchasePrice();
    }

    public Double getSellingPrice() {
        return getProductBrand().getSellingPrice();
    }
}
