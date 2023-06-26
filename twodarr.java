public class twodarr {
    public static void main (String args[]){
        // declare
        // data_Type[][] name_Of_arr = new datatype[no_of_rows][no_of_columns]

        int[][] int_twod_array = new int[4][5];
        double[][] double_twod_Arr = new double[6][8];
        String[][] string_twd_arr = new String[3][4];
        // char byte

    // int_twod_arr  =
    //   [
    //         [01, 02, 03, 04, 05],
    //         [11, ,12 ,13 ,14 ,15],
    //         [21, 21, 23, 24, 25],
    //         [31, 32, 32, 34, 35], 
    //     ]
    // }
    // 35=>
    // int_twod_arr[3][4];

//    indexs=>  [
//     //         [00, 01, 02, 03, 04],
//     //         [10, ,11 ,12 ,13 ,14],
//     //         [20, 21, 22, 23, 24],
//     //         [30, 31, 32, 33, 34], 
//     //     ]
 
  
    int arr[] = new int[5];
    // arr[0] = 10;
    // arr[1] = 20;
    // arr[2] = 30;
    // arr[3] = 40;
    // arr[4] =50;
   for(int i=0; i<5; i++){
     arr[i] = (i+1)*10;
    }
    for(int i=0; i<5; i++){
        System.out.println(arr[i]);
    }

    //     [[1,  2,  3,  4,  5], 
    //     [6,  7,  8,  9,  10],
    //     [11, 12, 13, 14, 15], 
    //     [16, 17, 18, 19, 20] ] 

    //   indexs=>  [
//     //         [00, 01, 02, 03, 04],
//     //         [10, ,11 ,12 ,13 ,14],
//     //         [20, 21, 22, 23, 24],
//     //         [30, 31, 32, 33, 34], 
//     //     ]
// right diagonal
// row+col = columlength -1
// row++ col--;


int num = 1;
   for (int i =0; i<4; i++){
    // i =0
    // i= 1
    for(int j= 0; j<=4; j++){
        // i= 0, j=0
        // i=0 , j=1
        // // i= 0, j=2
        // // i=0, j=3
        // // i=0, j=4
        // //  i= 1, j=0
        // // i=1 , j=1
        // // i= 1, j=2
        // // i=1, j=3
        // // i=1, j=4
        int_twod_array[i][j] = num;
        num++;
    }
   }

   System.out.println("Two d array value");

      for (int i =0; i<4; i++){
         for(int j= 0; j<5; j++){
             System.out.print(int_twod_array[i][j] + " ");
        }
        System.out.println();
        }
        // print left diagonal values and right diagonal values
        // int_twod_array.length = rowth length
        
        // int leftarr[] = new int[4]; 4*4 16byte  1 loop
        // int rightarr[] = new int[4]; 4*4 16byte 1 loop 
        // 1+7+13+17, [1, 7, 13, 17];  
        // 5+9+13+18  [5, 9, 13, 19];

        // int leftarrsum = leftarr; 4byt
        // int rightarrsum = rightarr; 4byt3
        //  40bytes of

        // int leftsum =0; 4byte
        // int rightsum =0; 4byte
         int leftsum =0; 
        int rightsum =0; 
        // 8byte 
        for (int i =0; i<4; i++){
         for(int j= 0; j<5; j++){
            if(i==j){
                leftsum = leftsum + int_twod_array[i][j];
              System.out.print(int_twod_array[i][j] + " left diagonal ");
           }
           if(i+j ==int_twod_array.length){
            rightsum = rightsum + int_twod_array[i][j];
            System.out.print(int_twod_array[i][j] + " right diagonal ");
           }
        }
        System.out.println();
        }
        // leftdiagonasum , and rightdiagonal sum leftdiagonal sum greater aor right greater;
           if(leftsum > rightsum){
            System.out.println(leftsum + "left sum greater");
        }
        else{
            System.out.println(rightsum + "right sum greager");
        }
        // 20
        // max row_sum 

     //    [[1,  2,  3,  4,  5], 
    //     [6,  7,  8,  9,  10],
    //     [11, 12, 13, 14, 15], 
    //     [16, 17, 18, 19, 20] ] 

    //   indexs=>  [
//     //         [00, 01, 02, 03, 04],
//     //         [10, ,11 ,12 ,13 ,14],
//     //         [20, 21, 22, 23, 24],
//     //         [30, 31, 32, 33, 34], 
//     //     ]


// arr = [1,  2,  3,  4,  5];
// int max= 0;
// for( int i =0; i< 5; i++){
//     if(arr[i]> max){
//         max = arr[i];
//     }
//     sum = sum + arr[i];
// }
// max rosum sum of row , roth number
        int rowSum =0;
        int maxval = 0;
        int rowth  = 0;
         for (int i =0; i<4; i++){
            // i =0; 
            // i = 1
             for(int j= 0; j<5; j++){
             rowSum = rowSum + int_twod_array[i][j];
          }
        //   rowSum =15; 50
        if(rowSum > maxval){
            maxval = rowSum;
            rowth = i;
            rowSum = 0 ; 
        }
           System.out.println();
        }
        System.out.println("max row sum value"+ maxval + "  " + rowth); 
        
        // max column sum , column number; 



        System.out.println( "20: " +int_twod_array[3][4]);


}
}
