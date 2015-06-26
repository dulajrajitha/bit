/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsProduct;
import TIMS.product.dto.ProductDto;
import TIMS.product.model.ProductModel;

/**
 *
 * @author Sithara Gunawaradana
 */
public class SaveProductController extends BaseController {

    protected ProductModel productModel = null;

    public ProductModel getProductModel() {
        if (this.productModel == null) {
            this.productModel = new ProductModel();
        }
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public void saveProduct(ProductDto productDto) {
        TimsProduct saveProduct = this.getProductModel().saveProduct(productDto);
        ProductDto dto = new ProductDto();      
        dto.setCode(saveProduct.getCode());
        dto.setDescription(saveProduct.getDescription());
        dto.setName(saveProduct.getName());
       // dto.setProductTypeCode(saveProduct.getTimsProductType());
        dto.setSize(saveProduct.getSize());
      try    
    {    AddProductController addProductController = new AddProductController(dto);
         addProductController.execute();
    }catch(Exception e){
        System.out.println("error ----->"+e);
    }
    }

    @Override
    public void execute() {
    }
}
