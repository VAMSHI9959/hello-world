package com.practise;

public class DifferenceBetweenTwoConsecutiveDigits {
    public static void findDifferenceBetweenTwoConsecutiveDigits(String s) {
        char[] ch = s.toCharArray();//23435
        int[] result = new int[s.length()];
        int l = 0;
        for (int i = 0; i < ch.length-1; i++) {
            int value1 = Integer.parseInt(ch[i] + "");
            int value2 = Integer.parseInt(ch[i + 1] + "");
                if (value1 > value2) {
                    result[l] = value1 - value2;
                    l++;
                } else {
                    result[l] = value2 - value1;
                    l++;
                }
                if(i==ch.length-2){
                    result[ch.length-1]=value2;
                }
            }
        for (int a : result) {
            System.out.print(a+" ");
        }
    }
}
