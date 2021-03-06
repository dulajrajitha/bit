/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.customer.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.customer.dto.CustomerDto;
import TIMS.customer.model.CustomerModel;
import TIMS.customer.view.CustomerDetails;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Sithara Gunawaradana
 */
public class ViewCustomerController extends BaseController {

    public ViewCustomerController(ActionEvent e) {
        super(e);
    }
    protected CustomerDetails customerDetails = null;
    protected TableModel tableModel = null;
    protected CustomerModel model = null;

    public ViewCustomerController() {
        
    }

    public CustomerModel getModel() {
        if (this.model == null) {
            this.model = new CustomerModel();
        }
        return model;
    }

    public void setModel(CustomerModel model) {
        this.model = model;
    }

    public TableModel getTableModel() {
        if (this.tableModel == null) {
            this.tableModel = this.loadCustomersTableData();
        }
        return tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }

    public CustomerDetails getCustomerDetails() {
        if (this.customerDetails == null) {
            this.customerDetails = new CustomerDetails();
        }
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    @Override
    public void execute() {
        this.viewCustomersList();
    }

    private void viewCustomersList() {
        this.getMainPanel().removeAll();
        this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
        CustomerDetails list = this.getCustomerDetails();
        this.bindDoubleClickToEventToTable();
        list.getCutomerTB().setModel(this.getTableModel());
        this.getMainPanel().add(list);
        this.getTemplate().pack();
        this.getTemplate().render();
    }

    private void bindDoubleClickToEventToTable() {
        JTable table = this.getCustomerDetails().getCutomerTB();
        
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                
                if (e.getClickCount() == 2){
                    JTable tablee = (JTable) e.getSource();
                    int row = tablee.getSelectedRow();
                    Integer code = (Integer) tablee.getModel().getValueAt(row, 1);                    
                    String name = tablee.getModel().getValueAt(row, 2).toString();                    
                    String otherName = (String) tablee.getModel().getValueAt(row, 3);
                    String email = (String) tablee.getModel().getValueAt(row, 4);
                    Integer telephone = (Integer) tablee.getModel().getValueAt(row, 5);                    
                    Integer mobile = (Integer) tablee.getModel().getValueAt(row, 6);                    
                    String type = tablee.getModel().getValueAt(row, 7).toString();                    
                    Integer fax = (Integer) tablee.getModel().getValueAt(row, 8);                  
                    String street = tablee.getModel().getValueAt(row, 9).toString();                    
                    String city = (String) tablee.getModel().getValueAt(row, 10);
                    String pobox = tablee.getModel().getValueAt(row, 11).toString();                    
                    String other = (String) tablee.getModel().getValueAt(row, 12);
                    
                    CustomerDto sdto = new CustomerDto();
                    sdto.setCode(code);
                    sdto.setName(name);
                    sdto.setOtherName(otherName);
                    sdto.setTel(telephone);
                    sdto.setMobile(mobile);
                    sdto.setPobox(pobox);
                    sdto.setEmail(email);
                    sdto.setStreet(street);
                    sdto.setCity(city);
                    sdto.setFax(fax);
                    sdto.setOther(other);
                    sdto.setType(type);
                    
                    (new AddCustomerController(sdto)).execute();                    
                }                
            }            
        }); 
    }

    private TableModel loadCustomersTableData() {
        return this.getModel().loadCustomersData();
    }
}
