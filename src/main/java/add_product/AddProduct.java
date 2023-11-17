package add_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProduct 
{
	public static void showAddProductScreen() throws Exception
	{
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//tambe//eclipse-workspace//ShopManagementJavaFxDB//src//add_product//addProductScreen.fxml"));
		StageFactory.stage.setTitle("Add Product Details");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
	}

}
