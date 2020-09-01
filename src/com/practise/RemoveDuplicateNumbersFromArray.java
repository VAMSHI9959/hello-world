package com.practise;

public class RemoveDuplicateNumbersFromArray {
    public static void findDuplicateNumbers(int[] a){ //{3,4,0,3,2,5}
        int[] result=new int[a.length];
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=0;
                }
            }
            for(int k=0;k<a.length;k++){
                if(k==a.length-1){
                    break;
                }
               else if(a[k]<a[k+1]){
                    temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
        for (int b:a) {
            System.out.print(b+" ");
        }
    }
}
