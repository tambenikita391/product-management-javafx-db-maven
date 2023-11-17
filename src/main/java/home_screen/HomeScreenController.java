package home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;

public class HomeScreenController
{
	@FXML
	private Button userManagement;
	
	@FXML
	private Button productManagement;
	
	@FXML
	private Button back_Home;
	
	
	public void showUserManagementScreen(ActionEvent event) throws Exception
	{
		UserManagementScreen.showUserManagementScreen();	
	}
	
	public void showProductManagementScreen(ActionEvent event) throws Exception
	{
		ProductManagementScreen.showProductManagementScreen();
	}
	
	public void backToHomeScreen(ActionEvent event) throws Exception
	{
		HomeScreen.showHomeScreen();
	}

}
