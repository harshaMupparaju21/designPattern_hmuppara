public class Product {

	private Trading trading;

	private ClassProductList classProductList;

	private String productName;

	private String productType;

	public Product(String productName, String productType) {
		this.productName = productName;
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
}
