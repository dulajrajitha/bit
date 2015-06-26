/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.customer.dto;

import TIMS.app.lib.hbm.TimsCustomer;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class CustomerComboItem {

    private Integer code;
    private String name;
    private TimsCustomer customer;

    public CustomerComboItem(TimsCustomer customer) {
        this.customer = customer;
        this.setCode(customer.getCode());
        this.setName(customer.getFullName());
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

    public TimsCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(TimsCustomer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
