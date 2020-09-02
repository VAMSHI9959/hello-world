package com.practise;

public class ReverseOfString {
    public static String reverseOfString(String s){
        char[] arr=s.toCharArray();
        char[] arr1=new char[s.length()];
        int j=0;
        for (int i=s.length()-1;i>=0;i--){
//            System.out.print(arr[i]);
            arr1[j]=arr[i];
            j++;
        }
        String result=new String(arr1);
       return result;
    }

}