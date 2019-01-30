package cn.jybd.www.testCase;

import cn.jybd.www.base.BaseParpare;
import cn.jybd.www.pageshelper.HomePageHelper;
import cn.jybd.www.pageshelper.LoginPageHelper;
import org.testng.annotations.Test;

/**
 * @author lijiang
 * @date 2019/1/28 - 下午 7:48
 */
public class LoginPage_001_LoginSuccessFunction_Test extends BaseParpare {
    @Test
    public void loginSuccessFunction() {
        //等待登录页面加载
        LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
        // 输入登录信息
        LoginPageHelper.typeLoginInfo(seleniumUtil,"ceshi22", "123456");
        //等待首页元素显示出来
        HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
        //检查用户名是不是期望的"USENAME"
        HomePageHelper.checkUserName(seleniumUtil, timeOut,"ceshi22");
    }
}
