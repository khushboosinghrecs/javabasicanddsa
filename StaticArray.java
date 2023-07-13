import java.util.Scanner;

import javax.swing.plaf.synth.SynthViewportUI;

// array a static datatyepe => 10, 10 element ; we were taking at compile time 
// dynamic array => run time 

public class StaticArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = 5;
        // int n = sc.nextInt();
        // int arr[] = new int[n];
         // for(int i=0; i<n; i++){
        //     arr[i]= sc.nextInt();
        //     System.out.println(arr[i]);
        // }

        // for(int i=0; i<n; i++){
        //     arr[i]= sc.nextInt();
        //     System.out.println(arr[i]);
        // }
        // arr3[0] = 20;
        // arr3[1] = 30;
        // arr3[2] =0;
        // arr3[3]= 50;
        int arr[] = {1, 2, 3,  5, 6}; // 3

         int arr3[] = new int[4];
    
        for(int i=0; i<4 ; i++){
            System.out.println(arr3[i] + " " + i);
        }

       deleteval(arr, 3);
    
        
     }

     public static void deleteval(int arr[], int num){
        // time and space complexity 
        int len = arr.length-1;
        int arr2[] = new int[len]; 
        for(int i =0, j=0; i< arr.length ; i++){
            if(arr[i] != num){
                arr2[j] = arr[i];
                j++;
            }
            else {
                    // when index =2 ;
                //    when arr[i] ==6;
                }
             }

             for(int j =0; j< arr2.length ; j++){
           
               System.out.println(arr2[j]);
            }
        }
                // 12, 3, 6 7, 8
        // 0, 1, 2  3, 4
        //  3
        //  2 
        //  arr2[2] =
        //   arr2[3] = 
            //  main arr[] = //[ 12, 3, 6 7, 8 ]  // we have to check in maing array if 6 is then we don't have to insert ins second arry
                //    0, 1, 2  3, 4

        //   arr2[]   4;

//         for(i =0 ; i<length; i++)      {
//             // i= 3
// arr2[0], qarr2[1], arr2[2], arr2[3];

//                 if(arr[i] !=6){
                  
//                      arr2[j ] = arr[i];
//                 }
//                 }else {
//                     when index =2 ;
//                 //    when arr[i] ==6;
//                 }
//             }
        //  return arr2;
    
}
