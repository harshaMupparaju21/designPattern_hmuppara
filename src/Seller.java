public class Seller extends Person {

	private UserInfoItem userInfoItem;

	private ProductMenu productMenu;

	public Seller(UserInfoItem userInfoItem) {
		this.userInfoItem = userInfoItem;
	}
	public void showMenu() {

	}

	@Override
	public void showComBoxes() {

	}

	public ProductMenu CreateProductMenu(int productType) {
		if(productType == 0){
			this.productMenu = new MeatProductMenu(productType);
		} else if (productType == 1){
			this.productMenu = new ProduceProductMenu(productType);
		}
		return productMenu;
	}

}
