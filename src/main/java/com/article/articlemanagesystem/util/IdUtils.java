package com.article.articlemanagesystem.util;

import java.util.Random;

public class IdUtils {

    private static String words = "abcdefghijklmnopqrstuvwxyz0123456789";

    public static String genUserename(){
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        // 首位数字，以区别与原始数据
        builder.append(random.nextInt(10));

        for (int i = 0; i < 7; i++) {
            builder.append(words.charAt(random.nextInt(words.length())));
        }
        return builder.toString();
    }
}
