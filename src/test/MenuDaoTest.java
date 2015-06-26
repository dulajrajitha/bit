package test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import TIMS.app.core.dao.MenuDao;
import TIMS.app.core.model.MenuModel;
import TIMS.app.lib.hbm.TimsMenu;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class MenuDaoTest {

    protected MenuDao menuDao;
    protected MenuModel menuModel;

    public MenuDaoTest() {
        this.setUp();
    }

    public static void main(String args[]) {
        MenuDaoTest mdt = new MenuDaoTest();
        mdt.testGetMenuByName();
        mdt.testGetMenuBarByMenyName();
    }

    public void setUp() {
        this.menuDao = new MenuDao();
        this.menuModel = new MenuModel();
    }

    public void testGetMenuByName() {
        TimsMenu menu = menuDao.getMenuByName("Main Menu");
        if (menu instanceof TimsMenu) {
            System.out.println(" main menu : ");
            System.out.println(menu.getTimsMenuItems());
        } else {
            System.out.println("no menu");
        }
    }

    public void testGetMenuBarByMenyName() {
        this.menuModel.getMenuBarByMenyName("Main Menu");
    }
}