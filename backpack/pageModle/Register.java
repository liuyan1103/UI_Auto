package cn.jybd.www.pageModle;

import cn.jybd.www.commonClass.DataCode;
import cn.jybd.www.util.SeleniumUtil;
import org.openqa.selenium.By;

public class Register {
    //门店
    public void chain_admin(String phoneNember) {
        SeleniumUtil seleniumUtil1 = SeleniumUtil.getInstance();
        seleniumUtil1.get("https://gc.jybd.cn/member/index.php?act=login&op=register");
        seleniumUtil1.clear(By.id("phone_chain"));
        seleniumUtil1.type(By.id("phone_chain"), phoneNember);

        seleniumUtil1.pause(2000);
        seleniumUtil1.type(By.name("captcha"), "8888");
        seleniumUtil1.pause(50000);
        seleniumUtil1.click(By.xpath("//*[@id=\"magine\"]/span"));
//        JdbcUtil util = new JdbcUtil();
        DataCode jd = new DataCode();
        String sql = "select log_captcha from shopnc_sms_log where log_phone = " + phoneNember + " order by  log_id desc limit 0,1";
        String field = "log_captcha";
        String sms_captcha = jd.query(sql, field);
        //从数据库提取验证码
        seleniumUtil1.pause(2000);
        System.out.println(sms_captcha);
        seleniumUtil1.type(By.id("sms_captcha_chain"), sms_captcha);

        seleniumUtil1.pause(2000);
        seleniumUtil1.click(By.id("submitBtnchain"));

    }
    //车主
    public void c(String phoneNember) {

        SeleniumUtil seleniumUtil1 = SeleniumUtil.getInstance();
        seleniumUtil1.click(By.linkText("车主注册"));
        seleniumUtil1.get("https://gc.jybd.cn/member/index.php?act=login&op=register");
        seleniumUtil1.clear(By.id("phone"));
        seleniumUtil1.type(By.id("phone"), phoneNember);
        seleniumUtil1.pause(2000);
        seleniumUtil1.type(By.name("image_captcha"), "8888");
        seleniumUtil1.pause(2000);
        seleniumUtil1.click(By.xpath("//*[@id=\"huoqu\"]/span"));
//        JdbcUtil util = new JdbcUtil();
        DataCode jd = new DataCode();
        String sql = "select log_captcha from shopnc_sms_log where log_phone = " + phoneNember + " order by  log_id desc limit 0,1";
        String field = "log_captcha";
        String sms_captcha = jd.query(sql, field);
        //从数据库提取验证码
        seleniumUtil1.pause(2000);
        System.out.println(sms_captcha);
        seleniumUtil1.type(By.id("sms_captcha"), sms_captcha);

        seleniumUtil1.pause(2000);
        seleniumUtil1.click(By.id("submitBtn"));

    }
    //供应商store_admin
    public void store_admin(String phoneNember) {

        SeleniumUtil seleniumUtil1 = SeleniumUtil.getInstance();
        seleniumUtil1.click(By.linkText("供应商入驻"));
        seleniumUtil1.get("https://gc.jybd.cn/member/index.php?act=login&op=register");
        seleniumUtil1.clear(By.id("phone_store"));
        seleniumUtil1.type(By.id("phone_store"), phoneNember);
        seleniumUtil1.pause(2000);
        seleniumUtil1.type(By.name("image_captcha_store"), "8888");
        seleniumUtil1.pause(2000);
        seleniumUtil1.click(By.xpath("//*[@id=\"supplier_store\"]/span"));
//        JdbcUtil util = new JdbcUtil();
        DataCode jd = new DataCode();
        String sql = "select log_captcha from shopnc_sms_log where log_phone = " + phoneNember + " order by  log_id desc limit 0,1";
        String field = "log_captcha";
        String sms_captcha = jd.query(sql, field);
        //从数据库提取验证码
        seleniumUtil1.pause(2000);
        System.out.println(sms_captcha);
        seleniumUtil1.type(By.id("sms_captcha_store"), sms_captcha);

        seleniumUtil1.pause(2000);
        seleniumUtil1.click(By.id("submitBtnStore"));

    }
}