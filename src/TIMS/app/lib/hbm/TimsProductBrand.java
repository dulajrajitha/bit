package TIMS.app.lib.hbm;
// Generated May 30, 2014 10:33:11 PM by Hibernate Tools 3.2.1.GA

/**
 * TimsProductBrand generated by hbm2java
 */
public class TimsProductBrand implements java.io.Serializable {

    private TimsProductBrandId id;
    private TimsProduct timsProduct;
    private TimsBarnd timsBarnd;
    private Double purchasePrice;
    private Double sellingPrice;

    public TimsProductBrand() {
    }

    public TimsProductBrand(TimsProductBrandId id, TimsProduct timsProduct, TimsBarnd timsBarnd) {
        this.id = id;
        this.timsProduct = timsProduct;
        this.timsBarnd = timsBarnd;
    }

    public TimsProductBrand(TimsProductBrandId id, TimsProduct timsProduct, TimsBarnd timsBarnd, Double purchasePrice, Double sellingPrice) {
        this.id = id;
        this.timsProduct = timsProduct;
        this.timsBarnd = timsBarnd;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public TimsProductBrand(TimsProduct timsProduct, TimsBarnd timsBarnd, Double purchasePrice, Double sellingPrice) {
        this.timsProduct = timsProduct;
        this.timsBarnd = timsBarnd;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public TimsProductBrandId getId() {
        return id;
    }

    public void setId(TimsProductBrandId id) {
        this.id = id;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public TimsBarnd getTimsBarnd() {
        return timsBarnd;
    }

    public void setTimsBarnd(TimsBarnd timsBarnd) {
        this.timsBarnd = timsBarnd;
    }

    public TimsProduct getTimsProduct() {
        return timsProduct;
    }

    public void setTimsProduct(TimsProduct timsProduct) {
        this.timsProduct = timsProduct;
    }
}
