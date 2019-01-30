package cn.jybd.www.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author lijiang
 * @date 2019/1/29 - 下午 8:23
 */
public class TestngReportDemo {

    @Test
    public void testReport(){

        System.setProperty("webdriver.chrome.driver", "res/driver/chrome/win/chromedriver.exe");
        WebDriver driver=(WebDriver) new ChromeDriver();

        Reporter.log("launch chrome browser instance");

        driver.manage().window().maximize();

        Reporter.log("Max the browser");

        driver.get("https://www.baidu.com");

        Reporter.log("open baidu site");

        driver.quit();

        Reporter.log("退出浏览器");

    }
}

