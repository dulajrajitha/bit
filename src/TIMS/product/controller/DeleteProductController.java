/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.customer.controller.*;
import TIMS.app.core.controller.BaseController;
import TIMS.product.model.ProductModel;
import java.util.ArrayList;

/**
 *
 * @author Sithara Gunawardana
 */
public class DeleteProductController extends BaseController {

    @Override
    public void execute() {
    }
    private ArrayList<Integer> productIds;
    protected ProductModel productModel;

    public ArrayList<Integer> getProductIds() {
        if (this.productIds == null) {
            this.productIds = new ArrayList<Integer>();
        }
        return this.productIds;
    }

    public void setProductIds(ArrayList<Integer> productIds) {
        this.productIds = productIds;
    }

    public ProductModel getProductModel() {
        if (this.productModel == null) {
            this.productModel = new ProductModel();
        }
        return this.productModel;
    }

    public void setProductModel(ProductModel productIds) {
        this.productModel = productModel;
    }

    public int deleteProduct() {
        return this.getProductModel().deleteProducts(this.getProductIds());
    }
}
