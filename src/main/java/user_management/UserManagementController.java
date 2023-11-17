package user_management;

import add_user.AddUser;
import edit_user.EditUserScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user.SearchUserScreen;

public class UserManagementController 
{
	@FXML
	private Button addUserDetails;
	
	@FXML
	private Button editUserDetails;
	
	@FXML
	private Button searchUserDetails;
	
	@FXML
	private Button deleteUserDetails;
	
	@FXML
	private Button Quit;
	
	public void addUser(ActionEvent event) throws Exception
	{
		AddUser.showAddUserScreen();
	}
	
	public void searchUser(ActionEvent event) throws Exception
	{
		SearchUserScreen.showSearchUserScreen();
	}
	
	public void editUser(ActionEvent event) throws Exception
	{
		EditUserScreen.showEditUserScreen();
	}
		
	public void quit(ActionEvent event) throws Exception
	{
		HomeScreen.showHomeScreen();
	
	}
	
}
	
	
	
