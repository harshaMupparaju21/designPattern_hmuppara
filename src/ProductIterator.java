import java.util.ListIterator;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private int index;

	Product[] productList = classProductList.getProductList();


	public ProductIterator(Product[] productList, int position) throws Exception {
		this.productList = productList;
		position = 0;
	}

	public boolean hasNext() {
		if(this.index >= productList.length){
			return false;
		}
		return true;
	}

	public Object next() {
		return productList[index++];
	}

	public void moveToHead(){
		this.index = 0;
	}

	public void remove() {
		if (index >= 0 && index < productList.length) {
			for (int i = index; i < productList.length-1; i++) {
				productList[i] = productList[i+1];
			}
		}
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
