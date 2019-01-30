package cn.jybd.www.util;


import org.testng.Assert;
/*
* @author:lijiang
* date:2018-08-14
* @function:重写assertEquals方法，断言失败就截图,然后再抛出error，以便系统能捕获该error
* */
public class AssertRewrite {
    public static void assertEquals(Object actual,Object expected ){
        try{
            Assert.assertEquals(actual, expected);
        }catch(Error e){
            //这里写截图操作
            throw e;//这里故意抛出error
        }
    }

    //重写assertNotEquals方法
    public static void assertNotEquals(Object actual,Object expected){

    }

    //重写assertNull方法
    public static void assertNull(Object object){

    }

    //后续可继续添加assert方法的重写，以实现更多断言功能

}
