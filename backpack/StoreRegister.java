//package cn.jybd.www.testCase;
///*代码未完成，有待修改
// * @原始优化代码
// * @author  wangtong
// * @description:主要用于店铺注册
// * @data:2018/6/13
// */
//
//import cn.jybd.www.commonClass.DataCode;
//import cn.jybd.www.commonClass.FindElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.Iterator;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
////供应商店注册
//public class StoreRegister {
//	WebDriver driver;
//	FindElement find = new FindElement();
//  @Test
//  public void f() {
//
//	  //登录跳转到注册页面
//	  find.bypartialLink(driver,"注册").click();
//
//	  find.byLink(driver,"供应商入驻").click();//注册页面
//
//	  try {
//		Thread.sleep(500);
//	} catch (InterruptedException e2) {
//		// TODO Auto-generated catch block
//		e2.printStackTrace();
//	}
//
//	  DataCodejd=new DataCode();
//	  jd.update("UPDATE `shopnc_sms_log` SET `log_ip`='' WHERE (`log_id`>'131968')");//注销log_ip，避免1分钟验证出现
//
//	  find.byId(driver,"phone_store").clear();
//	  find.byId(driver,"phone_store").sendKeys("13243333363");//填写注册手机号
//	  find.byId(driver,"image_captcha_store").sendKeys("8888");
////	  try {
////		Thread.sleep(2000);
////	} catch (InterruptedException e2) {
////		// TODO Auto-generated catch block
////		e2.printStackTrace();
////	}
////	  find.byLink(driver,"发送短信验证").click();
////	  find.bySelector(driver, "#supplier_store > span").click();
//	  find.bySelector(driver, ".massg_2").click();
////	  读取数据库数据
////	  JdbcUtil util = new JdbcUtil();
////	  System.err.println("运行");  //运行可用
////------------------------------
//
////	  DataCodeTest jd=new DataCodeTest();
////	  jd.update("UPDATE `shopnc_sms_log` SET `log_ip`='' WHERE (`log_id`>'131968')");//注销log_ip，避免1分钟验证出现
//
////	  String dh = jd.getAll("select * from shopnc_sms_log where log_phone = " + "13211222249");
////	  System.out.println("获取动态验证码成功");
//
//	  //从数据库提取验证码
//      String sql = "select log_captcha from shopnc_sms_log where log_phone = 13243333363 order by  log_id desc limit 0,1";
//	  String field = "log_captcha";
////	  String sms_captcha = util.query(sql, field);//可用
//	  String sms_captcha = jd.query(sql, field);
//
////	  String sms_captcha = jd.getAll(sql);
//
//      find.waitWebElement(driver, By.id("sms_captcha_store"), 10);
//
//	  find.byId(driver,"sms_captcha_store").sendKeys(sms_captcha);;
////	  System.exit(0);//暂停
//	  find.byId(driver, "submitBtnStore").click();
//
//	  //修改密码
//
//
//      try {
//		Thread.sleep(500);
//	} catch (InterruptedException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	  find.byId(driver, "sms_password_store").clear();
//	  find.byId(driver, "sms_password_store").sendKeys("jybd1234");//修改密码
////	  find.byId(driver,"sms_email_store").sendKeys("wangtong1@jybdshop.cn");//填写邮箱
//	  find.bySelector(driver,"#register_sms_form_store > div > input").click();//点击提交
//
//	  try {
//			Thread.sleep(500);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//	  //我要入住
//	  find.byLink(driver,"我要入驻").click();
//	  //下一步，填写企业资质信息
//	  try {
//		  Thread.sleep(500);
//		  } catch (InterruptedException e) {
//	      e.printStackTrace();
//		  }
//	//页面元素抓取不到 ，可用尝试跳转窗口
//	String currentWindow = driver.getWindowHandle();
//    Set<String> handles = driver.getWindowHandles();
//    Iterator<String> it = handles.iterator();
//    while (it.hasNext()) {
//        String handle = it.next();
//        if (currentWindow.equals(handle))
//            continue;
//        driver.switchTo().window(handle);
//
//	  find.byId(driver,"btn_apply_agreement_next").click();
//
//	  //填写店铺注册信息详情
//	  find.waitWebElement(driver,By.name("company_name"), 10);
//      find.byName(driver,"company_name").clear();
//      find.byName(driver,"company_name").sendKeys("店铺测试1");
//	  find.bySelector(driver,"table:nth-child(2) > tbody > tr:nth-child(2) > td > select").click();
//	  Select provincial = new Select(find.bySelector(driver,"table:nth-child(2) > tbody > tr:nth-child(2) > td > select"));
//	  provincial.selectByValue("9");//定位省直辖市：上海
//
//	  find.bySelector(driver,"tbody > tr:nth-child(2) > td > select:nth-child(2)").click();
//	  Select city = new Select(find.bySelector(driver,"tbody > tr:nth-child(2) > td > select:nth-child(2)"));
//	  city.selectByValue("39");//定位城市：上海市
//
//	  find.bySelector(driver, "tbody > tr:nth-child(2) > td > select:nth-child(3)").click();
//	  Select town = new Select(find.bySelector(driver, "tbody > tr:nth-child(2) > td > select:nth-child(3)"));
//	  town.selectByValue("147");//定位县城:静安区
//
//	  //公司详细地址
//	  find.byName(driver,"company_address_detail").clear();
//	  find.byName(driver,"company_address_detail").sendKeys("上海市上海市静安区西小口");
//
//	//公司电话
//	  find.bySelector(driver,"tbody > tr:nth-child(4) > td > input").clear();
//	  find.bySelector(driver,"tbody > tr:nth-child(4) > td > input").sendKeys("13243333363");
//
//	//联系人姓名
//	  find.byName(driver,"contacts_name").clear();
//	  find.byName(driver,"contacts_name").sendKeys("菲菲");
//
//	//联系人电话
//	  find.bySelector(driver,"tbody > tr:nth-child(6) > td > input").clear();
//	  find.bySelector(driver,"tbody > tr:nth-child(6) > td > input").sendKeys("13243333363");
//
//	//法人身份证号        新增加的
//	  find.byName(driver, "legal_person_number").clear();
//	  find.byName(driver, "legal_person_number").sendKeys("220625197405030965");
//	//上传身份照片       新增加的
////	  正面
//	  find.byName(driver, "legal_person_id_positive").sendKeys("F:\\desk\\测试资料\\测试用图\\注册图片\\licence.jpg");
////	  背面
//	  find.byName(driver, "legal_person_id_opposite").sendKeys("F:\\desk\\测试资料\\测试用图\\注册图片\\licence.jpg");
//
//	//营业执照号码
//	  find.byName(driver,"business_licence_number").clear();
//	  find.byName(driver,"business_licence_number").sendKeys("123456789012345");
//
//	//营业范围
//	  find.byName(driver,"business_sphere").clear();
//	  find.byName(driver,"business_sphere").sendKeys("汽车轮胎销售、安装、定位、维修及保养等!!!");
//
//	  try {
//		  Thread.sleep(500);
//		  } catch (InterruptedException e) {
//	      e.printStackTrace();
//		  }
//	  //上传营业执照
//	  find.byName(driver,"business_licence_number_elc").sendKeys("F:\\desk\\测试资料\\测试用图\\注册图片\\licence.jpg");
//
//	  //双击
////	  Actions action = new Actions(driver);
////	  new Actions(driver).doubleClick(find.byId(driver, "btn_apply_company_next")).perform();
//
////	  find.waitWebElement(driver, By.linkText("提交财务资质信息"), 10);
//
////	  find.bypartialLink(driver,"下一步，提交财务资质").click();
//	  try {
//		  Thread.sleep(1000);
//		  } catch (InterruptedException e) {
//	      e.printStackTrace();
//		  }
////	  btn_apply_company_next
//	  find.byId(driver, "btn_apply_company_next").click();
//    }
////财务资质信息
//	  //银行开户名
//    find.byName(driver,"bank_account_name").clear();
//    find.byName(driver,"bank_account_name").sendKeys("张小斐");
//
//    //银行账户号码
//    find.byName(driver,"bank_account_number").clear();
//    find.byName(driver,"bank_account_number").sendKeys("123456789123456789");
//
//    //开户银行名字
//    find.byName(driver,"bank_name").clear();
//    find.byName(driver,"bank_name").sendKeys("中国国际民生银行（西小口）");
//
////  //开户银行支行号码
////    find.byName(driver,"bank_code").clear();
////    find.byName(driver,"bank_code").sendKeys("223456789012345678");
//
//    //开户行所在地址
////    #bank_address
////	  find.bySelector(driver,"tbody > tr:nth-child(5) > td > select").click();
////    #form_credentials_info > table > tbody > tr:nth-child(5) > td > input.w60
////      find.byId(driver,"bank_address").click();
//      find.bySelector(driver, "tbody > tr:nth-child(5) > td > input.w60").click();
//
////      #form_credentials_info > table > tbody > tr:nth-child(4) > td > select:nth-child(2)
//	  Select provincial = new Select(find.bySelector(driver, "tbody > tr:nth-child(5) > td > input.w60"));
//      provincial.selectByValue("15");//定位省直辖市：山东
//
//
//	  find.bySelector(driver,"tbody > tr:nth-child(4) > td > select:nth-child(2)").click();
//	  Select city = new Select(find.bySelector(driver,"tbody > tr:nth-child(4) > td > select:nth-child(2)"));
//	  city.selectByValue("228");//定位城市：烟台市
//
//	  find.bySelector(driver, "tbody > tr:nth-child(4) > td > select:nth-child(3)").click();
//	  Select town = new Select(find.bySelector(driver, "tbody > tr:nth-child(4) > td > select:nth-child(3)"));
//	  town.selectByValue("2562");//定位县城:莱阳市
//
//	  try {
//		  Thread.sleep(500);
//		  } catch (InterruptedException e) {
//	      e.printStackTrace();
//		  }
//	  //银行开户许可byName(driver,"bank_licence_electronic")
//	  find.byName(driver,"bank_licence_electronic").sendKeys("F:\\desk\\测试资料\\测试用图\\注册图片\\bank.jpg");
//
////	  //勾选复选框
////	  find.byId(driver,"is_settlement_account").click();
////结算
//	  //银行账户名settlement_bank_account_name
//	  find.byId(driver,"settlement_bank_account_name").clear();
//	  find.byId(driver,"settlement_bank_account_name").sendKeys("张小斐");
//
//	//公司银行账号settlement_bank_account_number
//	  find.byId(driver,"settlement_bank_account_number").clear();
//	  find.byId(driver,"settlement_bank_account_number").sendKeys("312345678901234567");
//
//	//开户银行支行名称settlement_bank_name
//	  find.byId(driver,"settlement_bank_name").clear();
//	  find.byId(driver,"settlement_bank_name").sendKeys("中国国际建设银行（北京西小口路）");
//
//	//支行联行号
////	  find.byId(driver,"settlement_bank_code").clear();
////	  find.byId(driver,"settlement_bank_code").sendKeys("312345678901234568");
////
//	//开户银行所在地#div_settlement > table > tbody > tr:nth-child(4) > td > select
//
//	  find.bySelector(driver,"tbody > tr:nth-child(4) > td > select").click();
//	  Select provincial1 = new Select(find.bySelector(driver,"tbody > tr:nth-child(4) > td > select"));
//      provincial1.selectByValue("22");//定位省直辖市：重庆
//
//	  find.bySelector(driver,"#div_settlement > table > tbody > tr:nth-child(4) > td > select:nth-child(2)").click();
//	  Select city1 = new Select(find.bySelector(driver,"#div_settlement > table > tbody > tr:nth-child(4) > td > select:nth-child(2)"));
//	  city1.selectByValue("62");//定位城市：重庆市
//
//	  find.bySelector(driver, "#div_settlement > table > tbody > tr:nth-child(4) > td > select:nth-child(3)").click();
//	  Select town1 = new Select(find.bySelector(driver, "#div_settlement > table > tbody > tr:nth-child(4) > td > select:nth-child(3)"));
//	  town1.selectByValue("356");//定位县城:渝北区
//
//////税务登记证
////	  //税务登记证号
////
////	  find.bySelector(driver,"table:nth-child(3) > tbody > tr:nth-child(1) > td > input").clear();
////	  find.bySelector(driver,"table:nth-child(3) > tbody > tr:nth-child(1) > td > input").sendKeys("500116070339448");
////	  //*纳税人识别号
////
////	  find.bySelector(driver,"table:nth-child(3) > tbody > tr:nth-child(2) > td > input").clear();
////	  find.bySelector(driver,"table:nth-child(3) > tbody > tr:nth-child(2) > td > input").sendKeys("412345678912345678");
//////	  System.exit(0);//暂停
//	  try {
//		  Thread.sleep(500);
//		  } catch (InterruptedException e) {
//	      e.printStackTrace();
//		  }
////	  //税务登记证号电子版
////	  find.bySelector(driver,"table:nth-child(3) > tbody > tr:nth-child(3) > td > input.w60" ).sendKeys("F:\\desk\\测试资料\\测试用图\\注册图片\\bank.jpg");
////
//	  try {
//		Thread.sleep(500);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//			}
//
//
//	  find.bypartialLink(driver,"提交店铺经营信息").click();
//
////店铺经营信息
//	  //店铺名称
//	  find.byName(driver,"store_name").clear();
//	  find.byName(driver,"store_name").sendKeys("测试ERP01");
//
//	//店铺等级
//	  find.byName(driver,"sg_id").click();
//	  Select store = new Select(find.byName(driver,"sg_id"));
//	  store.selectByValue("1");//系统默认 (商品数：不限 模板数：6 收费标准：0.00 元/年 附加功能：富文本编辑器)
//
//	  try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	  //开店时长
//	  find.byName(driver,"joinin_year").click();
//	  Select year = new Select(find.byName(driver,"joinin_year"));
//	  year.selectByValue("2");//经营2年
//
//	  //店铺分类
//	  find.byName(driver,"sc_id").click();
//	  Select classify = new Select(find.byName(driver,"sc_id"));
//	  classify.selectByValue("21");//维修保养 (保证金：0 元)
//	  try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	  //-------------------第一批分类
//	  //经营类目
//	  find.bypartialLink(driver,"选择添加类目").click();
//	  //一级分类
//
//	  find.bySelector(driver,"#gcategory_class1").click();
////	  try {
////			Thread.sleep(2000);
////		} catch (InterruptedException e1) {
////			// TODO Auto-generated catch block
////			e1.printStackTrace();
////		}
//	  find.waitWebElement(driver,By.cssSelector("#gcategory_class1"), 10);
//	  Select classify1 = new Select(find.bySelector(driver,"#gcategory_class1"));
//	  classify1.selectByValue("1923");//一级分类维修保养
//
//	  find.waitWebElement(driver, By.cssSelector("#gcategory > select.class-select"), 20);
//	  //二级分类
//	  find.bySelector(driver, "#gcategory > select.class-select").click();
//	  Select classify2 = new Select(find.bySelector(driver, "#gcategory > select.class-select"));
//	  classify2.selectByValue("1924");//二级分类轮胎轮毂
//	  //三级分类
//	  find.bySelector(driver, "#gcategory > select:nth-child(3)").click();
//	  Select classify3 = new Select(find.bySelector(driver, "#gcategory > select:nth-child(3)"));
//	  classify3.selectByValue("1925");//三级分类轿车轮胎
//
//	  //确认
//	  find.byId(driver,"btn_add_category").click();
//	  //-------------------第二批分类
//
//	//经营类目
//	  find.bypartialLink(driver,"选择添加类目").click();
//	  //一级分类维修保养
//	  find.bySelector(driver,"#gcategory_class1").click();
//	  find.waitWebElement(driver,By.cssSelector("#gcategory_class1"), 10);
//	  Select classify11 = new Select(find.bySelector(driver,"#gcategory_class1"));
//	  classify11.selectByValue("1923");//一级分类维修保养
//	  //二级分类
//
//	  try {
//		  Thread.sleep(1000);
//		  } catch (InterruptedException e) {
//	      e.printStackTrace();
//		  }
//	  find.bySelector(driver, "#gcategory > select.class-select").click();
//	  Select classify22 = new Select(find.bySelector(driver, "#gcategory > select.class-select"));
//	  classify22.selectByValue("1929");//二级分类润滑油
//	  //三级分类
//	  find.bySelector(driver, "#gcategory > select:nth-child(3)").click();
//	  Select classify33 = new Select(find.bySelector(driver, "#gcategory > select:nth-child(3)"));
//	  classify33.selectByValue("1930");//三级分类汽机油
//
//	  //确认
//	  find.byId(driver,"btn_add_category").click();
//
//	  //提交申请
//	  find.bypartialLink(driver,"提交申请").click();
//
//
//}
//  @BeforeTest
//  public void beforeTest() {
//
////	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//
//			 driver = new ChromeDriver();
////	   		 driver = new FirefoxDriver();
//			 driver.manage().window().maximize();
//			 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//			 driver.get("http://hebing.jybd.cn");
//
//  }
////  @AfterTest
////  public void afterTest() {
////
////	  driver.close();
////  }
//  }
//
//
