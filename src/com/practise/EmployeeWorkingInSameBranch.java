package com.practise;

public class EmployeeWorkingInSameBranch {

    public static String[] namesOfEmployeesWorkingInBothBranches(String[] arr1, String[] arr2){
       String[] res = new String[arr1.length];
       int l=0;
       for (int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){
               if(arr1[i]==arr2[j]){
                 res[l]=arr1[i];
                 l++;
               }
           }
       }
       return res;
    }
}
