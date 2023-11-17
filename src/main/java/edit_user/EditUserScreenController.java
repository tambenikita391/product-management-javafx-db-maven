package edit_user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class EditUserScreenController 
{
	@FXML
	private TextField userNameToEdit;
	
	@FXML
	private TextField NewUserName;
	
	@FXML
	private TextField NewEmail;
	
	@FXML
	private TextField New_passwords;
	
	@FXML
	private TextField New_userRole;
	
	@FXML
	private Label userMessage;
	
	public void edit(ActionEvent event) throws SQLException
	{
		boolean status = editUser(userNameToEdit.getText());
		if(status)
		{
			editUser(null);
			String updateQuery = "update Users set "+ " userName='"+NewUserName.getText()+"', Email='"+NewEmail.getText()+"', passwords='"+New_passwords.getText()+"', userRole='"+New_userRole.getText()+"' "+ "where userName='"+userNameToEdit.getText()+"'";
			DBUtils.executeQuery(updateQuery);
			userMessage.setText("User updated successfully!!");
			
		}
		else {
			System.out.println("User information  not updated!!");
				
		}
				
	}
	public void backToHomeScreen(ActionEvent event) throws Exception
	{
		HomeScreen.showHomeScreen();
	}
	
	public boolean editUser(String userNameToEdit) throws SQLException
	{
		String query = "select * from Users where username='"+userNameToEdit+"' ";
		ResultSet rs = DBUtils.executeQueryGetResult(query);
		
		try {
			if(rs.next())
			{
				NewUserName.setText(rs.getString("userName"));
				NewEmail.setText(rs.getString("Email"));
				New_passwords.setText(rs.getString("passwords"));
				New_userRole.setText(rs.getString("userRole"));
							
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
		
	}

		
		
						
}
