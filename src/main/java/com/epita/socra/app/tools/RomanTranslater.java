package com.epita.socra.app.tools;

import java.util.Arrays;
import java.util.List;

public class RomanTranslater implements Translater {
    private String toRoman(int decimal){
        List<String> m = Arrays.asList("","M", "MM", "MMM");
        List<String> c = Arrays.asList("","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");
        List<String> d = Arrays.asList("","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
        List<String> u = Arrays.asList("","I","II","III","IV","V","VI","VII","VIII","IX");
        StringBuilder res = new StringBuilder();

        res.append(m.get(decimal/1000));
        res.append(c.get((decimal/100)%10));
        res.append(d.get((decimal/10)%10));
        res.append(u.get(decimal%10));
        return res.toString();

    }

    //gets input, returns translation
    public String Translate(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number > 3000){
                return "Expected value lower than 3000";
            }
            else if (number < 0){
                return "Positive value expected";
            }
            //arabic négatif / >3000?
            return toRoman(number);
        } catch (NumberFormatException e) {
            return "Could not translate input into integer";
        }
    }
}
