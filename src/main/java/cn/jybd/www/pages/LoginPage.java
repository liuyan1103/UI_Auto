package cn.jybd.www.pages;

import org.openqa.selenium.By;

/**
 * @description 登录页面元素定位声明
 * */
public class LoginPage {
    /**用户名输入框*/
    public static final By LP_INPUT_USERNAME = By.id("user_name");

    /**密码输入框*/
    public static final By LP_INPUT_PASSWORD = By.id("password");

    /**验证码输入框*/
    public static final By LP_INPUT_Captcha= By.id("captcha");


    /**登录按钮*/
    public static final By LP_BUTTON_LOGIN = By.xpath( "//*[@id=\"login_form\"]/div[3]/input[1]" );



}
