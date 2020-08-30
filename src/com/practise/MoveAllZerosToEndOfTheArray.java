package com.practise;

public class MoveAllZerosToEndOfTheArray {
   public static void moveAllZerosToEndOfTheArray(int[] k){
       int temp;
    for (int i=0;i<k.length;i++) {
        for (int j = i + 1; j < k.length; j++) {
            if (k[i] == 0) {
                temp = k[i];
                k[i] = k[j];
                k[j] = temp;


            }
        }
    }
      for (int a: k)
       System.out.print(a+" ");
    }
}
