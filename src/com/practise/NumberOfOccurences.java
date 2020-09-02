package com.practise;

public class NumberOfOccurences {
    public static int findNumberOfOccurences(String[] input1,String input2){

        int count=0;
        for (int k=0;k<input1.length;k++){
            String[] str=input1[k].split(" ");
            for(int i=0;i<str.length;i++){
                if(input2.equals(str[i])){
                    count=count+1;
                }
            }
        }

        return count;
    }
}
