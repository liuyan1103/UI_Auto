package cn.jybd.www.pageshelper;

import cn.jybd.www.util.SeleniumUtil;
import org.openqa.selenium.By;


/**
 * @description 这个帮助类主要是进行frame的跳进和跳出的操作
 * */
public class FramePageHelper {

    /** 进入frame-根据frame的元素定位进入 */
    public static void jumpInToFrame(SeleniumUtil seleniumUtil, By by) {
        seleniumUtil.switchFrame(seleniumUtil.findElementBy(by));
    }

    /** 回到默认的frame */
    public static void jumpOut(SeleniumUtil seleniumUtil) {

        seleniumUtil.outFrame();
    }
}
