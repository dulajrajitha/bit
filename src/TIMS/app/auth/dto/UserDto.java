/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.dto;

import TIMS.app.lib.hbm.TimsUser;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class UserDto {
    private Integer userId;
    private String userName;
    private char [] password;
    private boolean status;

    public UserDto(TimsUser tu) {
        this.setUserName(tu.getUserName());
        this.setStatus(tu.getStatus()==1? true:false);
        this.setUserId(tu.getId());
        this.setPassword(tu.getPassword().toCharArray());
    }

    public UserDto() {
  
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
