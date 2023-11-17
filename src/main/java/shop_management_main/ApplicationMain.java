package shop_management_main;

import common.StageFactory;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import login.LoginScreen;

public class ApplicationMain extends Application
{
	public static void main(String [] args)
	{
		launch(args);
	}
	public void start(Stage stage) throws Exception
	{
		
		StageFactory.stage = stage;
		LoginScreen.showLoginScreen();
		
	}
	

}
