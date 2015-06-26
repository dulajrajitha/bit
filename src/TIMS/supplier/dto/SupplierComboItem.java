/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.dto;

import TIMS.app.lib.hbm.TimsSupplier;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class SupplierComboItem {

    private Integer code;
    private String name;
    private TimsSupplier supplier;

    public SupplierComboItem(TimsSupplier supplier) {
        this.supplier = supplier;
        this.name = supplier.getFullName();
        this.code = supplier.getCode();
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

    public TimsSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(TimsSupplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
