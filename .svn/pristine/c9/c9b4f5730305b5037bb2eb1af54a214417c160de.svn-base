/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.dto;

/**
 *
 * @author Damith
 */
public class BrandDto {
    
    private Integer code;
    private String name;
    private String description;
    private String other;

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
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
      
    
}
