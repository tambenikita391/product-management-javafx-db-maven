package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import edit_user.EditUserScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import login.LoginScreenController;
import user_management.UserManagementScreen;

public class SearchUserScreenController 
{  
	@FXML
	private Label UserMessage ;
	
	@FXML
	private  TextField userNameToSearch;
	
	@FXML
	private TextField userName;

	@FXML
	private TextField loginName;

	@FXML
	private TextField passwords;

	@FXML
	private TextField userRole;

	@FXML
	private Button Cancle;

	@FXML
	private Button Save;
	
	@FXML
	private Button Search;
	
	@FXML
	private Button Delete;
	
	
	public void search(ActionEvent event) throws SQLException
	{
		boolean status = searchUser(userNameToSearch.getText());
	    if(status)
	    {
	    	searchUser(null);
	    	UserMessage.setText("User found!!");
	    	
	    }
	    else {
	    	System.out.println("User not found!!");
	    	UserMessage.setText("User not found!!");
	    }
	}
	
	public  boolean searchUser(String userNameToSearch) throws SQLException
	{
		String query = "select * from Users where userName= '"+userNameToSearch+"'";
		
		ResultSet rs = DBUtils.executeQueryGetResult(query);
			try {
				if(rs.next())
				{
					userName.setText(rs.getString("userName"));
					loginName.setText(rs.getString("loginName"));
					passwords.setText(rs.getString("passwords"));
					userRole.setText(rs.getString("userRole"));
					return true;			
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;	
	}
	
	public void delete(ActionEvent event)
	{
		String query = "delete from Users where userName='"+userNameToSearch.getText()+"' ";
		System.out.println(query);
		DBUtils.executeQuery(query);
	}
	
	public void back(ActionEvent event) throws Exception
	{
		UserManagementScreen.showUserManagementScreen();
	}
	
	public void editScreen(ActionEvent event) throws Exception
	{
		EditUserScreen.showEditUserScreen();
	
	}
	
	
	
}
	
	
	

