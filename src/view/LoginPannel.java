package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginPannel 
{
	/*
	 * 登录页面FXML控制器
	 */

    @FXML
    private JFXTextField txtfield_name;

    @FXML
    private Hyperlink link_register;

    @FXML
    private JFXPasswordField txtfield_pw;

    @FXML
    private JFXButton btn_login;

    @FXML
    private JFXSpinner spinner;
    
    @FXML
    private ImageView logo;
    
    public void initialize()
    {
    	/*
    	 * 设置图片文件位置
    	 * 设置按钮、超链接的事件反应器。
    	 * 超链接跳转至注册页面；按钮提交数据至服务器。
    	 */
    	
    	logo.setImage(new Image(this.getClass().getResourceAsStream("/resource/image/logo.jpg")));
    }

}
