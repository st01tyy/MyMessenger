package main;

import controller.LoginService;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application 
{
	/*
	 * 主类 
	 */
	
	@Override
	public void start(Stage arg0) throws Exception 
	{
		/*
		 * 程序启动入口
		 */
		
		LoginService.showLoginPage();
	}
	public static void main(String[] args) 
	{
		launch(args);
	}
}
