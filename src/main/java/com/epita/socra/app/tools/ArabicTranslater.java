package com.epita.socra.app.tools;

import java.util.Arrays;
import java.util.List;

public class ArabicTranslater implements  Translater{

    private int ArabicValue(char c){
        if (c == 'I'){
            return 1;
        }
        else if (c == 'V'){
            return 5;
        }
        else if (c == 'X'){
            return 10;
        }
        else if (c == 'L') {
            return 50;
        }
        else if (c == 'C'){
            return 100;
        }
        else if (c == 'D'){
            return 500;
        }
        else if (c == 'M'){
            return 1000;
        }
        else { //error case
            return 0;
        }
    }

    public String Translate(String roman) {
        int old_value = 0;
        int value = 0;

        int count = 0;

        int group = 0;
        Integer res = 0;
        for (int index = 0; index < roman.length(); index++){
            value = ArabicValue(roman.charAt(index));
            if (value == 0){
                return "Please enter Roman input";
            }
            if (old_value < value){
                if ((index > 0) && old_value * 10 < value) {
                    return "Please enter Roman input";
                }
                group = value - group;
                old_value = value;
            }
            else if (old_value == value){
                group += value;
            }
            else { //old_value > value
                res += group;
                old_value = value;
                group = value;
            }
        }
        if (group != 0) {
            res += group;
        }
        return res.toString();
    }
}
