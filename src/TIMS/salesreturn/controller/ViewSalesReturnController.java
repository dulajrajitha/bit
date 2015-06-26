/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.salesreturn.controller;

import TIMS.app.core.controller.BaseController;
//import TIMS.salesreturn.dto.PurchaseDto;
//import TIMS.salesreturn.model.PurchaseModel;
import TIMS.salesreturn.view.SalesReturnDetails;
import TIMS.salesreturn.view.SalesReturn;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Sithara Gunawardana
 */
public class ViewSalesReturnController extends BaseController {

    public ViewSalesReturnController(ActionEvent e) {
        super(e);
    }
    protected SalesReturnDetails salesReturnDetails = null;
    protected TableModel tableModel = null;
  //  protected PurchaseModel model = null;

    public ViewSalesReturnController() {
        
    }

//    public PurchaseModel getModel() {
//        if (this.model == null) {
//            this.model = new PurchaseModel();
//        }
//        return model;
//    }
//
//    public void setModel(PurchaseModel model) {
//        this.model = model;
//    }

    public TableModel getTableModel() {
        if (this.tableModel == null) {
           // this.tableModel = this.loadCustomersTableData();
        }
        return tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }

    public SalesReturnDetails getSalesReturnDetails() {
        if (this.salesReturnDetails == null) {
            this.salesReturnDetails = new SalesReturnDetails();
        }
        return salesReturnDetails;
    }

    public void setPurchaseDetails(SalesReturnDetails salesReturnDetails) {
        this.salesReturnDetails = salesReturnDetails;
    }
   // 0715364320 dewage

    @Override
    public void execute() {
        this.viewSalesReturnList();
    }

    private void viewSalesReturnList() {
        SalesReturn form = new SalesReturn();
        this.getMainPanel().removeAll();
        this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
        SalesReturnDetails list = this.getSalesReturnDetails();
     //   this.bindDoubleClickToEventToTable();
       // list.getCutomerTB().setModel(this.getTableModel());
        this.getMainPanel().add(form);
        this.getTemplate().pack();
        this.getTemplate().render();
        
        
    }

//    private void bindDoubleClickToEventToTable() {
//        JTable table = this.getCustomerDetails().getCutomerTB();
//        
//        table.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                
//                if (e.getClickCount() == 2){
//                    JTable tablee = (JTable) e.getSource();
//                    int row = tablee.getSelectedRow();
//                    Integer code = (Integer) tablee.getModel().getValueAt(row, 1);                    
//                    String name = tablee.getModel().getValueAt(row, 2).toString();                    
//                    String otherName = (String) tablee.getModel().getValueAt(row, 3);
//                    String email = (String) tablee.getModel().getValueAt(row, 4);
//                    Integer telephone = (Integer) tablee.getModel().getValueAt(row, 5);                    
//                    Integer mobile = (Integer) tablee.getModel().getValueAt(row, 6);                    
//                    String type = tablee.getModel().getValueAt(row, 7).toString();                    
//                    Integer fax = (Integer) tablee.getModel().getValueAt(row, 8);                  
//                    String street = tablee.getModel().getValueAt(row, 9).toString();                    
//                    String city = (String) tablee.getModel().getValueAt(row, 10);
//                    String pobox = tablee.getModel().getValueAt(row, 11).toString();                    
//                    String other = (String) tablee.getModel().getValueAt(row, 12);
//                    
//                    CustomerDto sdto = new CustomerDto();
//                    sdto.setCode(code);
//                    sdto.setName(name);
//                    sdto.setOtherName(otherName);
//                    sdto.setTel(telephone);
//                    sdto.setMobile(mobile);
//                    sdto.setPobox(pobox);
//                    sdto.setEmail(email);
//                    sdto.setStreet(street);
//                    sdto.setCity(city);
//                    sdto.setFax(fax);
//                    sdto.setOther(other);
//                    sdto.setType(type);
//                    
//                    (new AddCustomerController(sdto)).execute();                    
//                }                
//            }            
//        }); 
//    }

//    private TableModel loadPurchaseTableData() {
//        return this.getModel().loadCustomersData();
//    }
}
