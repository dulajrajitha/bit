/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.dto;

import TIMS.customer.dto.*;
import TIMS.app.lib.hbm.TimsBarnd;

/**
 *
 * @author Sithara Gunawardana
 */
public class BrandComboItem {

    private Integer code;
    private String name;
    private TimsBarnd brand;

    public BrandComboItem(TimsBarnd brand) {
        this.brand = brand;
        this.setCode(brand.getCode());
        this.setName(brand.getName());
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

    public TimsBarnd getBrand() {
        return brand;
    }

    public void setBrand(TimsBarnd brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
