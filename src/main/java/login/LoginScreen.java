package login;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreen 
{
	public static void showLoginScreen() throws Exception
	{
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//tambe//eclipse-workspace//ShopManagementJavaFxDB//src//login//LoginPage.fxml"));
		StageFactory.stage.setTitle("Customer Login");
		
		StageFactory.stage.setFullScreen(true);
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
		
	}

}
