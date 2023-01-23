package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (str == null) {
                return false;
            }
            double number = NumberUtils.toDouble(str);

            if(number <= 0){
                return  false;
            }
        }
        return true;
    }
}