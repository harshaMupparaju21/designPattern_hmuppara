import java.io.FileNotFoundException;

public interface ProductMenu {

	Person person = null;

	public abstract void showMenu() throws Exception;

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComBoxes();

}
