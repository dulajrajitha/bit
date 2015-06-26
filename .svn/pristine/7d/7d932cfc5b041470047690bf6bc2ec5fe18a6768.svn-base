/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.product.view.ProductForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Damith
 */
public class AddProductController extends BaseController{

    public AddProductController(){
        
    }
    public AddProductController(ActionEvent e){
        super(e);
    }
    
    @Override
    public void execute() {
       try{
            this.setAddProductScreen();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }

    private void setAddProductScreen() {
        
        try{
            ProductForm productForm = new ProductForm();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(productForm);
            this.getTemplate().pack();
            this.getTemplate().render();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }
    
}
