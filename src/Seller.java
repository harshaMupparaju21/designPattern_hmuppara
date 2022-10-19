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
			for(String item : sellerItems){
				System.out.println(item);
			}

	}

	@Override
	public void showComBoxes() {

	}

	public ProductMenu CreateProductMenu() {


		return null;
	}

}
