/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.controller;

import TIMS.app.auth.dto.UserDto;
import TIMS.app.auth.model.UserModel;
import TIMS.app.auth.view.UserList;
import TIMS.app.core.controller.BaseController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ViewUserController extends BaseController {

    protected UserList userList;
    protected UserModel userModel;
    protected TableModel tableModel;

    public TableModel getTableModel() {
        if (tableModel == null) {
            tableModel = this.loadTableData();
        }
        return tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }

    public UserModel getUserModel() {
        if (userModel == null) {
            userModel = new UserModel();
        }
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public UserList getUserList() {
        if (userList == null) {
            userList = new UserList();
        }
        return userList;
    }

    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    @Override
    public void execute() {
        this.viewUserList();
    }

    private void viewUserList() {
        this.getMainPanel().removeAll();
        this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
        UserList list = this.getUserList();
        this.bindDoubleClickToEventToTable();
        list.getUserListTable().setModel(this.getTableModel());
        this.getMainPanel().add(list);
        this.getTemplate().pack();
        this.getTemplate().render();
    }

    public TableModel loadTableData() {
        return this.getUserModel().loadUserData();
    }

    public void bindDoubleClickToEventToTable() {
        JTable table = this.getUserList().getUserListTable();
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable tablee = (JTable) e.getSource();
                    int row = tablee.getSelectedRow();
                    Integer id = (Integer) tablee.getModel().getValueAt(row, 1);                    
                    String name = tablee.getModel().getValueAt(row, 2).toString();
                    Integer ststus = (Integer) tablee.getModel().getValueAt(row, 3);
                    UserDto ud = new UserDto();
                    ud.setUserId(id);
                    ud.setUserName(name);
                    ud.setStatus(ststus.equals(1)?true:false);
                    (new AddUserFormController(ud)).execute();
                }
            }
        });
    }
}
