/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.model;

import TIMS.app.lib.hbm.TimsSale;
import TIMS.sales.dao.SalesDao;
import TIMS.sales.dto.SalesDto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sithara Gunawardana
 */
public class SalesModel {
    protected SalesDao salesDao = null;

    public SalesDao getSalesDao() {
        if (this.salesDao == null) {
            this.salesDao = new SalesDao();
        }
        return salesDao;
    }

    public void setSalesDao(SalesDao salesDao) {
        this.salesDao = salesDao;
    }

    public TimsSale saveSales(SalesDto salesDto) {
        TimsSale sale = null;
        TimsSale newSale = null;
        if (salesDto.getCode() == null) {
            sale = new TimsSale();
        } else {
            sale = getSaleByCode(salesDto.getCode());
        }
        
        
        sale.setRate(salesDto.getRate());
        sale.setDiscount(salesDto.getDiscount());
        sale.setQty(salesDto.getQuantity());
        sale.setTimsInvoice(salesDto.getInvoiceNo());
        sale.setTimsProduct(salesDto.getProductCode());
        sale.setTimsBarnd(salesDto.getBrandCode());
        
        
        

        System.out.println("saleDto.getCode()------>" + salesDto.getCode());
        if (salesDto.getCode() == null) {
            newSale = this.getSalesDao().saveSale(sale);
        } else {
            salesDto.setCode(salesDto.getCode());
            newSale = this.getSalesDao().updateSale(sale);
        }
        System.out.println("newSale---code-->" + newSale.getCode());
        return newSale;
        
    }
    private TimsSale getSaleByCode(Integer code) {
        return this.getSalesDao().getSaleByCode(code);
    }
     public DefaultTableModel loadCustomersData() {
        List data = this.getSalesDao().getAllSales();
        Object columnNames[] = {"Select", "Code", "rate", "qty", "invoice no", "product code", "discount", "barnd code"};

        Object rowData[][] = new Object[data.size()][columnNames.length];

        for (int i = 0; i < data.size(); i++) {
            TimsSale sales = (TimsSale) data.get(i);
            Object o[] = this.getDataRow(sales);
            rowData[i] = o;
        }


        DefaultTableModel model = new DefaultTableModel(rowData, columnNames) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0 ? true : false;
            }

            @Override
            public Class<?> getColumnClass(int col) {
                switch (col) {
                    case 0:
                        return Boolean.class;
                    case 1:
                        return Integer.class;
                    case 2:
                        return String.class;
                    case 3:
                        return Integer.class;
                    default:
                        return String.class;
                }

            }
        };
        return model;
    }

    private Object[] getDataRow(TimsSale sale) {
        Object o[] = {false, sale.getCode(), sale.getDiscount(),sale.getQty(),sale.getRate(),sale.getTimsBarnd(),sale.getTimsInvoice(),sale.getTimsProduct()};
        return o;
    }// delete the customer
    public int deleteSales(ArrayList<Integer> saleIds) {
        int count = 0;
        for (Integer saleId : saleIds) {
            count = count + this.getSalesDao().deleteSaleById(saleId);

        }
        return count;
    }
    
    
}
