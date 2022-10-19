public class Buyer extends Person {

	private Person person;

    private UserInfoItem userInfoItem;

	private ProductMenu productMenu;

	public Buyer(UserInfoItem userInfoItem) {
		this.userInfoItem = userInfoItem;
	}

	public void showMenu() {

	}

	@Override
	public void showComBoxes() {

	}

	/**
	 *  
	 */
	public ProductMenu CreateProductMenu(int productType) {
		if(productType == 0){
			this.productMenu = new MeatProductMenu(productType);
		} else if (productType == 1){
			this.productMenu = new ProduceProductMenu(productType);
		}
		return productMenu;
	}

}
