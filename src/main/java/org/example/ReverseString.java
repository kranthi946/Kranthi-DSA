package org.example;

public class ReverseString {



    public static void main (String[] args) {


        String str = "hello";

        char[]  c = str.toCharArray();

        for(int i = c.length - 1; i >= 0; i--) {

            System.out.print(c[i]);
        }

        System.out.println();


        for(int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));
        }


        System.out.println();



        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb.reverse());


        System.out.println();

        StringBuilder sb1 = new StringBuilder(str);


        System.out.println(sb1.reverse());
    }





}

