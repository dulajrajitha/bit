/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.purches.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsPurches;
import java.util.List;

/**
 *
 * @author Sithara Gunawardana
 */
public class PerchaseDao extends BaseDao{
    TimsPurches purchase = null;
    
    public TimsPurches savePurchase() {
        return this.savePurchase(this.purchase);
    }

    public TimsPurches savePurchase(TimsPurches purchase) {
        return (TimsPurches) saveEntity(purchase);
    }

    public TimsPurches updatePurchase() {
        return this.updatePurchase(this.purchase);
    }

    public TimsPurches updatePurchase(TimsPurches purchase) {
        return (TimsPurches) updateEntity(purchase);
    }

    public TimsPurches getPurchaseByCode(Integer code) {
        return (TimsPurches) this.getEntityByPrimaryKey(TimsPurches.class, code);
    }

    public List getAllPurchases() {
        String sql = "FROM  TimsPurches";
        return this.executeQuery(sql, false);
    }

    public int deleteCustomerById(Integer perchaseid) {
        return this.deletEntityByPrimaryKey(TimsPurches.class, perchaseid);
    }
} 
