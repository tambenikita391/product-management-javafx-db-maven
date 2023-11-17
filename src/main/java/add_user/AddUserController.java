package add_user;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import search_user.SearchUserScreen;
import user_management.UserManagementScreen;

public class AddUserController 
{
	@FXML
	private TextField userName;
	
	@FXML
	private TextField email;

	@FXML
	private TextField role;

	@FXML
	private TextField password ;

	@FXML
	private Button backToUserManagementscreen  ;
	
	@FXML
	private Button proceed ;
	
	@FXML
	private Label userMessage ;
	
	
	public void save(ActionEvent event) throws Exception
	{
		String query = "INSERT INTO Users(userName , Email , passwords , userRole) VALUES  ('"+userName.getText()+"', '"+email.getText()+"', '"+role.getText()+"','"+password.getText()+"' ";
		DBUtils.executeQuery(query);
		userMessage.setText("User created successfully!!");
				
	}
	
	public void cancle(ActionEvent event) throws Exception
	{
		HomeScreen.showHomeScreen();
	
	}

}
