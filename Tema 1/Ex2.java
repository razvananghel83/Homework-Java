package Tema;

import java.util.Arrays;

public class Ex2 {

    public static void main( String[] args ) {

        // a)
        int[] arr1 = { 1, 7, 4, 3, 9, 1 };
        int[] arr2 = { 6, 4, 2, 8 };

        bubbleSort( arr1 );
        bubbleSort( arr2 );

        System.out.println( "Array 1 sortat: " + Arrays.toString( arr1 ) );
        System.out.println( "Array 2 sortat: " + Arrays.toString( arr2 ) );

        // c)
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[ arr1.length + arr2.length ];

        while( i < arr1.length && j < arr2.length ) {

            if( arr1[ i ] < arr2[ j ] )
                arr3[ k++ ] = arr1[ i++ ];
            else
                arr3[ k++ ] = arr2[ j++];

        }

        while( i < arr1.length )
            arr3[ k++ ] = arr1[ i++ ];

        while( j < arr2.length )
            arr3[ k++ ] = arr2[ j++ ];

        System.out.println( Arrays.toString( arr3 ) );

//        Array1 initial: [1, 7, 4, 3, 9, 1]
//        Array1 sortat crescator: [1, 1, 3, 4, 7, 9]
//        Array2 initial: [6, 4, 2, 8]
//        Array2 sortat crescator: [2, 4, 6, 8]
//        Output: [1, 1, 2, 3, 4, 4, 6, 7, 8, 9]
    }

    // b)
    public static void bubbleSort( int[] arr ) {

        for( int i = 0; i < arr.length - 1; i++ ) {

            int temp;
            boolean ordered = true;

            for ( int j = 0; j < arr.length - i - 1; j++)

                if ( arr[ j ] > arr[ j + 1 ] ) {

                    ordered = false;
                    temp = arr[ j ];
                    arr[ j ] = arr[ j + 1 ];
                    arr[ j + 1 ] = temp;
                }

            if ( ordered )
                break;
        }
    }
}
