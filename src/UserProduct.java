public class UserProduct {
    private String user;

    private String product;

    private int productType;

    public UserProduct(String user, String product, int productType) {
        this.user = user;
        this.product = product;
        this.productType = productType;
    }


    public String getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getProductType() {
        return productType;
    }
}
