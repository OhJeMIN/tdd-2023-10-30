package com.ll;

public class Calc {
    public static int run(String s) {
        if (s.isBlank()) return 0;

        s = stripOuterParentheses(s);

        String[] num = s.split(" ");
        String sign = num[1];
        int num1 = Integer.parseInt(num[0].trim());
        int num2 = Integer.parseInt(num[2].trim());
        final int rs = switch (sign) {
            case "+":
                yield  num1 + num2;
            case "-":
                yield num1 - num2;
            case "/":
                yield num1 / num2;
            default:
                yield num1 * num2;
        };
        return rs;
    }

    private static String stripOuterParentheses(String s) {
        while(s.contains("(") || s.contains(")")){
            s = s.substring(1, s.length()-1);
        }
        return s;
    }
}

