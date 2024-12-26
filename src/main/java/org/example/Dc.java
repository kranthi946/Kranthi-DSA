package org.example;

import java.util.HashMap;
import java.util.Map;

public class Dc {




    public static  void main(String[] args){



        StringBuilder sb = new StringBuilder();
        int td  = 0 ;
        String s  =  "kkrakranthi";

        boolean  hd = false;

        Map<Character,Integer>   cm = new HashMap<>();



        for(int i = 0 ; i < s.length();i++) {

            char c = s.charAt(i);
            cm.put(c, cm.getOrDefault(c, 0) + 1);

        }




 for(Map.Entry<Character,Integer>   entry :  cm.entrySet()){


//cm.forEach((key,value) -> {

   //  if(value>1)
//System.out.println(key+":"+value);
//});

     if(entry.getValue()>1){

         td++;

         hd = true;

         System.out.println(entry.getKey()  + " apears " + entry.getValue() + "  times");

sb.append(entry.getKey());



     }
 }

 System.out.println(td);
 System.out.println(hd);

 System.out.println(sb.toString());

    }
}
