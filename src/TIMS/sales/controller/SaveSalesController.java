/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsSale;
import TIMS.sales.dto.SalesDto;
import TIMS.sales.model.SalesModel;

/**
 *
 * @author Damith
 */
public class SaveSalesController extends BaseController {

    protected SalesModel salesModel = null;

    public SalesModel getSalesModel() {
        if (this.salesModel == null) {
            this.salesModel = new SalesModel();
        }
        return salesModel;
    }

    public void setSalesModel(SalesModel salesModel) {
        this.salesModel = salesModel;
    }

    public void saveSales(SalesDto salesDto) {
        TimsSale saveSale = this.getSalesModel().saveSales(salesDto);
        SalesDto dto = new SalesDto();
        
        dto.setCode(saveSale.getCode());
        dto.setRate(saveSale.getRate());
        dto.setDiscount(saveSale.getDiscount());
        dto.setQuantity(saveSale.getQty());
        dto.setInvoiceNo(saveSale.getTimsInvoice());
        dto.setProductCode(saveSale.getTimsProduct());
        dto.setBrandCode(saveSale.getTimsBarnd());
        
        AddSalesController addSalesController = new AddSalesController(dto);
        addSalesController.execute();
        
    }

    @Override
    public void execute() {
    }
}
