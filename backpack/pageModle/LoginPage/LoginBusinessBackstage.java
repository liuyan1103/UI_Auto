package cn.jybd.www.pageModle.LoginPage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
/*
* @suthor:lijiang
* @date:2018-08-14
* @functhion：商家后台 登录
* */


public class LoginBusinessBackstage{


     Logger logger  =  Logger.getLogger(LoginBusinessBackstage.class );

    @FindBy(linkText = "商家管理登录")
    WebElement input_linkText;

    @FindBy(name = "seller_name")
    WebElement input_username;

    @FindBy(name = "password")
    WebElement input_password;

    @FindBy(id = "captcha")
    WebElement input_captcha;


    public static String URL = "https://hebing.jybd.cn/chainsell/index.php?act=login&op=indexn";

    public void open(WebDriver driver) {
        driver.get(URL);

    }
    //商家后台登录
    public void login(String username, String password) {
        PropertyConfigurator.configure( "config/log4j.properties" );
        logger.info("执行点击操作");

        input_linkText.click();

        if (username.equals("")){
            logger.error("用户名输入错误请重新输入");
            Assert.fail("用户名输入错误请重新输入");

        }else {
            logger.info("输入用户名："+username);
        }

        input_username.sendKeys(username);
        logger.info("输入密码："+password);
        input_password.sendKeys(password);
        logger.info("输入验证码：ichs");
        input_captcha.sendKeys("ichs");
        logger.info("点击登录按钮");
        input_captcha.sendKeys(Keys.ENTER);

    }

    //    login方法的重载
    public void login() {

        login("jybd7568888", "123456");
    }

}
