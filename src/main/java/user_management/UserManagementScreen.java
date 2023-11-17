package user_management;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserManagementScreen
{
	public static void showUserManagementScreen() throws Exception
	{
		Parent actorgroup = FXMLLoader.load(new URL("file:///C|/Users//tambe//eclipse-workspace//ShopManagementJavaFxDB//src//user_management//showUserManagementScreen.fxml"));
		StageFactory.stage.setTitle("User Management");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorgroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
		
				
	}

}
