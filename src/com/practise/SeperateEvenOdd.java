package com.practise;

public class SeperateEvenOdd {
    public static void separateEvenAndOddNumbersFromIntegerArray(int[] arr22) { //{1, 2, 3 ,4}
        int[] arr1 = new int[arr22.length];
        int[] arr2 = new int[arr22.length];
        int j = 0, k = 0;
        for (int i = 0; i < arr22.length; i++) {
            if (arr22[i] % 2 == 0)
            {
                arr1[j] = arr22[i];
                j++;
            }else{
                arr2[k] = arr22[i];
                k++;
            }
            System.out.println(arr1);
            System.out.println(arr2);

        }
    }
}

