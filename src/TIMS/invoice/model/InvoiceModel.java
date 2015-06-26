/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.model;

import TIMS.app.lib.hbm.TimsBarnd;
import TIMS.app.lib.hbm.TimsInvoice;
import TIMS.brand.dto.BrandComboItem;
import TIMS.invoice.dao.InvoiceDao;
import TIMS.invoice.dto.InvoiceComboItem;
import TIMS.invoice.dto.InvoiceNoComboItem;
import TIMS.invoice.dto.InvoiceTypeComboItem;
import TIMS.invoice.dto.SalesTypeComboItem;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class InvoiceModel {
    
    final public static String SALES = "SALES";
    final public static String SALES_RETURN = "SALES_RETURN";
    final public static String PURCHESE = "PURCHESE";
    final public static String STOCK_RETURN = "STOCK_RETURN";
    final public static String SALES_WHOLE_SALES = "WHOLE_SALES";
    final public static String SALES_RETAILS = "RETAILS";
    protected InvoiceDao invoiceDao;
    
    public InvoiceDao getInvoiceDao() {
        if (invoiceDao == null) {
            invoiceDao = new InvoiceDao();
        }
        return invoiceDao;
    }
    
    public void setInvoiceDao(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }
    
    public TimsInvoice saveInvoice(TimsInvoice invoice) {
        return this.getInvoiceDao().saveInvoice(invoice);
    }
    
    public TimsInvoice getInvoiceById(Integer id) {
        return this.getInvoiceDao().getInvoiceById(id);
    }
    
    public TimsInvoice addItemsToInvoice(TimsInvoice invoice, HashSet items) {
        return invoice;
    }
    
    public TimsInvoice addItemsToInvoice(Integer id, HashSet items) {
        return this.getInvoiceById(id);
    }
    
    public TimsInvoice addSalesToInvoice(TimsInvoice invoice, HashSet sales) {
        return invoice;
    }
    
    public TimsInvoice addSaleReturnsToInvoice(TimsInvoice invoice, HashSet sales) {
        return invoice;
    }
    
    public TimsInvoice addSPurchesesToInvoice(TimsInvoice invoice, HashSet sales) {
        return invoice;
    }
    
    public TimsInvoice addStockReturnsToInvoice(TimsInvoice invoice, HashSet sales) {
        return invoice;
    }
    
    public InvoiceTypeComboItem[] getInvoiceTypes() {
        InvoiceTypeComboItem list[] = {
            new InvoiceTypeComboItem(InvoiceModel.SALES, "Sales"),
            new InvoiceTypeComboItem(InvoiceModel.SALES_RETURN, "Sales Return"),
            new InvoiceTypeComboItem(InvoiceModel.PURCHESE, "Purchese"),
            new InvoiceTypeComboItem(InvoiceModel.STOCK_RETURN, "Stock Return")
        };
        return list;
    }

    public SalesTypeComboItem[] getSalesTypes() {
        SalesTypeComboItem list[] = {
            new SalesTypeComboItem(InvoiceModel.SALES_RETAILS, "Retails"),
            new SalesTypeComboItem(InvoiceModel.SALES_WHOLE_SALES, "Whole Sales")
        };
        return list;
    }
    
    public List getInvoiceList() {
        return this.getInvoiceDao().getInvoiceList();
    }
   
    
    public InvoiceComboItem[] getInvoiceListComboItem(boolean withSelect) {
        List invoiceList = this.getInvoiceList();
        int size = withSelect ? invoiceList.size() + 1 : invoiceList.size();
        InvoiceComboItem invoiceComboItem[] = new InvoiceComboItem[size];
        int i = 0;
        if (withSelect) {
            InvoiceComboItem comboItem = new InvoiceComboItem();
            comboItem.setNo(0);
            comboItem.setName("Select");
            invoiceComboItem[i] = comboItem;
            i++;
        }
        
        for (Object invoice : invoiceList) {
            invoiceComboItem[i] = new InvoiceComboItem((TimsInvoice) invoice);
        }
        
        return invoiceComboItem;
    }
    

    public InvoiceNoComboItem[] getInvoiceNoListComboItem() {
         List invoiceNoList = this.getInvoiceList();
        InvoiceNoComboItem invoiceComboItem[] = new InvoiceNoComboItem[invoiceNoList.size()];
        int i = 0;
        for (Object object : invoiceNoList) {
            invoiceComboItem[i++] = new InvoiceNoComboItem((TimsInvoice) object);
        }
        return invoiceComboItem;
    }
}
