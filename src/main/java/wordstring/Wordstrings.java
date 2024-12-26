package wordstring;

public class Wordstrings {


    // template :
    //word level processing

    // space will  give one word

    // first initialise  a empty word

    // initialise a  string with concatenate space

    // convert string to char and use if condition then if !c = ' ' then we will w = w+c else word processing

    public static void main(String[] args) {

int count = 0;
        String s = "bob is small";
        String w = ""; s +=" ";String lw = ""; String ns = "";


        for (int i = 0; i < s.length(); i++) {
char c = s.charAt(i);
if(c!= ' ')
    w += c;
else {

   // System.out.print(w + " "); // print all words


   // System.out.print(w.charAt(0));  // this will pull first char of each word

   //System.out.print(w.substring(0,2) + " ");// print first 2 char


//    if(w.startsWith("R"))
//        System.out.println(w);

//    if(w.endsWith("R"))
//        System.out.println(w);


//    if(w.contains("R"))
//        System.out.println(w);

//    if(w.length()==3)
//        System.out.println(w);

//    char f = w.charAt(0);
//    char g = w.charAt(w.length()-1);
//
//    if(Character.toUpperCase(f) == Character.toUpperCase(g))
//    System.out.print(w);


//    if(w.length()>lw.length())
//
//        lw = w;


//    if(w.equalsIgnoreCase("all"))
//        count++;


//    count++;

//    if(w.endsWith("D"))
//
//        count++;


//    if(w.equals("Red"))
//
//        ns = ns + "BLUE"+ " ";
//    else ns = ns +w + " ";


//    if(!w.equals("Red"))
//
//        ns = ns + w + " ";




    w = "";



}


        }
     //   System.out.println(lw); // longest word

        // System.out.println("number of words " + count);



    }
}
