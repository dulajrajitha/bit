/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.model;

import TIMS.app.auth.dao.UserDao;
import TIMS.app.auth.dto.UserDto;
import TIMS.app.lib.User;
import TIMS.app.lib.UserManager;
import TIMS.app.lib.hbm.TimsUser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class UserModel {

    protected UserDao userDao;
    protected UserManager userManager;

    public UserManager getUserManager() {
        if (userManager == null) {
            userManager = UserManager.getUserManager();
        }
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    /**
     *
     * @return UserDao
     */
    public UserDao getUserDao() {
        if (this.userDao == null) {
            this.userDao = new UserDao();
        }
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String generatePassword(TimsUser tu) {
        this.getUserManager().setUser(new User(tu));
        return this.getUserManager().getUser().generatePassword();
    }

    public TimsUser saveUser(UserDto user) {
        TimsUser tu;
        if (user.getUserId() != null) {
            tu = this.getUserByUserId(user.getUserId());
        } else {
            tu = new TimsUser();
        }
        tu.setUserName(user.getUserName());
        if (user.getPassword().length > 0) {
            tu.setPassword(user.getPassword());
            User u = new User(tu);
            tu.setPassword(u.generatePassword());
        }
        tu.setStatus(user.isStatus() ? 1 : 0);
        return (TimsUser) this.getUserDao().saveUser(tu);
    }

    public DefaultTableModel loadUserData() {
        List data = this.getUserDao().getAllUsers();
        Object columnNames[] = {"Select", "User ID", "Username", "Status"};

        Object rowData[][] = new Object[data.size()][columnNames.length];

        for (int i = 0; i < data.size(); i++) {
            TimsUser user = (TimsUser) data.get(i);
            Object o[] = this.getDataRow(user);
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

    public Object[] getDataRow(TimsUser user) {
        Object o[] = {new Boolean(false), user.getId(), user.getUserName(), user.getStatus()};
        return o;

    }

    public TimsUser getUserByUserId(Integer userId) {
        return this.getUserDao().getUserByUserId(userId);
    }

    public int deleteUsers(ArrayList<Integer> userIds) {
        int count = 0;
        for (Integer userid : userIds) {
            count = count + this.getUserDao().deleteUserById(userid);

        }
        return count;
    }
}
