/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.purches.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsPurches;
import TIMS.purches.dto.PurchaseDto;
import TIMS.purches.model.PurchaseModel;

/**
 *
 * @author Sithara Gunawaradana
 */
public class SavePurchaseController extends BaseController {

    protected PurchaseModel purchaseModel = null;

    public PurchaseModel getPurchaseModel() {
        if (this.purchaseModel == null) {
            this.purchaseModel = new PurchaseModel();
        }
        return purchaseModel;
    }

    public void setPurchaseModel(PurchaseModel purchaseModel) {
        this.purchaseModel = purchaseModel;
    }

    public void savePurchase(PurchaseDto purchaseDto) {
        TimsPurches savePurches = this.getPurchaseModel().savePerchase(purchaseDto);

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
//        AddPurchaseController addPurchaseController = new AddPurchaseController(dto);
//        addPurchaseController.execute();
    }

    @Override
    public void execute() {
    }
}
