/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsUser;
import java.util.List;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class LoginDao extends BaseDao{

    public TimsUser getUserByUserName(String userName) throws Exception{       
        String sql = "FROM  TimsUser WHERE userName = '" + userName + "' AND status = 1";
        List menuList = this.executeQuery(sql);
        return (TimsUser) menuList.get(0);
    }
    
}
