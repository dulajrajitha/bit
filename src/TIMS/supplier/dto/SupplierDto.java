/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.dto;

/**
 *
 * @author Damith
 */
public class SupplierDto {

    private String name;
    private String otherName;
    private String pobox;
    private String street;
    private String city;
    private Integer tel;
    private Integer mobile;
    private Integer fax;
    private String email;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setCode(String code) {
        try {
            if (code != null && !code.equals("")) {
                this.code = Integer.parseInt(code);
            }
        } catch (Exception e) {
            this.code = 0;
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFax() {
        return fax;
    }

    public void setFax(String fax) {
        try {
            if (fax != null && !fax.equals("")) {
                this.fax = Integer.parseInt(fax);
            }
        } catch (Exception e) {
            this.fax = 0;
        }

    }

    public void setFax(Integer fax) {
        this.fax = fax;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        try {
            if (mobile != null && !mobile.equals("")) {
                this.mobile = Integer.parseInt(mobile);
            }
        } catch (Exception e) {
            this.mobile = 0;
        }
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(String tel) {
        try {
            if (tel != null && !tel.equals("")) {
                this.tel = Integer.parseInt(tel);
            }
        } catch (Exception e) {
            this.tel = 0;
        }
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }
}
