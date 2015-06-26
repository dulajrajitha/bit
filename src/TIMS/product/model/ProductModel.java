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
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Sithara Gunawardana
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
        timsProduct.setName(productDto.getName());
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
     public DefaultTableModel loadProductData() {
        List data = this.getProductDao().getAllProducts();
        Object columnNames[] = {"Select", "Code", "size", "Product_type_code"};

        Object rowData[][] = new Object[data.size()][columnNames.length];

        for (int i = 0; i < data.size(); i++) {
            TimsProduct customers = (TimsProduct) data.get(i);
            Object o[] = this.getDataRow(customers);
            rowData[i] = o;
        }


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
     private Object[] getDataRow(TimsProduct product) {
        Object o[] = {false, product.getCode(), product.getSize(), product.getTimsProductType()};
        return o;
    }
      public int deleteProducts(ArrayList<Integer> productIds) {
        int count = 0;
        for (Integer productId : productIds) {
            count = count + this.getProductDao().deleteProductById(productId);

        }
        return count;
    }
}
