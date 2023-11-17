package search_user;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class SearchUserScreen
{
	public static void showSearchUserScreen() throws Exception
	{	
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//tambe//eclipse-workspace//ShopManagementJavaFxDB//src//search_user//searchUserScreen.fxml "));
		StageFactory.stage.setTitle("Edit User details");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
		
		
	}

}
