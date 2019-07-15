package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RegisterPannel 
{
	/*
	 * 注册页面FXML控制器
	 */

	@FXML
    private ImageView image;
	
    @FXML
    private JFXTextField txtfield_name;

    @FXML
    private JFXButton btn_register;

    @FXML
    private Label errmsg_name;

    @FXML
    private Label errmsg_pwconfirm;

    @FXML
    private JFXPasswordField txtfield_pwconfirm;

    @FXML
    private Label errmsg_pw;

    @FXML
    private JFXPasswordField txtfield_pw;

    @FXML
    private JFXSpinner spinner;
    
    public void initialize()
    {
    	/*
    	 * 设置图片文件位置
    	 * 设置按钮的事件反应器。
    	 * 按钮提交数据至服务器。
    	 */
    	
    	image.setImage(new Image(this.getClass().getResourceAsStream("/resource/image/welcome.jpg")));
    }

}
