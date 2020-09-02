package com.practise;

public class DifferenceBetweenTwoConsecutiveDigits {
    public static int findDifferenceBetweenTwoConsecutiveDigits(String s) {
        char[] ch = s.toCharArray();//23435
        int k=0;
        String str="";
        for (int i = 0; i < ch.length-1; i++) {
            int value1 = Integer.parseInt(ch[i] + "");
            int value2 = Integer.parseInt(ch[i + 1] + "");
                if (value1 > value2) {
                   k = value1 - value2;
                   str=str+k;
                } else {
                    k = value2 - value1;
                    str=str+k;
                }
                if(i==ch.length-2){
                   k=value2;
                   str=str+k;
                }
            }
        int result=Integer.parseInt(str);
        return result;
    }
}
