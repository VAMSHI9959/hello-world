package com.practise;

public class NumberOfCharacters {
    public static int findNumberOfCharacters(String s){
        int result=0;
        String[] str=s.split(" ");
        if(str[0].equals(str[str.length-1])){
            result=str[0].length();
        }else{
            result=str[0].length()+str[str.length-1].length();
        }
        return result;
    }
}
