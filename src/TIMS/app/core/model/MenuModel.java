/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.core.model;

import TIMS.app.config.Config;
import TIMS.app.config.Routes;
import TIMS.app.core.dao.MenuDao;
import TIMS.app.lib.hbm.TimsMenu;
import TIMS.app.lib.hbm.TimsMenuItem;
import TIMS.app.lib.hbm.TimsScreen;
import java.util.Arrays;
import java.util.Set;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class MenuModel {

    protected MenuDao menuDao;
    protected Routes routes;

    /**
     * Get MenuDao object
     *
     * @return MenuDao
     */
    public MenuDao getMenuDao() {
        if (menuDao == null) {
            menuDao = new MenuDao();
        }
        return menuDao;
    }

    public void setMenuDao(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    /**
     *
     * @return Routes
     */
    public Routes getRoutes() {
        if (routes == null) {
            routes = Routes.getRoutes();
        }
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }

    public JMenuBar getMenuBarByMenyName(String menuName) {

        TimsMenu timsMenu = this.getMenuDao().getMenuByName(menuName);
        Set menuItemset = timsMenu.getTimsMenuItems();

        TimsMenuItem timsMenuItems[] = new TimsMenuItem[menuItemset.size()];
        int i = 0;
        for (Object o : menuItemset) {
            timsMenuItems[i] = (TimsMenuItem) o;
            i++;
        }

        Arrays.sort(timsMenuItems);

        JMenuBar menubar = new JMenuBar();
        for (Object menuItem : timsMenuItems) {
            if (menuItem instanceof TimsMenuItem) {
                TimsMenuItem item = (TimsMenuItem) menuItem;
                menubar.add(this.getMenu(item));
            }

        }
        return menubar;
    }

    protected JMenuItem getMenu(TimsMenuItem menuItem) {
        if (menuItem.getTimsMenuItems().size() > 0) {
            JMenu jm = new JMenu(menuItem.getName());

            Set menuItemset = menuItem.getTimsMenuItems();

            TimsMenuItem timsMenuItems[] = new TimsMenuItem[menuItemset.size()];
            int i = 0;
            for (Object o : menuItemset) {
                timsMenuItems[i] = (TimsMenuItem) o;
                i++;
            }

            Arrays.sort(timsMenuItems);

            for (Object tmi : timsMenuItems) {
                if (tmi instanceof TimsMenuItem) {
                    TimsMenuItem timsMenuItem = (TimsMenuItem) tmi;
                    jm.insert(this.getMenu(timsMenuItem), timsMenuItem.getPossition());
                }
            }
            jm.setToolTipText(menuItem.getDescription());
            return jm;
        } else {
            JMenuItem jMenuItem = new JMenuItem(menuItem.getName());
            jMenuItem.setToolTipText(menuItem.getDescription());
            TimsScreen screen = menuItem.getTimsScreen();
            if (screen != null) {
                String action = screen.getUrl();
                if (action != null) {
                    jMenuItem.addActionListener(this.getRoutes().getRouteAction(action));
                }
            }
            return jMenuItem;
        }
    }
}
