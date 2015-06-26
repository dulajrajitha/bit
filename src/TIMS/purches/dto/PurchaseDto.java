/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.purches.dto;

/**
 *
 * @author Sithara Gunawardana
 */
public class PurchaseDto {
   
    private Integer code;
    private Float rate;
    private Integer quantity;
    private Integer invoiceNo;
    private Integer productCode;
    private Double discount;
    private Double tax;
    private Integer brandCode;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public Integer getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }
    public void setBrandCode(String brandCode) {
      try {
            if (brandCode != null && !brandCode.equals("")) {
                this.brandCode = Integer.parseInt(brandCode);
            }
       } catch (Exception e) {
            this.brandCode = 0;
        }
    }
    
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setDiscount(String discount) {
        try {
            if (discount != null && !discount.equals("")) {
                this.discount = Double.parseDouble(discount);
            }
        } catch (Exception e) {
            this.discount = 0.0;
        }
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    public void setTax(String tax) {
        try {
            if (tax != null && !tax.equals("")) {
                this.tax = Double.parseDouble(tax);
            }
        } catch (Exception e) {
            this.tax = 0.0;
        }
    }
    
    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        try {
            if (invoiceNo != null && !invoiceNo.equals("")) {
                this.invoiceNo = Integer.parseInt(invoiceNo);
            }
        } catch (Exception e) {
            this.invoiceNo = 0;
        }
    }
    
    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public void setProductCode(String productCode) {
        try {
            if (productCode != null && !productCode.equals("")) {
                this.productCode = Integer.parseInt(productCode);
            }
        } catch (Exception e) {
            this.productCode = 0;
        }
    }
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public void setQuantity(String quantity) {
        try {
            if (quantity != null && !quantity.equals("")) {
                this.quantity = Integer.parseInt(quantity);
            }
        } catch (Exception e) {
            this.quantity = 0;
        }
    }
    
    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
    
    public void setRate(String rate) {
        try {
            if (rate != null && !rate.equals("")) {
                this.rate = Float.parseFloat(rate);
            }
        } catch (Exception e) {
            this.rate = 0.0f;
        }
    }
}
