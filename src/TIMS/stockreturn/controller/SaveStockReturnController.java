/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.stockreturn.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsCustomer;
import TIMS.stockreturn.dto.StockReturnDto;
import TIMS.stockreturn.model.StockReturnModel;
//import TIMS.salesreturn.dto.CustomerDto;
//import TIMS.salesreturn.model.CustomerModel;

/**
 *
 * @author Sithara Gunawardana
 */
public class SaveStockReturnController extends BaseController   {

    protected StockReturnModel stockReturnModel = null;

    public StockReturnModel getStockReturnModel() {
        if (this.stockReturnModel == null) {
            this.stockReturnModel = new StockReturnModel();
        }
        return stockReturnModel;
    }

    public void setStockReturnModel(StockReturnModel stockReturnModel) {
        this.stockReturnModel = stockReturnModel;
    }

    public void saveStockReturn(StockReturnDto stockReturnDto) {
      //  TimsCustomer saveCustomer =
                this.getStockReturnModel().saveStockReturn(stockReturnDto);

//        CustomerDto dto = new CustomerDto();        
//        
//        dto.setCode(saveCustomer.getCode());
//        dto.setCity(saveCustomer.getCity());
//        dto.setEmail(saveCustomer.getEmail());
//        dto.setFax(saveCustomer.getFax());
//        dto.setMobile(saveCustomer.getMobileNo());
//        dto.setName(saveCustomer.getName());
//        dto.setOther(saveCustomer.getOther());
//        dto.setOtherName(saveCustomer.getOtherName());
//        dto.setPobox(saveCustomer.getPobox());
//        dto.setStreet(saveCustomer.getStreet());
//        dto.setTel(saveCustomer.getTelephone());
//        dto.setType(saveCustomer.getType());
//
//        AddCustomerController addCustomerController = new AddCustomerController(dto);
//        addCustomerController.execute();
    }

    @Override
    public void execute() {
    }
}
