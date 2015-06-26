/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.purches.model;

import TIMS.app.lib.hbm.TimsPurches;
import TIMS.purches.dao.PerchaseDao;
import TIMS.purches.dto.PurchaseDto;

/**
 *
 * @author Sithara Gunawardana
 */
public class PurchaseModel {

    public void PurchaseModel(PurchaseDto purchaseDto) {
        
    }
    protected PerchaseDao perchaseDao = null;

    public PerchaseDao getPerchaseDao() {
        if (this.perchaseDao == null) {
            this.perchaseDao = new PerchaseDao();
        }
        return perchaseDao;
    }

    public void setPerchaseDao(PerchaseDao perchaseDao) {
        this.perchaseDao = perchaseDao;
    }

    public TimsPurches savePerchase(PurchaseDto perchaseDto) {
TimsPurches purches = null;
        TimsPurches newPurches = null;
        if (perchaseDto.getCode() == null) {
            purches = new TimsPurches();
        } else {
            purches = getPerchaseByCode(perchaseDto.getCode());
        }
        
        purches.setDiscount(perchaseDto.getDiscount().longValue());
        purches.setQty(perchaseDto.getQuantity());
        purches.setStatus(perchaseDto.getStatus());
        purches.setTax(perchaseDto.getTax().longValue());
        purches.setTimsBarnd(perchaseDto.getBrandCode());
        purches.setTimsInvoice(perchaseDto.getInvoiceNo());
        purches.setTimsProduct(perchaseDto.getProductCode());

        System.out.println("perchaseDto.getCode()------>" + perchaseDto.getCode());

       // timsPurches = this.getPerchaseDao().savePurchase(timsPurches);
        if (perchaseDto.getCode() == null) {
            newPurches = this.getPerchaseDao().savePurchase(purches);
        } else {
            perchaseDto.setCode(perchaseDto.getCode());
            newPurches = this.getPerchaseDao().updatePurchase(purches);
        }
        System.out.println("newPurches---code-->" + newPurches.getCode());
        return newPurches;
    }
     private TimsPurches getPerchaseByCode(Integer code) {
        return this.getPerchaseDao().getPurchaseByCode(code);
    }
    
}
