import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Seller extends Person {

	private UserInfoItem userInfoItem;

	private ProductMenu productMenu;

	private List<String> sellerItems;

	public Seller(UserInfoItem userInfoItem) {
		this.userInfoItem = userInfoItem;
	}

	public Seller(UserInfoItem userInfoItem, List<String> sellerItems) {
		this.userInfoItem = userInfoItem;
		this.sellerItems = sellerItems;
	}
	public void showMenu() {
		if (sellerItems.size() != 0){
			System.out.println("You have the following items to sell: ");
			int i = 1;
			for(String item : sellerItems) {
				System.out.println(i+". "+item);
				i++;
			}
		} else {
			System.out.println("No items to sell");
		}
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
