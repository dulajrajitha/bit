/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.dto;

import TIMS.app.lib.hbm.TimsCustomer;
import TIMS.app.lib.hbm.TimsSupplier;
import java.util.Date;

/**
 *
 * @author Sithara Gunawardana
 */
public class InvoiceDto {

 
    
     private Integer no;
     private TimsSupplier timsSupplier;
     private TimsCustomer timsCustomer;
     private Date date;
     private String type;
     private String vehicalNo;
     private Integer refInvoice;
     private String other;
     private String saleType;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
  public void setNo(String no) {
        try {
            if (no != null && !no.equals("")) {
                this.no = Integer.parseInt(no);
            }
        } catch (Exception e) {
            this.no = 0;
        }

    }

    public TimsSupplier getTimsSupplier() {
        return timsSupplier;
    }

    public void setTimsSupplier(TimsSupplier timsSupplier) {
        this.timsSupplier = timsSupplier;
    }

    public TimsCustomer getTimsCustomer() {
        return timsCustomer;
    }

    public void setTimsCustomer(TimsCustomer timsCustomer) {
        this.timsCustomer = timsCustomer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVehicalNo() {
        return vehicalNo;
    }

    public void setVehicalNo(String vehicalNo) {
        this.vehicalNo = vehicalNo;
    }

    public Integer getRefInvoice() {
        return refInvoice;
    }

    public void setRefInvoice(Integer refInvoice) {
        this.refInvoice = refInvoice;
    }
    public void setRefInvoice(String refInvoice) {
        try {
            if (refInvoice != null && !refInvoice.equals("")) {
                this.refInvoice = Integer.parseInt(refInvoice);
            }
        } catch (Exception e) {
            this.refInvoice = 0;
        }

    }
    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

  
    
}
