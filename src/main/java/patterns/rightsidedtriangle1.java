package patterns;

public class rightsidedtriangle1 {


    public static void main(String[] args) {

int n = 5;


for( int i = 1 ; i <= n ; i ++) {


    for(int  j = 1 ; j <= i ; j ++) {

        System.out.print("  ");   // here inside how many inout char above also same char should be there
    }

    for(int  j = i ; j < n ; j ++) {

        System.out.print("* ");   // here inside how many inout char above also same char should be there
    }

    for (int j = i; j <=n; j++) {

        System.out.print("* ");   // here 2 spaces we need to give

    }






System.out.println();
}

    }
}
