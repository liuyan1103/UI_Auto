package cn.jybd.www.util;

import com.google.common.io.Files;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {
//    在testng中，提供了一个监听器的类： TestListenerAdapter
//    我们需要自己创建一个类来继承TestListenerAdapter
static Logger logger = Logger.getLogger(ScreenshotUtil.class.getName());

    public  String getScreenshot(WebDriver driver, String fileName) {

//        PropertyConfigurator.configure( "config/log4j.properties" );
//      以前我们通过webdriver创建过Actions这个类
//        现在我们把webdriver转换成TakeScreenshot这个类
//        这三个类共同特点是，跟具体的页面元素无关，针对的都是整个浏览器
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String rootPath = System.getProperty("user.dir"); //获取当前工程所在路径
//        File.separator就等于/，那么我们为什么不直接用/？
//        因为\不能跨平台，在windows上目录之间用\,在linux目录之前用/
//        在现在的window上目录可以用\也可以用/，但是仍然推荐用File.separator
        String path = rootPath + File.separator +"result"+File.separator + "image" + File.separator + fileName + ".png";
//        把创建的srcFile从内存复制到path路径下
        try {
            Files.copy(srcFile, new File(path));
        } catch (IOException e) {
            logger.error(getClass() + " 保存截图失败");
            e.printStackTrace();
        }
        return path;
    }
}
