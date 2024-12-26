package org.example;

public class HHH {


    public static void main(String[] args) {
        String s = "aba";


        // based on change of string reverse and palindrome function acts

        String rev = "";


        for (int i = 0; i < s.length(); i++) {


            char c = s.charAt(i);


            rev = c + rev;

        }

            System.out.println(rev);
            if(s.equals(rev))

                System.out.println("YES it is palindrome");
            else
                System.out.println("NO");
        }

            }









