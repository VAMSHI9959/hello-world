package com.practise;

import javax.swing.*;

public class EmailValidation {
    public static boolean findGivenEmailISValidOrNot(String s){

        boolean validation=true;
        int count=0;
        String str="";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='@'){
                count=count+1;
            }
        }
        if(count==1)
        {
            if(s.endsWith(".com"))
            {
                str=s.substring(s.indexOf('@')+1,s.indexOf('.'));
                if(str.length()==5)
                {
                    validation = true;
                }else {
                    validation=false;
                }
            }else {
                validation=false;
            }
        }else{
            validation=false;
        }
return validation;
    }

}
