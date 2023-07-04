
// selection sort => is sorting algorithm  that works by finding the minimum element from the unsorted portion of array and places it at the begining
//  of sorted array.

 // [8, 2, 3, 5,7 ]; => mininimum ele => 2 , second minim mum
//  [2] i =0;
//  [2, 3]  =>i=1;
//  [2, 3, 5] i=2;
// [2, ,3 , 5, 7] = i =3

// 

   // [8, 2, 3, 5,7 ];
// after i= 0=> [2, 8, 3, 5, 7]

// i=1
// minimum ind=1
// j =2 =>if(3 <8)minind= 2
// j=3 =>5<3{}
// j=4 => 7<3{}
// minind => 2

// temp = 3
// arr[2] = 8
// arr[1] =3
// [2, 8, 3, 5, 7] =>[2, 3, 8, 5, 7] => [2, 3, 5, 8, 7]=> [2, 3, 5, 7, 8]

// i =2{
//    min inde =2;
//    for(j =3; <n-1; j++)
//    j =3; 5<8{
//         minind = 3;
//     }
//     j = 4{
//         7< 5{no}
//     }

//     temp= 5;
//     arr[mininde] = 8;
//     arr[i] = temp=>5

// }
// n = 5
// i =3{
//    min inde =3;
//    for(j =4; <n; j++)
//    j =4; 7<8{
//         minind = 4;
//     }
  

//     temp= 7;
//     arr[mininde] = 8;
//     arr[3] = temp=> 7

//     i = 4; 
// }



public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {8, 7, 5, 0, 3, 4};
                int n= arr.length;
        selectionSort( arr);
        System.out.println(
            "array after sorting"
        );
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // [8, 2, 3, 5,7 ]; 
    // time complexity of selection sort = n^2
    //  [2, 3, 5, 7, 8] if array will already sorted  time complexity?=> n^2
    //  (n-1)*(n-2) => O(n^2);
    public static void selectionSort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            // i =n ; n+1> 
            int minindex = i;
            for(int j= i+1; j<n; j++ ){
                if(arr[j]< arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
            // break;
        }
    }
    // [8, 2, 3, 5,7 ];
      // [2, 8 3, 5,7 ]; => [2, 3, 5, 7, 8] 5-3 
      [2, 2, 3, 3, 4 ,4].

//    first max= arr[n-1 - (1-1)];
    // secomnd max = arr[n-1- (2-1)] => arr[n-2]
    // third max = arr[n-1 , - (3-1)] =?> ARR[n-3]
 
    //   kth max number and kth minnumber assume no repeating =>  arr[n-k]
    //   4th max number and 3rdminnumber =>
    //   n-k 
    //   (k-1)

        // [2, 2, 3, 3, 4 ,4]

    // find the minimum value => with the help of selection >  (1*n)
    // public static int swap(int a, int b){
    //     ret
    // }
    
}
