import java.io.FileNotFoundException;

public class Buyer extends Person {

	private Person person;

    private UserInfoItem userInfoItem;

	private ProductMenu productMenu;

	private Product[] products;

	private int productCategory;

	public Buyer(UserInfoItem userInfoItem, Product[] products) {
		this.userInfoItem = userInfoItem;
		this.products = products;
	}


	public void showMenu() {

	}

	@Override
	public void showComBoxes() {

	}

	public ProductMenu CreateProductMenu(int productType) {
		if(productType == 0){
			this.productMenu = new MeatProductMenu(productType, this.products);
		} else if (productType == 1){
			this.productMenu = new ProduceProductMenu(productType, this.products);
		}
		return productMenu;
	}
}
