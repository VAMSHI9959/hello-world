package com.practise;

public class PerfectCouple {
    public static boolean separateHusbandAndWifeName(String s){
    String[] str= s.split("-");
    char[] hname= str[0].toCharArray();
    char[] wname= str[1].toCharArray();
    boolean perfectCouple=true;
    if(hname.length==wname.length) //VIMAL-MALIV
    {
        for(int i=0;i<hname.length;i++){
            for(int j=0;j<wname.length;j++){
                if(hname[i]==wname[j]){
                    perfectCouple=true;
                    break;
                }else{
                    perfectCouple=false;
                }
            }
        }
    }else{
        perfectCouple=false;
    }

        return perfectCouple;
    }

}
