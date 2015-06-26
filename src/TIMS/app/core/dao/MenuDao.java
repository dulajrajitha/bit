/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.core.dao;

import TIMS.app.lib.hbm.TimsMenu;
import java.util.List;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class MenuDao extends BaseDao {

    public TimsMenu getMenuByName(String menuName) {
        String sql = "FROM  TimsMenu WHERE name = '" + menuName + "'";
        List menuList = this.executeQuery(sql);
        return (TimsMenu) menuList.get(0);
    }
}
