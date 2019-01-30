package cn.jybd.www.testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PurchasingProcess {

    WebDriver driver ;

    @Test
    public void MenDian(){
        //门店登录
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://hebing.jybd.cn/chainsell/index.php?act=login&op=index");
        driver.findElement(By.id("user")).sendKeys("13601208177");
        driver.findElement(By.id("pwd")).sendKeys("123456");
        driver.findElement(By.id("captcha")).sendKeys("ichs");
        driver.findElement(By.cssSelector("[value=\'确认登录\']")).click();
        //门店采购订单
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("采购")).click();
        WebElement element = driver.findElement(By.id("search_type"));
        Select comboBox  = new Select(element);
        comboBox.selectByIndex(1);
        driver.findElement(By.id("keyword")).sendKeys("新源");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("btn_submit")).click();
        driver.findElement(By.cssSelector("#row293488 > td:nth-child(9) > div > a")).click();
        driver.findElement(By.linkText("立即购买")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("submitOrder")).click();
        driver.findElement(By.cssSelector("[name=\"pd_pay\"]")).click();
        driver.findElement(By.id("pay-password")).sendKeys("123456");
        driver.findElement(By.id("pd_pay_submit")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("next_button")).click();
        driver.quit();

        //商家登录
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://hebing.jybd.cn/shop/index.php?act=seller_login&op=show_login");
        driver.findElement(By.name("seller_name")).sendKeys("xinyuan");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.id("captcha")).sendKeys("ichs");
        driver.findElement(By.cssSelector("[value=\"确认登录\"]")).click();

        //商家发货
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[4]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.linkText("商品出库")).click();
        driver.findElement(By.xpath("//*[@id=\"confirm_button\"]")).click();
        driver.findElement(By.linkText("设置发货")).click();
        driver.findElement(By.linkText("无需物流运输服务")).click();
        driver.findElement(By.linkText("确认")).click();
        driver.quit();

        //门店登录
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://hebing.jybd.cn/chainsell/index.php?act=login&op=index");
        driver.findElement(By.id("user")).sendKeys("13601208177");
        driver.findElement(By.id("pwd")).sendKeys("123456");
        driver.findElement(By.id("captcha")).sendKeys("ichs");
        driver.findElement(By.cssSelector("[value=\'确认登录\']")).click();

        //门店确认收货
        driver.findElement(By.linkText("订单")).click();
        driver.findElement(By.xpath("//*[@id=\'order361489_action_confirm\']")).click();
        driver.findElement(By.xpath("//*[@id=\'confirm_yes\']")).click();





    }

}

