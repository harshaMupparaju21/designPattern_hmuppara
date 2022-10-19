import java.util.ArrayList;
import java.util.List;

public class MeatProductMenu implements ProductMenu {

	private  int productType;

	private Product[] products;
	private List<String> meatProducts = new ArrayList<String>();

	public MeatProductMenu(int productType) {
		this.productType = productType;
	}

	public MeatProductMenu(int productType, Product[] products) {
		this.productType = productType;
		this.products = products;
	}


	public List<String> getMeatItems() throws Exception {

		for(Product p : products){
			if(p.getProductType() == 0){
				meatProducts.add(p.getProductName());
			}
		}
		return  meatProducts;
	}

	public void showMenu() {
		for(String meatItem : meatProducts){
			System.out.println(meatItem);
		}
	}


	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComBoxes() {

	}

}
