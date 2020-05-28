package com.epita.socra.app.tools;

import java.util.Arrays;
import java.util.List;

public class ArabicTranslater {

    public static String TranslateToArabic(String roman) {
        List<String> m = Arrays.asList("","M", "MM", "MMM");
        List<String> c = Arrays.asList("","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");
        List<String> d = Arrays.asList("","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
        List<String> u = Arrays.asList("","I","II","III","IV","V","VI","VII","VIII","IX");
        StringBuilder res = new StringBuilder();
        return "";
    }
}
