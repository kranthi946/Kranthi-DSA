package org.example;

public class Strings {

    String s1 = "code"; // String literal
    String s3 = "code"; // Another reference to the same string literal
    // String s1 = s1 + "kranthi";

     // in this case whole new object will create in scp and s1 will poin to this new one


    String s2 = new String("code"); // String object created with 'new'


    // here jvm will create one heap object and one object will be create in string constant pool

    // it wont point to the scope but in future for reusability it will helps in memory optimisation


    // if already present in srtring constant pool jvm wont create another object

    public static void main(String[] args) {
        Strings s = new Strings(); // Create an instance of the Strings class

        // Print the identity hash codes (this simulates the address in memory)
        System.out.println("HashCode of s.s1 (string literal): " + System.identityHashCode(s.s1));
        System.out.println("HashCode of s.s3 (string literal): " + System.identityHashCode(s.s3));
        System.out.println("HashCode of s.s2 (new string object): " + System.identityHashCode(s.s2));

        // Compare references (==) to check if they point to the same object
        if (s.s1 == s.s2) {
            System.out.println("s1 and s2 have the same reference.");
        } else {
            System.out.println("s1 and s2 do not have the same reference.");
        }

        if (s.s1 == s.s3) {
            System.out.println("s1 and s3 have the same reference.");
        } else {
            System.out.println("s1 and s3 do not have the same reference.");
        }

        // Compare content using equals()
        if (s.s1.equals(s.s2)) {
            System.out.println("s1 and s2 have the same content.");
        } else {
            System.out.println("s1 and s2 do not have the same content.");
        }

        if (s.s1.equals(s.s3)) {
            System.out.println("s1 and s3 have the same content.");
        } else {
            System.out.println("s1 and s3 do not have the same content.");
        }
    }
}



