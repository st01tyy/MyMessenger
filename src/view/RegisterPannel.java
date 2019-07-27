package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;

import controller.RegisterService;
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
    	txtfield_name.setOnMouseClicked(e -> RegisterService.cancelErrMsg(errmsg_name));
    	txtfield_pw.setOnMouseClicked(e -> RegisterService.cancelErrMsg(errmsg_pw));
    	txtfield_pwconfirm.setOnMouseClicked(e -> RegisterService.cancelErrMsg(errmsg_pwconfirm));
    	btn_register.setOnMouseClicked(e -> onSubmitButtonClicked());
    }
    
    private void onSubmitButtonClicked()
    {
    	/*
    	 * 按钮的事件反应器。
    	 */
    	
    	int res = RegisterService.judgeInput(txtfield_name.getText(), txtfield_pw.getText(), txtfield_pwconfirm.getText());
    	if(res != 0)
    	{
    		txtfield_pw.setText("");
    		txtfield_pwconfirm.setText("");
    		if(res == 1)
    			errmsg_name.setVisible(true);
    		else if(res == 2)
    			errmsg_pw.setVisible(true);
    		else
    			errmsg_pwconfirm.setVisible(true);
    	}
    	else
    	{
    		
    	}
    }
    
}
