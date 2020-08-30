package com.practise;

public class MinAndMaxNumFromArray {
    public static void minAndMaxNumFromArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("min value is=" + arr[0]);
        System.out.println("max value is=" + arr[arr.length-1]);

    }

}