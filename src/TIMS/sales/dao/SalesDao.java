/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsSale;
import java.util.List;

/**
 *
 * @author Sithara Gunawardana
 */
public class SalesDao extends BaseDao{
   TimsSale sale = null;

    public SalesDao() {
    }

    public SalesDao(TimsSale sale) {
        this.sale = sale;
    }

    public TimsSale saveSale() {
        return this.saveSale(this.sale);
    }

    public TimsSale saveSale(TimsSale sale) {
        return (TimsSale) saveEntity(sale);
    }

    public TimsSale updateSale() {
        return this.updateSale(this.sale);
    }

    public TimsSale updateSale(TimsSale sale) {
        return (TimsSale) updateEntity(sale);
    }

    public TimsSale getSaleByCode(Integer code) {
        return (TimsSale) this.getEntityByPrimaryKey(TimsSale.class, code);
    }

    public List getAllSales() {
        String sql = "FROM  TimsSale";
        return this.executeQuery(sql, false);
    }

    public int deleteSaleById(Integer saleid) {
        return this.deletEntityByPrimaryKey(TimsSale.class, saleid);
    }  
}
