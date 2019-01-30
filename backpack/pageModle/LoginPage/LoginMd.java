package cn.jybd.www.pageModle.LoginPage;

import cn.jybd.www.manager.HttpManager;
import cn.jybd.www.util.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMd {
    //    门店后台登录
    WebDriver  driver;
    String address="/chainsell";
    public  void login(String username, String password) {
        //地址
        HttpManager httpManager= new HttpManager();
        String strUrl = httpManager.address()+address;

        SeleniumUtil seleniumUtil1=SeleniumUtil.getInstance();
        seleniumUtil1.get(strUrl);
        seleniumUtil1.type(By.id("user"), username);
        seleniumUtil1.pause(2000);
        seleniumUtil1.type(By.id("pwd"), password);
        seleniumUtil1.pause(2000);
        seleniumUtil1.type(By.id("captcha"), "8888");
        seleniumUtil1.pause(2000);
        seleniumUtil1.click(By.cssSelector("[value=\'确认登录\']"));
        seleniumUtil1.waitForPageLoading(1000);
    }
    //函数的调用
    public void  md(){
        login("13601208177","123456");

    }
}
