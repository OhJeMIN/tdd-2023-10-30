package com.ll;

public class Calc {
    public static int run(String s) {
        if (s.isBlank()) return 0;

        String[] num = s.split(" ");
        String sign = num[1];
        int num1 = Integer.parseInt(num[0].trim());
        int num2 = Integer.parseInt(num[2].trim());
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            default:
                return num1 * num2;


        }
    }
}

