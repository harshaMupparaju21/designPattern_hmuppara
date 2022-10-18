import java.io.*;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	public Product[] products;

	private Person thePerson;

	public boolean login() throws Exception {
		Login loginValidation = new Login();
		int user = loginValidation.login();
		if (user == 0 || user == 1){
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

	}

	public void createProductList() throws Exception {
		theProductList = new ClassProductList();
		products = theProductList.getProductList();
	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
