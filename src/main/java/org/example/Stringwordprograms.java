package org.example;

public class Stringwordprograms {


    public static void main(String[] args) {


        /*
        //template :

        i am kranthi
        for each word there will be ending with space */

        String samecharword = "";
        String s = "anna  ind is bob";
        s += " ";   // HERE ADDING SPACE END OF THE STRING
        int countscw = 0;
        String ns = "";

        String w = "";   // storing the word here
        int count1 = 0;

        boolean hasword = false;

        String longestword = "";

       /* char f =   w.charAt(0);
     we cant initialise this because program didnt started and word is not stored
        char l = w.charAt(w.length());*/

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c != ' ') {
                //   w += c;


                w = w + c;
                // w = c+w;    // ® reversing the word   with the revesr char
            } else {

                //System.out.println(w);

                // System.out.println(w.charAt(0));

                //   System.out.println(w.substring(0,2));

                if (w.startsWith("k")) {

                    System.out.println(w);


                }

                if (w.endsWith("k")) {

                    System.out.println(w);


                }


                if (w.contains("k")) {

                    System.out.println(w);


                }


                if (w.length() == 3) {

                    System.out.println(w);


                }


                if (w.length() > 0 && w.charAt(0) == w.charAt(w.length() - 1)) {


                  char j =   w.charAt(0);


                  j = Character.toUpperCase(j);


                    if (countscw++ % 2 == 0)    // here changing captilise of word


                       // samecharword = samecharword + w.toUpperCase() + " ";


                        samecharword = samecharword + j + w.substring(1)+ " " ; // this will change case of first letter


                    else

                        samecharword = samecharword + w.toLowerCase() + " ";

                }


                if (w.length() > longestword.length()) {

                    longestword = w;


                }


                if (w.equalsIgnoreCase("india")) {

                    hasword = true;

                }


                if (w.equals("ind"))

                    ns = ns + "RED" + " ";


                count1++;
                w = "";


            }


        }

        // System.out.println(longestword);

        System.out.println(hasword);

        System.out.println(count1);
        System.out.println(ns);

        System.out.print("First and last characters  of same char word: " + samecharword);
    }

}


