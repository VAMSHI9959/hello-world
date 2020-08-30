package com.practise;

public class SumOfArray {
    public static int addNumbersOfArray(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
        }
        return temp;
    }
}