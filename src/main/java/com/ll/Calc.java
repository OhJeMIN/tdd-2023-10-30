package com.ll;

public class Calc {
    private int answer;
    public static int run(String s){
        String[] cmd = s.split(" ");
        int[] arr = new int[cmd.length];
        for(int i=0;i<cmd.length;i++){
            if(cmd[i].equals("*")){
                arr[i+1] = Integer.parseInt(cmd[i-1]) * Integer.parseInt(cmd[i+1]);
            }
        }
        return arr[cmd.length-1];
    }
}
