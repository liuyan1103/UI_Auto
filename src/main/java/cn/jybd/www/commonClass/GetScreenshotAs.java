package cn.jybd.www.commonClass;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*时间：2018年7月4日
 * 作者：李将
 * 功能：
 * 使用getScreenshotAs 进行屏幕截屏
 * 
 * 
 * */
public class GetScreenshotAs {
	//路径修改为自己项目下的路径
	 public static String path="result/image";
	 public static  String type=".png";
	 public  void Screen(WebDriver driver) {
		File scrFile = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		try {
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM月dd日HH时mm分ss秒");
			String fileName =dateFormat.format(date);
			Files.copy(scrFile, new File(path+fileName+type));
//			System.out.println("图片为：");
//			System.out.println(path+fileName+type);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
