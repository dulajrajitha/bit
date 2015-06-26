/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.dto;

import TIMS.app.lib.hbm.TimsInvoice;

/**
 *
 * @author Sithara Gunawardana
 */
public class InvoiceNoComboItem {
    private Integer no;
    private String name;
    private TimsInvoice invoice;

    public InvoiceNoComboItem(TimsInvoice invoice) {
        this.invoice = invoice;
        this.no = invoice.getNo();
        this.name = this.generateName();
    }

    public InvoiceNoComboItem() {
        
    }

    
    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimsInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TimsInvoice invoice) {
        this.invoice = invoice;
    }
    
    public String generateName(){
        return getInvoice().getNo().toString();
    }
    
    @Override
    public String toString(){
        return this.getNo().toString();
    }
}
