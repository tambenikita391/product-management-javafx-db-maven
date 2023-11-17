package search_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchProductScreen
{
	public static void showSearchProductscreen()throws Exception
	{
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//tambe//eclipse-workspace//ShopManagementJavaFxDB//src//search_product//searchProductScreen.fxml"));
		StageFactory.stage.setTitle("Search Product Details");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
		
		
	}

}
