import java.util.ArrayList;
import java.util.List;

public class ProduceProductMenu implements ProductMenu {

	private int productType;

	private Product[] products;

	private List<String> produceProducts = new ArrayList<String>();

	public ProduceProductMenu(int productType) {
		this.productType = productType;
	}

	public ProduceProductMenu(int productType, Product[] products) {
		this.productType = productType;
		this.products = products;
	}

	public List<String> getProduceItems() throws Exception {
		for(Product p : this.products){
			if(p.getProductType() == 1){
				produceProducts.add(p.getProductName());
			}
		}
	   return  produceProducts;
	}

	public void showMenu() {
		int i = 1;
		for( String produceItem : produceProducts){
			System.out.println(i+ ". "+produceItem);
			i++;
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
