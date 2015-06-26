/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsProduct;
import TIMS.app.lib.hbm.TimsProductGroup;
import java.util.List;

/**
 *
 * @author Damith
 */
public class ProductDao extends BaseDao {

    TimsProduct product = null;

    public ProductDao() {
    }

    public ProductDao(TimsProduct product) {
        this.product = product;
    }

    public TimsProduct saveProduct(TimsProduct timsProduct) {
        return (TimsProduct) saveEntity(timsProduct);
    }

    public TimsProduct updateProduct(TimsProduct timsProduct) {
        return (TimsProduct) updateEntity(timsProduct);
    }

    public TimsProduct saveProduct() {
        return this.saveProduct(this.product);
    }

    public TimsProduct updateProduct() {
        return this.updateProduct(this.product);
    }

    public List getAllProducts() {
        String sql = "FROM  TimsProduct";
        return this.executeQuery(sql, false);
    }

    public List getAllProductGrops() {
        
        String sql = "FROM  TimsProductGroup";
        return this.executeQuery(sql, false);
    }
    public int deleteProductById(Integer productid) {
        return this.deletEntityByPrimaryKey(TimsProduct.class, productid);
    }
}
