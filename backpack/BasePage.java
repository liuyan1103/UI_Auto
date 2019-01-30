package cn.jybd.www.base;


import cn.jybd.www.util.SelectBrowser;
import org.openqa.selenium.WebElement;

public class BasePage {
    //    在Basepage这个类中封装我们自己的元素操作方法
//    1.组合sendKeys和clear这两个方法，
//    到达每次sendkeys都先clear的目的
    public void sendKeys(WebElement webElement, String content) {
        webElement.clear();
        webElement.sendKeys(content);
    }

    //    所有我们可能用到的元素定位的方法，我们都应该在BasePage中重新封装
//    2.click这个方法
    public void click(WebElement webElement) {
//        webElement.click();
//        自己封装click方法以后，便于，以后方法的扩展
//        比如想在每次点击操作时，都打印一条日志
//        或者比如在每次点击元素前，先进行一个时间等待，确保web元素可被点击后在点击
//        或者有时元素被挡住，会抛出一个异常“该位置（200,350）不能被点击”
//        可以在这里实现一个备用的点击方法
//        除了findElement()方法可以接click(),还有那些地方我们用都过click？Actions
//        所以，我们设计一种备用的点击方法
        try {
            webElement.click();
        } catch (Exception e) {
            SelectBrowser selectBrowser =new SelectBrowser();
//            Actions actions = new Actions( selectBrowser.selectExplorerByName( "chrome" ));
//            actions.click(webElement).perform();
        }

    }


}
