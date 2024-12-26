package org.example;

public class ALLSTRINGPROGRAMS {


    //string program of 2 types 1. charbychar 2. wordbyword


 //   1.charbychar

    //print , count ,new string


    //character level processing

    // 2 types input we provide :

    //1. user input using scanner class


    // 2. instance variable

    //3. using function and passing as parameter



    //using string traversal

    //template

    // in string , character store in index with 0



    public static void main (String[] args) {
        String s = "kranthi";


        String sn = "" ;
        String d = "", r = "";



    int count = 0 , countl = 0;



        for (int i = 0; i < s.length(); i++) {


            char c = s.charAt(i);

        System.out.print(c + " ");


          //  System.out.print(c);

          //  System.out.println(c+" "+(int)c) ;

//if(Character.isUpperCase(c)){
//    System.out.print(c);
//
//}

            if(Character.isDigit(c) || Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isAlphabetic(c) ){
              //  System.out.print(c);

            }


            //System.out.println(c+" "+(int)c) ;


          if(Character.isUpperCase(c)){

              count++;
          }
            if(Character.isLowerCase(c)){

                countl++;
            }

         // System.out.println(count + "upper");







           // String sn = "";

            if(Character.isUpperCase(c)){

                sn = sn + c;


            }

            // here we need to put sysout outside loop because scope is outside storing



           // System.out.println(sn);









        }








    }
}
