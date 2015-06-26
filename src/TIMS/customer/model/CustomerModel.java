/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.customer.model;

import TIMS.app.lib.hbm.TimsCustomer;
import TIMS.customer.dao.CustomerDao;
import TIMS.customer.dto.CustomerComboItem;
import TIMS.customer.dto.CustomerDto;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sithara Gunawardana
 */
public class CustomerModel {

    protected CustomerDao customerDao = null;

    public CustomerDao getCustomerDao() {
        if (this.customerDao == null) {
            this.customerDao = new CustomerDao();
        }
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    // save customer
    public TimsCustomer saveCustomer(CustomerDto customerDto) {

        TimsCustomer customer = null;
        TimsCustomer newCustomer = null;
        if (customerDto.getCode() == null) {
            customer = new TimsCustomer();
        } else {
            customer = getCustomerByCode(customerDto.getCode());
        }
        customer.setName(customerDto.getName());
        customer.setOtherName(customerDto.getOtherName());
        customer.setCity(customerDto.getCity());
        customer.setEmail(customerDto.getEmail());
        customer.setFax(customerDto.getFax());
        customer.setMobileNo(customerDto.getMobile());
        customer.setTelephone(customerDto.getTel());
        customer.setPobox(customerDto.getPobox());
        customer.setStreet(customerDto.getStreet());
        customer.setType(customerDto.getType());
        customer.setOther(customerDto.getOther());

        System.out.println("customerDto.getCode()------>" + customerDto.getCode());
        if (customerDto.getCode() == null) {
            newCustomer = this.getCustomerDao().saveCustomer(customer);
        } else {
            customerDto.setCode(customerDto.getCode());
            newCustomer = this.getCustomerDao().updateCustomer(customer);
        }
        System.out.println("newCustomer---code-->" + newCustomer.getCode());
        return newCustomer;
    }

    // select customer from code
    private TimsCustomer getCustomerByCode(Integer code) {
        return this.getCustomerDao().getCustomerByCode(code);
    }

    // load customer for view to the table
    public DefaultTableModel loadCustomersData() {

        List data = this.getCustomerDao().getAllCustomers();
        Object columnNames[] = {"Select", "Code", "Name", "Othrer Name", "Email", "Telephone", "Mobile", "Type", "Fax", "Street", "City", "PoBox", "Others"};

        Object rowData[][] = new Object[data.size()][columnNames.length];

        for (int i = 0; i < data.size(); i++) {
            TimsCustomer customers = (TimsCustomer) data.get(i);
            Object o[] = this.getDataRow(customers);
            rowData[i] = o;
        }

        //create table model with all the data get from the DB
        /**
         * inner class for create new table model with all DB Sx data
         */
        DefaultTableModel model = new DefaultTableModel(rowData, columnNames) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0 ? true : false;
            }

            @Override
            public Class<?> getColumnClass(int col) {
                switch (col) {
                    case 0:
                        return Boolean.class;
                    case 1:
                        return Integer.class;
                    case 2:
                        return String.class;
                    case 3:
                        return Integer.class;
                    default:
                        return String.class;
                }

            }
        };
        return model;
    }

    private Object[] getDataRow(TimsCustomer customers) {
        Object o[] = {false, customers.getCode(), customers.getName(), customers.getOtherName(),
            customers.getEmail(), customers.getTelephone(), customers.getMobileNo(), customers.getType(),
            customers.getFax(), customers.getStreet(), customers.getCity(), customers.getPobox(), customers.getOther()};
        return o;
    }// delete the customer

    public int deleteCustomers(ArrayList<Integer> customerIds) {
        int count = 0;
        for (Integer customersid : customerIds) {
            count = count + this.getCustomerDao().deleteCustomerById(customersid);

        }
        return count;
    }

    //for dropdown cox
    public List getAllCustomersList() {
        return this.getCustomerDao().getAllCustomers();
    }

    public CustomerComboItem[] getCustomerComboItem() {
        List customerList = this.getAllCustomersList();
        CustomerComboItem customerComboItem[] = new CustomerComboItem[customerList.size()];
        int i = 0;
        for (Object object : customerList) {
            customerComboItem[i++] = new CustomerComboItem((TimsCustomer) object);
        }
        return customerComboItem;
    }
}
