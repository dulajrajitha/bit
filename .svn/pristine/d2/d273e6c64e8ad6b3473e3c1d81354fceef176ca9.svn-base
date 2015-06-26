/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.model;

import TIMS.app.lib.hbm.TimsProduct;
import TIMS.app.lib.hbm.TimsProductGroup;
import TIMS.product.dao.ProductDao;
import TIMS.product.dto.ProductComboItem;
import TIMS.product.dto.ProductDto;
import TIMS.product.dto.ProductGropsCheckedBox;
import TIMS.product.dto.ProductTypeCombo;
import java.util.List;


/**
 *
 * @author Damith
 */
public class ProductModel {

    protected ProductDao productDao = null;

    public ProductDao getProductDao() {
        if (this.productDao == null) {
            this.productDao = new ProductDao();
        }
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public TimsProduct saveProduct(ProductDto productDto) {

        TimsProduct timsProduct = new TimsProduct();

        timsProduct.setCode(productDto.getCode());
        timsProduct.setDescription(productDto.getDescription());
        timsProduct.setSize(productDto.getSize());


        System.out.println("productDto.getCode()------>" + productDto.getCode());

        timsProduct = this.getProductDao().saveProduct(timsProduct);

        return timsProduct;
    }

    public ProductTypeCombo[] getProductTypeCombo() {
        List list = this.getAllProducts();
        ProductTypeCombo[] productTypeCombos = new ProductTypeCombo[list.size()];

        for (int i = 0; i < list.size(); i++) {

            productTypeCombos[i] = new ProductTypeCombo((TimsProduct) list.get(i));
        }
        return productTypeCombos;
    }

    public ProductGropsCheckedBox[] getProductGropsCheckedBox() {

        List list = this.getProductDao().getAllProductGrops();

        ProductGropsCheckedBox[] gropsCheckedBox = new ProductGropsCheckedBox[list.size()];
        for (int i = 0; i < list.size(); i++) {
            gropsCheckedBox[i] = new ProductGropsCheckedBox((TimsProductGroup) list.get(i));
        }
        return gropsCheckedBox;
    }

    public List getAllProducts() {
        return this.getProductDao().getAllProducts();
    }

    public ProductComboItem[] getProductsForCombo() {
        List allProducts = getAllProducts();
        ProductComboItem[] combo = new ProductComboItem[allProducts.size()];
        for (int i = 0; i < allProducts.size(); i++) {
            combo[i] = new ProductComboItem((TimsProduct) allProducts.get(i));
        }
        return combo;
    }
}
