package com.practise;

public class PositiveString {
    public static boolean checkPositiveStringOrNot(String s){//"ANT"
        boolean result=true;
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length;i++){
          if(i==s.length()-1){
              break;
          }
           char ch1=ch[i];
           char ch2=ch[i+1];
           int value1=ch1;
           int value2=ch2;
           if(value1<value2){
               result=true;
           }else{
               result=false;
               break;
           }
        }
        return result;
    }
}
