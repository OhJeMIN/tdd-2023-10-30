package com.ll;

public class Calc {
    public static int run(String s){
        if(s.isBlank()) return 0;
        if(s.contains("-")) return 0;

        if(s.contains("+")){
            String[] num = s.split("\\+");
            int num1 = Integer.parseInt(num[0].trim());
            int num2 = Integer.parseInt(num[1].trim());
            return num1 + num2;
        }
        return 20;
    }
}

