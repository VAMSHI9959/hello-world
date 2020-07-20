package com.practise;

public class EvensFromString<ch1> {
    //
    public static char[] evenIndicesFromString(String v){
        char[] ch = v.toCharArray();
        char[] ch1 = new char[v.length()];
        int j=0;
        for (int i=0;i<v.length();i++){
            if (i % 2 == 0){
                ch1[j]=ch[i];
            }
            j++;
        }
        return ch1;
    }
}
