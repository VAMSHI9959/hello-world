package com.practise;

public class Main {

    public static void main(String[] args) {
	// write your code here
     char[] arr=ReverseOfString.reverseOfString("vamshi");
        System.out.println(arr);
       char[] ch1 = EvensFromString.evenIndicesFromString("vamshi");
        System.out.println(ch1);
       EvenOddArray.separateEvenAndOddNumbersFromIntegerNumber(1234);

       //int[] arr22 = SeperateEvenOdd.separateEvenAndOddNumbersFromIntegerArray[1,2,3,4];
        int[] input=new int[]{1, 2, 3, 4};
        int temp = SumOfArray.addNumbersOfArray(input);
        System.out.println(temp);

        MinAndMaxNumFromArray.minAndMaxNumFromArray(new int[]{2134, 777, 43256, 985, 3765});
    }
}
