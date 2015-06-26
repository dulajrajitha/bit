/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.salesreturn.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsSaleReturn;
import java.util.List;

/**
 *
 * @author Sithara Gunawardana
 */
public class SalesReturnDao extends BaseDao {

    TimsSaleReturn salesReturn = null;

    public SalesReturnDao() {
    }

    public SalesReturnDao(TimsSaleReturn salesReturn) {
        this.salesReturn = salesReturn;
    }

    public TimsSaleReturn saveSalesReturn() {
        return this.saveSalesReturn(this.salesReturn);
    }

    public TimsSaleReturn saveSalesReturn(TimsSaleReturn salesReturn) {
        return (TimsSaleReturn) saveEntity(salesReturn);

    }

    public TimsSaleReturn updateSalesReturn(TimsSaleReturn salesReturn) {
        return (TimsSaleReturn) updateEntity(salesReturn);
    }

    public TimsSaleReturn updateSalesReturn() {
        return this.updateSalesReturn(this.salesReturn);
    }

    public TimsSaleReturn getSalesReturnByCode(Integer code) {
        return (TimsSaleReturn) this.getEntityByPrimaryKey(TimsSaleReturn.class, code);
    }

    public List getAllSaleReturns() {
        String sql = "FROM  TimsSaleReturn";
        return this.executeQuery(sql, false);
    }

    public int deleteSalesReturnById(Integer code) {
        return this.deletEntityByPrimaryKey(TimsSaleReturn.class, code);
    }
}
