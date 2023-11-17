package add_product;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class AddProductController
{
	@FXML
	private TextField productID;
	
	@FXML
	private TextField productName;
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private TextField category;
	
	@FXML
	private Label userMessage;
	
	
	public void save(ActionEvent event)
	{
		userMessage.setText("Product added successfully!!");
		String query = "INSERT INTO Users(productName, price, quantity, category) VALUES  ('"+category.getText()+"', '"+productName.getText()+"', '"+price.getText()+"','"+quantity.getText()+"') " ;
		DBUtils.executeQuery(query); 
		
	}
	public void back(ActionEvent event) throws Exception
	{
		ProductManagementScreen.showProductManagementScreen();
	}
	

}
