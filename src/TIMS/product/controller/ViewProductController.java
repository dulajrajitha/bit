/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.product.model.ProductModel;
import TIMS.product.view.ProductDetails;
import TIMS.product.view.ProductForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.table.TableModel;

/**
 *
 * @author Sithara Gunawardana
 */
public class ViewProductController extends BaseController {
    
    protected TableModel tableModel = null;
    protected ProductModel model = null;
    protected ProductDetails productDetails = null;
    
    public ViewProductController(ActionEvent e) {
        super(e);
    }
    
    public ViewProductController() {
       
    }

    public ProductModel getModel() {
        if (this.model == null) {
            this.model = new ProductModel();
        }
        return model;
    }

    public void setModel(ProductModel model) {
        this.model = model;
    }

    public ProductDetails getProductDetails() {
        if (this.productDetails == null) {
            this.productDetails = new ProductDetails();
        }
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public void execute() {
         try{
            this.setViewProductScreen();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }

    private void setViewProductScreen() {
        try{
            ProductDetails productDetails = new ProductDetails();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            productDetails.getProductTB().setModel(this.getTableModel());
            this.getMainPanel().add(productDetails);
            this.getTemplate().pack();
            this.getTemplate().render();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }

     public TableModel getTableModel() {
        if (this.tableModel == null) {
            this.tableModel = this.loadProdctTableData();
        }
        return tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }
    private TableModel loadProdctTableData() {
        return this.getModel().loadProductData();
    }

    
}
