/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.salesreturn.model;

import TIMS.app.lib.hbm.TimsSaleReturn;
import TIMS.salesreturn.dao.SalesReturnDao;
import TIMS.salesreturn.dto.SalesReturnDto;
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
public class SalesReturnModel {

    public void SalesReturnModel(SalesReturnDto salesReturnDto) {
        
    }
    protected SalesReturnDao salesReturnDao = null;

    public SalesReturnDao getSalesReturnDao() {
        if (this.salesReturnDao == null) {
            this.salesReturnDao = new SalesReturnDao();
        }
        return salesReturnDao;
    }

    public void setSalesReturnDao(SalesReturnDao salesReturnDao) {
        this.salesReturnDao = salesReturnDao;
    }

    public TimsSaleReturn saveSalesReturn(SalesReturnDto salesReturnDto) {

        TimsSaleReturn timsSaleReturn = new TimsSaleReturn();
        timsSaleReturn.setCode(salesReturnDto.getCode());
        timsSaleReturn.setReason(salesReturnDto.getReason());
        timsSaleReturn.setQty(salesReturnDto.getQuantity());
        timsSaleReturn.setRate(salesReturnDto.getRate());
        timsSaleReturn.setTimsBarnd(salesReturnDto.getBrandCode().toString());
        timsSaleReturn.setTimsInvoiceByInvoiceNo(salesReturnDto.getInvoiceNo());
        timsSaleReturn.setTimsProduct(salesReturnDto.getProductCode().toString());
        timsSaleReturn.setTimsInvoiceByRefInvoiceNo(salesReturnDto.getRefInvoiceNo().toString());
        timsSaleReturn.setOther(salesReturnDto.getOther());

        System.out.println("salesReturnDto.getCode()------>" + salesReturnDto.getCode());

        timsSaleReturn = this.getSalesReturnDao().saveSalesReturn(timsSaleReturn);

        return timsSaleReturn;
    }
    
}
