package com.practise;

public class NumberOfOccurences {
    public static int findNumberOfOccurences(String[] input1,String input2){
        int count=0;
     for(int i=0;i<input1.length;i++){
         if(input1[i].contains(input2)){
             count=count+1;
         }
     }
        return count;
    }
}
