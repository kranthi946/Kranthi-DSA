package org.example;

public class Stringprograms {


    public static void main(String[] args) {
        String s = "29d 34k42raSWFRFRn33thi";

        String d = "", r = "", caseofstring = "" , rev = "";

        int count = 0, countl = 0;
        for (int i = 0; i < s.length(); i++) {

            {


                char c = s.charAt(i);


                rev = c+ rev;



                if (Character.isDigit(c)) {

                    d = d + c;

                } else if (!Character.isWhitespace(c)) r = r + c; // here handling space





                if(Character.isUpperCase(c)){

                    caseofstring = caseofstring + Character.toLowerCase(c);
                }else
                    caseofstring = caseofstring + Character.toUpperCase(c);
            }




            }




            // Output the results
            System.out.println("Digits: " + d);  // Output string containing digits
            System.out.println("Non-Digits: " + r);


            System.out.println(d + r.toUpperCase());


            System.out.println(caseofstring);

            System.out.println(rev);
            



        
        
        
    }

}
