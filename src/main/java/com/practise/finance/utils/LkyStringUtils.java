package com.practise.finance.utils;

import org.springframework.util.StringUtils;

public class LkyStringUtils {

    public static boolean isAllNotBlank(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            if (StringUtils.isEmpty(strings[i])) {
                return false;
            }
        }
        return true;
    }

    public static String convertObject(Object object) {
        if (object == null) {
            return "";
        }
        return object.toString();
    }
}
