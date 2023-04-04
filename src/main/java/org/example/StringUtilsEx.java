package org.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsEx {
    public static boolean isPositiveNumber(String x) {
        return StringUtils.isNumeric(x) && Integer.parseInt(x) > 0;
    }

    private StringUtilsEx() {
    }
}