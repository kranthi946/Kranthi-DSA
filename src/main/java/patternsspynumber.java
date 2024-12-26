public class patternsspynumber {


    public static void main(String[] args) {

       int n = 1232323;
        int m = n ;

        int sum = 0 , prod = 1;

        while(n !=0){

            int d  = n %10 ;

         sum = sum  + d ; prod = prod * d ;




            n = n /10;

        }

if(sum+ prod == m )

    System.out.println("yes");

else System.out.println("no");

    }
}
