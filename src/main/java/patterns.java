public class patterns {


    public static void main(String[] args) {

       int n = 868 ;
        int m = n ;

        int sum = 0 ;

        while(n !=0){

            int d  = n %10 ;

         sum = sum * 10 + d ;

            System.out.println(d);


            n = n /10;

        }

if(sum == m )

    System.out.println("yes");

else System.out.println("no");

    }
}
