public class Product {

	private Trading trading;

	private ClassProductList classProductList;

	private String productName;

	private String productTypeName;

	private int productType;

	public Product(String productName, String productTypeName, int productType) {
		this.productName = productName;
		this.productTypeName = productTypeName;
		this.productType = productType;
	}

	public  Product(String productName){
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}
}
