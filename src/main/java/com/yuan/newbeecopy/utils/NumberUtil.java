package com.yuan.newbeecopy.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtil {
    public NumberUtil() {
    }

    /**
     * 判断是否为11位电话号码
     *
     * @param phone
     * @return
     */
    public static boolean isPhone(String phone) {
        Pattern pattern = Pattern.compile("^((13[0-9])|(14[5,7])|(15[^4,\\D])|(17[0-8])|(18[0-9]))\\d{8}$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
    public static int genRandomNum(int length){
        int num = 1;
        double randomNum = Math.random();
        if(randomNum<0.1){
            randomNum = randomNum+0.1;
        }
        for (int i = 0; i < length; i++) {
            num = num *10;
        }
        return (int) (num*randomNum);
    }
    /**
     * 生成订单流水号
     *
     * @return
     */
    public static String genOrderNo() {
        StringBuffer buffer = new StringBuffer(String.valueOf(System.currentTimeMillis()));
        System.out.println("buffer = " + buffer);
        int num = genRandomNum(4);
        buffer.append(num);
        return buffer.toString();
    }
}
