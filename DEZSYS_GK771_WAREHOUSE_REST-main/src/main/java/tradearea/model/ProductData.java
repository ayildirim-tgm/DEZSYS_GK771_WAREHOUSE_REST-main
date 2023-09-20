package tradearea.model;

public class ProductData {

    private String productName;
    private String productId;
    private String productAmount;
    private String productCategory;

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductId() {
        return this.productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductAmount() {
        return this.productAmount;
    }
    public void setProductAmount(String amount) {
        this.productAmount = amount;
    }
    public String getProductCategory() {
        return this.productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
