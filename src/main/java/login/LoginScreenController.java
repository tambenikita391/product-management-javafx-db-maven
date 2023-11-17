package login;
import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController 
{
	@FXML
	private TextField loginName;
	
	@FXML
	private TextField passwords;
	
	@FXML
	private Button loginButton;
	
	public void login(ActionEvent event) throws Exception
	{
		boolean loginStatus = LoginScreenController.validateUserAndPassword(loginName.getText(), passwords.getText());
		if(loginStatus)
		{
			HomeScreen.showHomeScreen();
		}
		else {
			System.out.println("Login unsuccessfull!!");
		}	
	}
	public static boolean validateUserAndPassword(String loginName, String passwords)
	{
		String query = "select * from Users where Email='"+loginName+"' and passwords='"+passwords+"' ";
		ResultSet rs = DBUtils.executeQueryGetResult(query);
		
		try {
			if(rs.next())
			{
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	return false;
	}
}
