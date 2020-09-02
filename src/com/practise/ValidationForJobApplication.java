package com.practise;

public class ValidationForJobApplication {
    public static boolean registeringTheDetailsOfJobSeeker(String s){
        boolean jobHolder=true;
if(s.endsWith("_job")){
    String st="_job";
    int indexValueOf_=s.length()-st.length();
    String str=s.substring(0,indexValueOf_-1);
    if(str.length()>=8){
        jobHolder=true;
    }else{
        jobHolder=false;
    }
}else{
    jobHolder=false;
}
        return jobHolder;
    }
}
