import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct = null;

	private int nProductCategory = -1;

	private ClassProductList theProductList;

	private Product[] products;

	private Person thePerson;

	private UserInfoItem userInfoItem;

	private List<String> meatItems;

	private  List<String> produceItems;

	private List<String> sellerItems = new ArrayList<String>();

	private ProductMenu productMenu;

	public boolean login() throws Exception {
		Login loginValidation = new Login();
		int user = loginValidation.login();
		if (user == 0 || user == 1){
			this.UserType = user;
			this.userInfoItem = loginValidation.getUserInfoItem();
			System.out.println("Login is Successful");
			return true;
		}
		System.out.println("Username/Password is incorrect");
		this.login();
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
		if (userinfoitem.getUserType() == 1){
			thePerson = new Seller(userinfoitem, this.products);
		} else if (userinfoitem.getUserType() == 0){
			thePerson = new Buyer(userInfoItem, this.products);
		}
		this.showMenuToUser();
	}

	public void createProductList() throws Exception {
		theProductList = new ClassProductList();
		this.products = theProductList.getProductList();
	}

	public void AttachProductToUser() throws Exception {
		  Product selectedProduct = this.SelectProduct();
          UserProduct userProduct = new UserProduct(this.userInfoItem.getUserName(),
				  									selectedProduct.getProductName(), this.nProductCategory);
		  System.out.println("You have selected "+userProduct.getProduct());

	}

	public Product SelectProduct() {
		Scanner productInput = new Scanner(System.in);
		if(nProductCategory == 0){
			System.out.println("Select a Meat Item (Enter number to select a product) : ");
		} else if(nProductCategory == 1){
			System.out.println("Select a Produce Item(Enter number to select a product) : ");
		} else{
			System.out.println("Select an Item to sell : ");
		}

		String product = productInput.nextLine();

		int index = -1;
		try {
			index = Integer.parseInt(product);
		} catch (NumberFormatException e){
			System.out.println("Please enter a correct value.");
			this.SelectProduct();
		}

		if(this.nProductCategory == 0){
			this.theSelectedProduct = new Product(this.meatItems.get((index)-1), "Meat", 0);
		}else if (this.nProductCategory == 1){
			 this.theSelectedProduct = new Product(this.produceItems.get((index)-1), "Produce", 1);
		} else {
			this.theSelectedProduct = new Product(this.sellerItems.get((index)-1));
		}

		return theSelectedProduct;
	}

	public void productOperation() {

	}

	public void showMenuToUser() throws Exception {

		Scanner productInput = new Scanner(System.in);
		System.out.println("Select a Product(Enter 0 for Meat and 1 for Produce) : ");

		String productType = productInput.nextLine();

		try {
			this.nProductCategory = Integer.parseInt(productType);
		} catch (NumberFormatException e){
			System.out.println("Please enter a correct value.");
		    this.showMenuToUser();
		}

		this.productMenu = thePerson.CreateProductMenu(this.nProductCategory);
		this.productMenu.showMenu();

		if(nProductCategory == 0){
			this.meatItems = new MeatProductMenu(this.nProductCategory, this.products).getMeatItems();
		}else if(nProductCategory == 1){
			this.produceItems = new ProduceProductMenu(this.nProductCategory, this.products).getProduceItems();
		}
	}


	public Product[] getProducts() {
		return products;
	}


	public UserInfoItem getUserInfoItem() {
		return userInfoItem;
	}

	public int getUserType() {
		return UserType;
	}
}
