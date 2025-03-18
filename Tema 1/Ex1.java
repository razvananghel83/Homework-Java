package Tema;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Ex1 {

    public static void main( String[] args ) {

        // a)
        Scanner sc = new Scanner( System.in );
        System.out.println( "Introduceti un numar intreg intre 0 si 5:" );
        int n = sc.nextInt();

        while( n < 0 || n > 5 ) {

            System.out.println( "Numarul introdus este invalid!" );
            System.out.println( "Introduceti un numar intreg intre 0 si 5:" );
            n = sc.nextInt();
        }

        // b)
        int[] arr = new int[ n ];
        System.out.println( "Introduceti " + n + " numere: " );

        for( int i = 0; i < n; i++ )
            arr[ i ] = sc.nextInt();

        System.out.println( "Tabloul este: " + Arrays.toString( arr ) );
        reverse( arr );
        System.out.println( "Tabloul inversat este: " + Arrays.toString( arr ) );

//        Input: [2, 4, 1, 5, 3]
//        Output: [3, 5, 1, 4, 2]
    }

    // c)
    public static void reverse( int[] arr ) {

        for( int i = 0; i < arr.length / 2; i++ ) {

            int temp = arr[ i ];
            arr[ i ] = arr[ arr.length - i - 1 ];
            arr[ arr.length - i - 1 ] = temp;
        }
    }


}
