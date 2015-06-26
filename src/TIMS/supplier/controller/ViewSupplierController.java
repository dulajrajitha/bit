/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.supplier.dto.SupplierDto;
import TIMS.supplier.model.SupplierModel;
import TIMS.supplier.view.SupplierDetails;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Damith
 */
public class ViewSupplierController extends BaseController {

    protected SupplierDetails details = null;
    protected TableModel tableModel = null;
    protected SupplierModel model = null;

    public SupplierModel getModel() {
        if(this.model == null){
            this.model = new SupplierModel();
        }
        return model;
    }

    public void setModel(SupplierModel model) {
        this.model = model;
    }

    public SupplierDetails getDetails() {
        if (this.details == null) {
            this.details = new SupplierDetails();
        }
        return details;
    }

    public void setDetails(SupplierDetails details) {
        this.details = details;
    }

    public TableModel getTableModel() {
        if (tableModel == null) {
            tableModel = this.loadSupplierTableData();
        }
        return tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }
     
     
    @Override
    public void execute() {
        this.viewSuppliersList();
    }

    private void viewSuppliersList() {
        this.getMainPanel().removeAll();
        this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
        SupplierDetails list = this.getDetails();
        this.bindDoubleClickToEventToTable();        
        list.getSupplierListTB().setModel(this.getTableModel());
        this.getMainPanel().add(list);
        this.getTemplate().pack();
        this.getTemplate().render();
    }

    
    private TableModel loadSupplierTableData() {
        return this.getModel().loadSuppliesData();
    }

    private void bindDoubleClickToEventToTable() {
        
        JTable table = this.getDetails().getSupplierListTB();
        
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2){                     
                    JTable tablee = (JTable) e.getSource();
                    int row = tablee.getSelectedRow();
                    Integer code = (Integer) tablee.getModel().getValueAt(row, 1);                    
                    String name = tablee.getModel().getValueAt(row, 2).toString();                    
                    String otherName = (String) tablee.getModel().getValueAt(row, 3);
                    Integer telephone = (Integer) tablee.getModel().getValueAt(row, 4);                    
                    Integer mobile = (Integer) tablee.getModel().getValueAt(row, 5);                    
                    String poBox = tablee.getModel().getValueAt(row, 6).toString();                    
                    String email = (String) tablee.getModel().getValueAt(row, 7);
                    String street = tablee.getModel().getValueAt(row, 8).toString();                    
                    String city = (String) tablee.getModel().getValueAt(row, 9);
                    Integer fax = (Integer) tablee.getModel().getValueAt(row, 10);                    
                    
                    SupplierDto sdto = new SupplierDto();
                    sdto.setCode(code);
                    sdto.setName(name);
                    sdto.setOtherName(otherName);
                    sdto.setTel(telephone);
                    sdto.setMobile(mobile);
                    sdto.setPobox(poBox);
                    sdto.setEmail(email);
                    sdto.setStreet(street);
                    sdto.setCity(city);
                    sdto.setFax(fax);
                    
                    (new AddSupplierController(sdto)).execute();                    
                }                
            }            
        });       
    }
    
}
