package controller;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import view.LoginPannel;

public class LoginService 
{
	/*
	 * 登录页面所需要的所有函数
	 */
	
	public static void showLoginPage()
	{
		/*
		 * 显示登录页面
		 */
		
		try
		{
			//读取FXML文件并初始化控制器
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(LoginService.class.getResourceAsStream("/resource/fxml/login.fxml"));
			LoginPannel loginPannel = loader.getController();
			loginPannel.initialize();
			
			//设置界面并显示
			Stage stage = new Stage();
			stage.setTitle("MyMessenger");
			stage.getIcons().add(new Image(LoginService.class.getResourceAsStream("/resource/image/logo.jpg")));
			stage.setResizable(false);
			stage.setScene(new Scene(root, root.getPrefWidth(), root.getPrefHeight()));
			stage.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void jumpToRegisterPage()
	{
		/*
		 *由超链接 跳转至注册页面
		 */
		
		RegisterService.showRegisterPage();
	}
}
