package cn.jybd.www.testCase;

import cn.jybd.www.base.BaseTestCase;
import cn.jybd.www.pageModle.Register;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register1  extends  BaseTestCase{
    //门店注册
    @Test(dataProvider = "data")//必须等于  feeder  固定的

    public void test(String phoneNember) {
      Register register=new Register();
      register.chain_admin(phoneNember);
      System.out.println(phoneNember);
    }

    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {"15011111161"},
                {"15011111162"},
//                {"15011111123"},
//                {"15011111124"},
//                {"15011111125"}
        };

    }
    //车主注册
//    @Test()
//    public void testName() {
//        Register register=new Register();
//        register.c("15011111161");
//        System.out.println("15011111161");
//    }
    //供应商入驻
//    @Test(dataProvider = "data")
//    public void t(String phoneNember) {
//        Register register=new Register();
//        register.store_admin(phoneNember);
//        System.out.println(phoneNember);
//    }



}
