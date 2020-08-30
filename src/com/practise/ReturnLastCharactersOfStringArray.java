package com.practise;

public class ReturnLastCharactersOfStringArray {
    public static String findLastCharacters(String[] s)
    {
       String lastCharacters="";
        for(int i=0;i<s.length;i++){
            lastCharacters= lastCharacters+s[i].charAt(s[i].length()-1);
        }
    return lastCharacters;
    }
}
