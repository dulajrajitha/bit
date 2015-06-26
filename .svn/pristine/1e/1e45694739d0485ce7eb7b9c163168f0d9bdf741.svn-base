/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.dto;

import TIMS.app.lib.hbm.TimsProductGroup;

/**
 *
 * @author Damith
 */
public class ProductGropsCheckedBox {
    
    private Integer code;
    private String name;
    private TimsProductGroup timsProductGroup;

    public ProductGropsCheckedBox(TimsProductGroup timsProductGroup) {
        this.code = timsProductGroup.getCode();
        this.name = timsProductGroup.getName();
        this.timsProductGroup = timsProductGroup;
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

    public TimsProductGroup getTimsProductGroup() {
        return timsProductGroup;
    }

    public void setTimsProductGroup(TimsProductGroup timsProductGroup) {
        this.timsProductGroup = timsProductGroup;
    }
    
    public String toString(){
        return this.getName();
    }
}
