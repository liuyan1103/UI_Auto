package cn.jybd.www.base;


import cn.jybd.www.util.SeleniumUtil;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestCase {

        public SeleniumUtil seleniumUtil = null;

        @BeforeClass
        public void beforeTest() {
//        LogConfiguration.initLog(this.getClass().getSimpleName());
            seleniumUtil=SeleniumUtil.getInstance();
//            seleniumUtil.launchBrowser("chrome",3);

    }

    @AfterClass
    public void endTest() {
        seleniumUtil=SeleniumUtil.getInstance();
        if (seleniumUtil.driver != null) {
            //退出浏览器
            seleniumUtil.quit();
        } else {
//            FileHelper.error("浏览器driver没有获得对象,退出操作失败", null);
            Assert.fail("浏览器driver没有获得对象,退出操作失败");
        }

    }
}
