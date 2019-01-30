package cn.jybd.www.pageModle;

import cn.jybd.www.util.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class mdPurchase {

    public void  mdpurchase() {
        SeleniumUtil seleniumUtil=SeleniumUtil.getInstance();
        seleniumUtil.waitForPageLoading(3);
        seleniumUtil.click(By.linkText("采购"));
        WebElement element = seleniumUtil.findElementBy(By.id("search_type"));
        Select comboBox = new Select(element);
        comboBox.selectByIndex(1);
        seleniumUtil.type(By.id("keyword"),"新源");
        seleniumUtil.pause(5000);
        seleniumUtil.click(By.id("btn_submit"));
        seleniumUtil.pause(2000);
        seleniumUtil.click(By.cssSelector("#row558845 > td:nth-child(9) > div > a"));
        seleniumUtil.pause(2000);
        seleniumUtil.click(By.linkText("立即购买"));
        seleniumUtil.pause(2000);
        seleniumUtil.click(By.id("submitOrder"));
        seleniumUtil.pause(2000);
        seleniumUtil.click(By.cssSelector("[name=\"pd_pay\"]"));
        seleniumUtil.pause(2000);
        seleniumUtil.type(By.id("pay-password"),"123456");
        seleniumUtil.pause(2000);
        seleniumUtil.click(By.id("pd_pay_submit"));
        seleniumUtil.pause(5000);
        seleniumUtil.click(By.id("next_button"));
        seleniumUtil.pause(5000);

    }
}
