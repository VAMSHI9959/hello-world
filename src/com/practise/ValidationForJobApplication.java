package com.practise;

public class ValidationForJobApplication {
    public static boolean registeringTheDetailsOfJobSeeker(String s){
        boolean jobHolder=true;
if(s.endsWith("_job")){
    String str=s.substring(0,s.indexOf('_'));
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
