package cn.jybd.www.testCase;

import cn.jybd.www.base.BaseTestCase;
import cn.jybd.www.pageModle.LoginPage.LoginMd;
import cn.jybd.www.pageModle.mdPurchase;
import org.testng.annotations.Test;
/*
* @author:lijiang
* @date:2018-08-10
* @function:门店登录--购买商品---商家发布商品
* */
public class mdLogin extends BaseTestCase {
    @Test
    public void test() {
        LoginMd md =new LoginMd();
        md.login("ceshi22","123456");
        mdPurchase mdp=new mdPurchase();
        mdp.mdpurchase();
    }
}
