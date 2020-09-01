package com.practise;

public class IsAnyNumberOccurConsecutively {
    public static boolean findIsThereAnyConsecutiveNumber(int[] a){//{1,100,100}
        boolean result=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                result=true;
                break;
            }else{
                result=false;
            }
        }
        return result;
    }
}
