package product_management;

import add_product.AddProduct;
import edit_product.EditProductScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import search_product.SearchProductScreen;

public class ProductManagementScreenController
{
	@FXML
	private Button addProduct;
	
	@FXML
	private Button searchProduct;
	
	@FXML
	private Button editProduct;
	
	@FXML
	private Button deleteProduct;
	
	@FXML
	private Button quit;
	
	public void addProductDetails(ActionEvent event) throws Exception
	{
		AddProduct.showAddProductScreen();
	}
	
	public void searchProductDetails(ActionEvent event) throws Exception
	{
		SearchProductScreen.showSearchProductscreen();
		
	}
	public void editProductDetails(ActionEvent event) throws Exception
	{
		EditProductScreen.showEditProductScreen();
		
	}
	public void quit(ActionEvent event) throws Exception
	{
		HomeScreen.showHomeScreen();
	}
	
	

}
