public class Stringtemplate {


    public static void main(String[] args) {

        String s = "krankrankk";

        String duplicatecontainer  = "";
        boolean hasDuplicates = false;

        String ns = "";
        // Initialize counters
        int count = 0;           // Total count of valid characters
        int countl = 0;          // Count of lowercase letters
        int countletter = 0;     // Count of letters (both lowercase and uppercase)
        int countd = 0;          // Count of digits
        int countwhitespace = 0; // Count of whitespace characters

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            if(!Character.isUpperCase(c)){



                ns  = Character.toUpperCase(c) + ns ; // we can change case of word and add in string and reverse also

            count++;
            }
      // see this will add reverse way

           /* if(duplicatecontainer.indexOf(c)  == -1) {

                duplicatecontainer+= c ;
            }*/


            if(duplicatecontainer.indexOf(c)  != -1) {

                System.out.println("Duplicate character found: " + c);


                hasDuplicates = true;

                break;

            }

            duplicatecontainer += c;    // duplicatecontainer.indexOf(c)  == -1 this means we can add the char no dup


//            System.out.print("print all character "  + (int)c  );


        }


        if(hasDuplicates) {

            System.out.println("duplicated character");




        }else
            System.out.println("no duplicated character");


        System.out.print("new string:"+  ns + " count: " + count );

        System.out.println( );

        System.out.print( duplicatecontainer);



        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            if (Character.isUpperCase(c)  ) {

                count++;

            }


        }
// System.out.println(count);



        }




    }
