/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.salesreturn.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsSaleReturn;
import TIMS.salesreturn.dto.SalesReturnDto;
import TIMS.salesreturn.model.SalesReturnModel;
//import TIMS.salesreturn.dto.CustomerDto;
//import TIMS.salesreturn.model.CustomerModel;

/**
 *
 * @author Sithara Gunawardana
 */
public class SaveSalesReturnController extends BaseController  {

    protected SalesReturnModel salesReturnModel = null;

    public SalesReturnModel getSalesReturnModel() {
        if (this.salesReturnModel == null) {
            this.salesReturnModel = new SalesReturnModel();
        }
        return salesReturnModel;
    }

    public void setSalesReturnModel(SalesReturnModel salesReturnModel) {
        this.salesReturnModel = salesReturnModel;
    }

    public void saveSalesReturn(SalesReturnDto salesReturnDto) {
        TimsSaleReturn saveSalesReturn = this.getSalesReturnModel().saveSalesReturn(salesReturnDto);

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
