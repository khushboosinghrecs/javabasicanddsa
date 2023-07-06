
// Quick sort => sorting algorithm, its also a divide and conquer algorithm . it takes the array arr, lowest index as low and higher index as high, to define the range of elements to sort, the partition method is used to find the pivot element and place it at the correct position , so that all elements before pivot element is smaller and after it  is larger 

// pivot = 5;

// [4, 1, 3, 5, 8, 9]
// 3

// tiem complexity of (quicksort )=> O(n*log(n));

// 

import java.lang.reflect.Array;
import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {

        int arr[] = {4, 8, 9, 1, 3, 5};
         int arr1[] = {4, 8, 9, 1, 3, 5};
         Arrays.sort(arr1);
        int low =0;
        int high = arr.length -1;
        quickSort(arr, low, high);
    }


    //  //   int arr[] = {4, 8, 9, 1, 3, 5}; => pivotindex = 3 => array change =    int arr[] = [4, 1, 3, 5,  8, 9]


    // int arr[] =          [4, 1, 3, 5,  8, 9];   =>log(6) =>2
    //                            /       \
    //                           /         \
//  (0, 2)                [4, 1, 3]       [8, 9]  (4, 5)
//                        [1, 3, 4]              /\
//  pivotindex=1                  pivotindex= 5
//                           / \                     /\
//                          /   \                    /  \
//               (0, 0)  [1]       [4](2, 2) ,(4, 4) [8] , (6, 5)
//   
//              [1, 3, 4, 8, 9]

// [1, 4, 9, 2, 8, 10, 8, 9]  => [10, 40, 90, 20, 8, 10, 8, 9]
// multiply element of array by 10 from start index =0, and end index =3;

    public static void quickSort( int arr[], int low, int high){
        if(low < high){
            int pivotindex = partition(arr, low, high);
            // print =1
            quickSort(arr, low, pivotindex -1);
            quickSort(arr, pivotindex+1, high);
            //  [4, 1, 3, 5,  8, 9]
            //  quickSort(arr, low, 2);
            // quickSort(arr, 4, 5)
        }
    } 
    //   int arr[] = {4, 8, 9, 1, 3, 5};
    // low  =0,  high =5
    // pivot = arr[5] = 5;
    // i = low-1 => -1
    // j=low;  j=0; if(arr[0] <pivot){i++=> 0, temp = arr[0] =>4, arr[0] = 4, arr[0] = arr[0] }
    //  j=1, if(arr[1]< pivot){}
    // j=2 if(arr[2]< pivot){}{}
    // j=3 if(arr[3]<pivot){ i=> 1, temp = arr[1] =>8, arr[1] =1, arr[3] =8 }  = {4, 1, 9, 8, 3, 5};

    // j=4, if(arr[4]<pivot) {i =>2, temp = arr[2] =>9, arr[2]= arr[4] => 3,, arr[4] = 9} =>>[4, 1, 3, 9 ,8, 5]
    // j=5 , if(arr[5]<pivot) {}
    // i=>2

    // temp = arr[3] =>9
    //arr[3]= arr[high] => 5;
    // arr[high] = temp => 9 => [4, 1, 3, 5,  8, 9]




    //  [4, 1, 3]  
    // pivot = 3, i =-1
    // j=0{}
    // j=1{ i=>0, temp = 4, arr[0] =arr[1] =>1, arr[1]= 4} => [1,4, 3]
    //  temp =4, arr[1] = 3, arr[2]= 4 => [1, 3, 4]
    // 1

    //         [4, 1, 3, 5,  8, 9];
                 //                [4, 1, 3],   0,        2
                //                   [8, 9]  (4, 5)
    public static int partition(int[] arr, int low, int high ){
         int pivot = arr[high];
         int i= low-1; //3

         for(int j = low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
         }

         int temp = arr[i+1];
         arr[i+1] = arr[high];
         arr[high] = temp;
        return i+1;

    }
}
