package com.shan.lease.common.utils;

import java.util.Random;

/**
 * @Author: Steven
 * @Date: 2024/8/23
 * @Time: 下午6:37
 * @Description:
 */
public class CodeUtil {

    public static String getRandomCode(Integer length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
