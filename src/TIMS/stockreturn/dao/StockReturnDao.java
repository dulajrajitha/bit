/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.stockreturn.dao;

import TIMS.salesreturn.dao.*;
import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsStockReturn;
import java.util.List;

/**
 *
 * @author Sithara Gunawardana
 */
public class StockReturnDao extends BaseDao {

    TimsStockReturn stockReturn = null;

    public StockReturnDao() {
    }

    public StockReturnDao(TimsStockReturn stockReturn) {
        this.stockReturn = stockReturn;
    }

    public TimsStockReturn saveStockReturn() {
        return this.saveStockReturn(this.stockReturn);
    }

    public TimsStockReturn saveStockReturn(TimsStockReturn stockReturn) {
        return (TimsStockReturn) saveEntity(stockReturn);

    }

    public TimsStockReturn updateStockReturn(TimsStockReturn stockReturn) {
        return (TimsStockReturn) updateEntity(stockReturn);
    }

    public TimsStockReturn updateStockReturn() {
        return this.updateStockReturn(this.stockReturn);
    }

    public TimsStockReturn getStockReturnByCode(Integer code) {
        return (TimsStockReturn) this.getEntityByPrimaryKey(TimsStockReturn.class, code);
    }

    public List getAllStockReturns() {
        String sql = "FROM  TimsStockReturn";
        return this.executeQuery(sql, false);
    }

    public int deleteStockReturnById(Integer code) {
        return this.deletEntityByPrimaryKey(TimsStockReturn.class, code);
    }
}
