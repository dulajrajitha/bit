/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.customer.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.customer.model.CustomerModel;
import java.util.ArrayList;

/**
 *
 * @author Sithara Gunawardana
 */
public class DeleteCustomersController extends BaseController {

    @Override
    public void execute() {
    }
    private ArrayList<Integer> customerIds;
    protected CustomerModel customerModel;

    public ArrayList<Integer> getCustomerIds() {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<Integer>();
        }
        return this.customerIds;
    }

    public void setCustomerIds(ArrayList<Integer> customerIds) {
        this.customerIds = customerIds;
    }

    public CustomerModel getCustomerModel() {
        if (this.customerModel == null) {
            this.customerModel = new CustomerModel();
        }
        return this.customerModel;
    }

    public void setCustomerModel(CustomerModel customerModel) {
        this.customerModel = customerModel;
    }

    public int deleteCustomers() {
        return this.getCustomerModel().deleteCustomers(this.getCustomerIds());
    }
}
