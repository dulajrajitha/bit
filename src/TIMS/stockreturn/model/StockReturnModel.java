/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.stockreturn.model;

import TIMS.salesreturn.model.*;
import TIMS.app.lib.hbm.TimsSaleReturn;
import TIMS.app.lib.hbm.TimsStockReturn;
import TIMS.salesreturn.dao.SalesReturnDao;
import TIMS.salesreturn.dto.SalesReturnDto;
import TIMS.stockreturn.dao.StockReturnDao;
import TIMS.stockreturn.dto.StockReturnDto;
import TIMS.supplier.dao.SupplierDao;
import TIMS.supplier.dto.SupplierComboItem;
import TIMS.supplier.dto.SupplierDto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sithara Gunawardana
 */
public class StockReturnModel {

    public void StockReturnModel(StockReturnDto stockReturnDto) {
        
    }
    protected StockReturnDao stockReturnDao = null;

    public StockReturnDao getStockReturnDao() {
        if (this.stockReturnDao == null) {
            this.stockReturnDao = new StockReturnDao();
        }
        return stockReturnDao;
    }

    public void setStockReturnDao(StockReturnDao stockReturnDao) {
        this.stockReturnDao = stockReturnDao;
    }

    public TimsStockReturn saveStockReturn(StockReturnDto stockReturnDto) {

        TimsStockReturn timsStockReturn = new TimsStockReturn();
        timsStockReturn.setCode(stockReturnDto.getCode());
        timsStockReturn.setReason(stockReturnDto.getReason());
        timsStockReturn.setQty(stockReturnDto.getQuantity());
        timsStockReturn.setRate(stockReturnDto.getRate());
       // timsStockReturn.setTimsBarnd(stockReturnDto.getBrandCode().toString());
        //timsStockReturn.setTimsInvoiceByInvoiceNo(stockReturnDto.getInvoiceNo());
        //timsStockReturn.setTimsProduct(stockReturnDto.getProductCode().toString());
        //timsStockReturn.setTimsInvoiceByRefInvoiceNo(stockReturnDto.getRefInvoiceNo().toString());
        timsStockReturn.setOther(stockReturnDto.getOther());
        timsStockReturn.setType(stockReturnDto.getType());

        System.out.println("StockReturnDto.getCode()------>" + stockReturnDto.getCode());

        timsStockReturn = this.getStockReturnDao().saveStockReturn(timsStockReturn);

        return timsStockReturn;
    }
    
}
