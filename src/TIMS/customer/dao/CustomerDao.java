/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.customer.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsCustomer;
import javassist.tools.reflect.Reflection;

import java.util.List;

/**
 * @author Sithara Gunawardana
 */
public class CustomerDao extends BaseDao {

    TimsCustomer customer = null;

    public CustomerDao() {

    }

    public CustomerDao(TimsCustomer customer) {
        this.customer = customer;
    }

    public TimsCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(TimsCustomer customer) {
        this.customer = customer;
    }

    public TimsCustomer saveCustomer() {

        return this.saveCustomer(this.customer);
    }

    public TimsCustomer saveCustomer(TimsCustomer customer) {

        return (TimsCustomer) saveEntity(customer);
    }

    public TimsCustomer updateCustomer() {

        return this.updateCustomer(this.customer);
    }

    public TimsCustomer updateCustomer(TimsCustomer customer) {

        return (TimsCustomer) updateEntity(customer);
    }

    public TimsCustomer getCustomerByCode(Integer code) {

        return (TimsCustomer) this.getEntityByPrimaryKey(TimsCustomer.class, code);
    }

    public List getAllCustomers() {
        String sql = "FROM  TimsCustomer";
        return this.executeQuery(sql, false);
    }

    public int deleteCustomerById(Integer customersid) {
        return this.deletEntityByPrimaryKey(TimsCustomer.class, customersid);
    }
}
