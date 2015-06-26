package TIMS.app.lib.hbm;
// Generated May 30, 2014 10:33:11 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TimsMenuItem generated by hbm2java
 */
public class TimsMenuItem  implements java.io.Serializable, Comparable<TimsMenuItem> {


     private Integer id;
     private TimsMenuItem timsMenuItem;
     private TimsScreen timsScreen;
     private String name;
     private String description;
     private int possition;
     private Set timsMenus = new HashSet(0);
     private Set timsMenuItems = new HashSet(0);

    public TimsMenuItem() {
    }

	
    public TimsMenuItem(int possition) {
        this.possition = possition;
    }
    public TimsMenuItem(TimsMenuItem timsMenuItem, TimsScreen timsScreen, String name, String description, int possition, Set timsMenus, Set timsMenuItems) {
       this.timsMenuItem = timsMenuItem;
       this.timsScreen = timsScreen;
       this.name = name;
       this.description = description;
       this.possition = possition;
       this.timsMenus = timsMenus;
       this.timsMenuItems = timsMenuItems;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public TimsMenuItem getTimsMenuItem() {
        return this.timsMenuItem;
    }
    
    public void setTimsMenuItem(TimsMenuItem timsMenuItem) {
        this.timsMenuItem = timsMenuItem;
    }
    public TimsScreen getTimsScreen() {
        return this.timsScreen;
    }
    
    public void setTimsScreen(TimsScreen timsScreen) {
        this.timsScreen = timsScreen;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPossition() {
        return this.possition;
    }
    
    public void setPossition(int possition) {
        this.possition = possition;
    }
    public Set getTimsMenus() {
        return this.timsMenus;
    }
    
    public void setTimsMenus(Set timsMenus) {
        this.timsMenus = timsMenus;
    }
    public Set getTimsMenuItems() {
        return this.timsMenuItems;
    }
    
    public void setTimsMenuItems(Set timsMenuItems) {
        this.timsMenuItems = timsMenuItems;
    }

    @Override
    public int compareTo(TimsMenuItem o) {
        return this.getPossition() - o.getPossition();
    }

    

}


