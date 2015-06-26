/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsEmployee;
import TIMS.app.lib.hbm.TimsUser;
import java.io.Serializable;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class BaseDaoTest {

    public static void main(String args[]) {
        BaseDao baseDao = new BaseDao();

        TimsEmployee user = new TimsEmployee();
        user.setFirstName("nuwa nwua nuwa");
        user.setLastName("Malsha Nuwan");

        Object o = baseDao.saveEntity(user);
        user = (TimsEmployee) o;
        Integer i = user.getId();
        System.out.println("Insert -> user id : " + user.getId());
        System.out.println("user name : " + user.getFirstName());

        user = (TimsEmployee) baseDao.getEntityByPrimaryKey(TimsEmployee.class, user.getId());
        System.out.println("Select -> user id : " + user.getId());

        user.setFirstName("Nuwan Nuwan");
//        user = (TimsEmployee) baseDao.updateEntity(user);
        System.out.println("updateEntity -> user name : " + user.getFirstName());
        System.out.println("user id : " + user.getId() + " is deleting");

        
        

//        baseDao.deleteEntity(user);
    }
}
