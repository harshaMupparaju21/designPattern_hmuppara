import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Product[] products;

	private Person thePerson;

	private UserInfoItem userInfoItem;

	private List<String> sellerItems = new ArrayList<String>();

	public boolean login() throws Exception {
		Login loginValidation = new Login();
		int user = loginValidation.login();
		if (user == 0 || user == 1){
			this.UserType = user;
			this.userInfoItem = loginValidation.getUserInfoItem();
			return true;
		}
		return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) throws Exception {
		if (this.UserType == 1){
			thePerson = new Seller(userinfoitem, this.sellerItems);
			thePerson.showMenu();
		} else if (this.UserType == 0){
			thePerson = new Buyer(userInfoItem);
		}
	}

	public void createProductList() throws Exception {
		theProductList = new ClassProductList();
		this.products = theProductList.getProductList();
	}

	public void AttachProductToUser() throws Exception {

	}

	public void displayProductsByProductType() throws Exception {
		Scanner productInput = new Scanner(System.in);
		System.out.println("Select a Product(Enter 0 for Meat and 1 for Produce) : ");
		String productType = productInput.nextLine();

		int productType1 = -1;

		try {
			productType1 = Integer.parseInt(productType);

		} catch (NumberFormatException e){
			System.out.println("Please enter a correct value.");
			this.displayProductsByProductType();
		}

		if(productType1 == 0){
			MeatProductMenu meatProductMenu =  new MeatProductMenu(productType1, this.products);
			meatProductMenu.getMeatItems();
			meatProductMenu.showMenu();
		}else if(productType1 == 1){
				ProduceProductMenu produceProductMenu = new ProduceProductMenu(productType1, this.products);
				produceProductMenu.getProduceItems();
				produceProductMenu.showMenu();
		}else{
			    System.out.println("Please enter a correct value.");
				this.displayProductsByProductType();
		}
	}

	public Product SelectProduct() {
		return null;
	}
	public void productOperation() {

	}

	public void showMenuToUser() throws Exception {
		if(this.UserType == 0){
			this.displayProductsByProductType();
		} else if (this.UserType == 1){
			String current_dir = System.getProperty("user.dir");

			File userProductFile = new File(current_dir+"/src/UserProduct.txt");
			BufferedReader userProduct_br = new BufferedReader(new FileReader(userProductFile));

			String userProductInfo;
			while ((userProductInfo = userProduct_br.readLine()) != null) {

				String[] userDetails = userProductInfo.split(":");
				String username = userDetails[0];
				String selectedItem = userDetails[1];
				if (this.userInfoItem.getUserName().equals(username)) {
						this.sellerItems.add(selectedItem);
				}
			}
			this.createUser(userInfoItem);
		}
	}

	public Product[] getProducts() {
		return products;
	}

	public int getUserType() {
		return UserType;
	}
}
