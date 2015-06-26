/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.product.dto.ProductDto;
import TIMS.product.view.ProductForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Damith
 */
public class AddProductController extends BaseController{
    
    ProductForm form = null;

    public ProductForm getForm() {
        if (this.form == null) {
            this.form = new ProductForm();
        }
        return form;
    }

    public void setForm(ProductForm form) {
        this.form = form;
    }

    public AddProductController(){
        
    }
    public AddProductController(ActionEvent e){
        super(e);
    }
     public AddProductController(ProductDto productDto) {

        System.out.println("productDto------->" + productDto.getCode());
     //   this.getForm().setProduct_types(productDto.getProductTypeCode().toString());
        this.getForm().setPro_Size(productDto.getSize());
        this.getForm().setPro_Name(productDto.getName());
        this.getForm().setPro_Description(productDto.getDescription());
        
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
