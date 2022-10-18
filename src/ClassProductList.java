import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassProductList {

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ProductIterator productIterator;

	public void accept(NodeVisitor visitor) {

	}

	public Product[] getProductList() throws Exception {
		String current_dir = System.getProperty("user.dir");

		File productFile = new File(current_dir+"/src/ProductInfo.txt");
		BufferedReader product_br = new BufferedReader(new FileReader(productFile));

		String productInfo;
		List<Product> productList = new ArrayList<Product>();

		while ((productInfo = product_br.readLine()) != null) {
			String[] productDetails = productInfo.split(":");
			productList.add(new Product(productDetails[0],productDetails[1]));
		}

		int length = productList.size();
		this.product = new Product[length];
		for (int i = 0; i< length;i++){
			this.product[i] = productList.get(i);
		}
		return this.product;
	}
}
