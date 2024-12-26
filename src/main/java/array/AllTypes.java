package array;

import java.util.stream.IntStream;

public class AllTypes {


    public static void main(String[] args) {


        int sum = 0 ;

        int[]  p = IntStream.range(0, 100).toArray();

        for (int i = 0 ; i < p.length;i++){

            p[i] = i ;

            if(p[i]%2 == 0 ){

                sum += p[i];
            }

        }


        System.out.println(sum);
    }
}
