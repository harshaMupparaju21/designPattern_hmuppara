import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private int index;

	List<Product> productList = new ArrayList<>();

	public ProductIterator(List<Product> productList, int index) throws Exception {
		this.productList = productList;
		this.index = index;
	}

	public boolean hasNext() {
		if(this.index < productList.size()){
			return true;
		}
		return false;
	}

	public Product next() {
		return productList.get(this.index++);
	}

	public void remove() {
		productList.remove(this.index);
	}

	public boolean hasPrevious() {
		return false;
	}

	public Object previous() {
		return null;
	}

	public int nextIndex() {
		return 0;
	}

	public int previousIndex() {
		return 0;
	}

	public void set(Object o) {

	}

	public void add(Object o) {

	}
}
