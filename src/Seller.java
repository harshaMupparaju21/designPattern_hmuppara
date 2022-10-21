import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seller extends Person {

	private UserInfoItem userInfoItem;

	private ProductMenu productMenu;

	private Product[] products;

	private List<Product> sellerProductList = new ArrayList<>();

	private Product[] sellerProductArray;

	public Seller(UserInfoItem userInfoItem, Product[] products) {
		this.userInfoItem = userInfoItem;
		this.products = products;
	}
	public void showMenu() {

	}

	@Override
	public void showComBoxes() {

	}


	public Product[] getSellerProducts() throws Exception {
		String current_dir = System.getProperty("user.dir");

		File userProductFile = new File(current_dir+"/src/UserProduct.txt");
		BufferedReader userProduct_br = new BufferedReader(new FileReader(userProductFile));

		String userProductInfo;
		while ((userProductInfo = userProduct_br.readLine()) != null) {

			String[] userDetails = userProductInfo.split(":");
			String username = userDetails[0];
			String item = userDetails[1];
			if (this.userInfoItem.getUserName().equals(username)) {
				for(Product p : this.products){
					if(p.getProductName().equalsIgnoreCase(item)){
						sellerProductList.add(new Product(p.getProductName(), p.getProductTypeName(), p.getProductType()));
					}
				}
			}
		}
		ProductIterator productIterator = new ProductIterator(this.sellerProductList, 0);
		this.sellerProductArray = new Product[this.sellerProductList.size()];
		int i = 0;

		while(productIterator.hasNext()){
			this.sellerProductArray[i] = productIterator.next();
			i++;
		}

		return this.sellerProductArray;
	}


	public ProductMenu CreateProductMenu(int productType) throws Exception {
		 Product[] products1 =  this.getSellerProducts();
		if(productType == 0){
			this.productMenu = new MeatProductMenu(productType, products1);
		} else if (productType == 1){
			this.productMenu = new ProduceProductMenu(productType, products1);
		}
		return productMenu;
	}

}
