/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsInvoice;
import java.util.List;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class InvoiceDao extends BaseDao {
    
    public TimsInvoice saveInvoice(TimsInvoice invoice) {
        return (TimsInvoice) this.saveEntity(invoice);
    }
    
    public TimsInvoice getInvoiceById(Integer id) {
        return (TimsInvoice) this.getEntityByPrimaryKey(TimsInvoice.class, id);
    }

    public List getInvoiceList() {
        String sql = "FROM  TimsInvoice";
        return this.executeQuery(sql, false);
    }
}
