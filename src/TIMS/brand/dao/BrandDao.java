/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsBarnd;
import java.util.List;

/**
 *
 * @author Damith
 */
public class BrandDao extends BaseDao {

    TimsBarnd barnd = null;

    public TimsBarnd getBarnd() {
        if (this.barnd == null) {
            this.barnd = new TimsBarnd();
        }
        return barnd;
    }

    public void setBarnd(TimsBarnd barnd) {
        this.barnd = barnd;
    }

    public TimsBarnd saveBrand(TimsBarnd barnd) {
        return (TimsBarnd) this.saveEntity(barnd);
    }

    public TimsBarnd saveBrand() {
        return this.saveBrand(this.barnd);
    }

    public TimsBarnd updateBrand(TimsBarnd barnd) {
        return (TimsBarnd) updateEntity(barnd);
    }

    public TimsBarnd updateBrand() {
        return this.updateBrand(this.barnd);
    }

    public TimsBarnd getBrandsByCode(Integer code) {
        return (TimsBarnd) this.getEntityByPrimaryKey(TimsBarnd.class, code);
    }

    public List getAllBrands() {
        String sql = "FROM  TimsBarnd";
        return this.executeQuery(sql, false);
    }

    public int deleteBrandById(Integer brandid) {
        return this.deletEntityByPrimaryKey(TimsBarnd.class, brandid);
    }
}
