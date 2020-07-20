package com.practise;


public class EvenOddArray {
    public static void separateEvenAndOddNumbersFromIntegerNumber(int k) {//k=1234
        String str = Integer.toString(k);
        char[] arr = str.toCharArray();
        int[] arr1 = new int[str.length()];
        int[] arr2 = new int[str.length()];
//        char[] arr1 = new char[str.length()];
//        char[] arr2 = new char[str.length()];
        int l = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = Integer.parseInt(arr[i] + "");
            if (value % 2 == 0) {
                arr1[l] = value;
                l++;
            } else {
                arr2[m] = value;
                m++;
            }
        }

        for (int a:arr1) {
            System.out.print(a+" ");
        }

        System.out.println();
        for (int a:arr2) {
            System.out.print(a+" ");
        }
        System.out.println();
//       System.out.println(arr1);
//       System.out.println(arr2);
    }
    }

