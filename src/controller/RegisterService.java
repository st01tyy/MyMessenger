package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import view.RegisterPannel;

public class RegisterService 
{
	/*
	 * 注册页面所需要的所有函数
	 */
	
	public static void showRegisterPage()
	{
		/*
		 * 显示注册页面
		 */
		
		try
		{
			//读取FXML文件并初始化控制器
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(LoginService.class.getResourceAsStream("/resource/fxml/register.fxml"));
			RegisterPannel registerPannel = loader.getController();
			registerPannel.initialize();
			
			//设置界面并显示
			Stage stage = new Stage();
			stage.setTitle("注册");
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
	public static void cancelErrMsg(Label label)
	{
		label.setVisible(false);
	}
	public static void submitInput(String name, String pw)
	{
		
	}
	public static int judgeInput(String name, String pw, String pwConfirm)
	{
		/*
		 * 判断输入的用户名密码是否合法
		 */
		
		if(name.length() < 6 || name.length() > 12)
			return 1;
		if(pw.length() < 8 || pw.length() > 20)
			return 2;
		boolean hasNumber = false;
		boolean hasCh = false;
		for(int a = 0; a < pw.length(); a++)
		{
			if(pw.charAt(a) < 0 || pw.charAt(a) > 255)
				return 2;
			if(!hasCh && (pw.charAt(a) >= 'a' && pw.charAt(a) <= 'z') || (pw.charAt(a) >= 'A' && pw.charAt(a) <= 'Z'))
				hasCh = true;
			if(!hasNumber && pw.charAt(a) >= '0' && pw.charAt(a) <= '9')
				hasNumber = true;
		}
		if(!hasNumber || !hasCh)
			return 2;
		if(!pwConfirm.equals(pw))
			return 3;
		return 0;
	}
}
