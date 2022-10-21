import java.util.ArrayList;
import java.util.List;

public class MeatProductMenu implements ProductMenu {

	private  int productType;

	private Product[] products;
	private List<String> meatProducts = new ArrayList<String>();


	public MeatProductMenu(int productType, Product[] products) {
		this.productType = productType;
		this.products = products;
	}

	public List<String> getMeatItems() throws Exception {
		for(Product p : this.products){
			if(p.getProductType() == 0){
				meatProducts.add(p.getProductName());
			}
		}
		return  meatProducts;
	}

	public void showMenu() throws Exception {
		List<String> meatProducts = this.getMeatItems();
		int i = 1;
		if(meatProducts.size() > 0){
			for(String meatItem : meatProducts) {
				System.out.println(i + ": " + meatItem);
				i++;
			}
		} else{
			System.out.println("No Meat Items to display");
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
