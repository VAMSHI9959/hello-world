package com.practise;

public class IsIncreasingOrder {
    public static boolean findIncreasingOrderOrNot(String s){
        boolean result=true;
      char[] ch=s.toCharArray();//12345
      for(int i=0;i<ch.length-1;i++){
          int value=Integer.parseInt(ch[i]+ "");
          int value1=Integer.parseInt(ch[i+1] + "");
          if(value<value1){
              result=true;
          }else {
              result = false;
              break;
          }
      }
        return result;
    }
}
