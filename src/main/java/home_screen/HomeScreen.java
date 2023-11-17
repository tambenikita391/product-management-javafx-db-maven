package home_screen;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeScreen 
{
	public static void showHomeScreen() throws Exception
	{
		try {
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//tambe//eclipse-workspace//ShopManagementJavaFxDB//src//home_screen//HomeScreen.fxml"));
        StageFactory.stage.setTitle("Home Screen");
		
		StageFactory.stage.setFullScreen(true);
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();	
	}catch(Exception e)
		{
		e.printStackTrace();
		}

}
}
