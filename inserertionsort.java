
// insertion sort=> sorting algorithm, it maintains a subarray to the left of the current position that already sorted and insert each element from the unsorted portion into correct position within sorted subarray.
public class inserertionsort {
    public static void main(String[] args) {
           int arr[] ={9, 10, 2, 3, 6 };
        inserertionSort(arr);
        
        
    }

    // {10, 9, 7, 3, 6 };
    // 3, 7, 9, 10, 6
    // i=4; 
    // current = arr[4] => 6
    // j= 3;
    // 3>=0, arr[3] 10>6{
    //     arr[4] = 10;  => [3, 7, 9, 10, 10]
    //     2
    // }
    // 2>=0 && arr[2] =>9> 6{
    //     arr[3] = arr[2] 9   [3, 7, 9, 9, 10]
    //     1
    // }
    // 1>=0; arr[1] 7> 6{
    //         arr[2] = 7 [3, 7, 7, 9 10]
    //         0
    // }
    // 0>= arr[0] =3> 6{
    // }
    // arr[j+1] arr[1] = current =>6 => [3, 6, 7, 9, 10]

    public static void inserertionSort(int arr[]){
        // current = 9;
        //  j= 0; arr[0]> current
        // time complexity => O(n*n) i =()n-1 j = (n-1-1) (n-1)*(n-2)=> n^2 -2n -n +2=> n^2 -3n +2 > O(n^2);
        //  given an arry [3, 6, 7, 9, 10]; =
        //  worst => O(n^2); 
        // {9, 10, 2, 3, 6 };


        int n= arr.length;
        int current, j;

         for(int i=1; i< n; i++){
            current = arr[i];
             j = i-1;
            while(j >=0 && arr[j]> current){
                // arr[1] =10;
                arr[j+1] = arr[j];
                j--;
                // -1
            }
            arr[j+1] = current;
         }

           //  [3, 6, 7, 9, 10] if array will sorted => time complexity? O(n)
            
         boolean checksorted = true;
              for(int i=1; i< n; i++){
                 current = arr[i];
                 j = i-1;
                while(j >=0 && arr[j]> current){ // O(1)
                // arr[1] =10;
                checksorted= false;
                arr[j+1] = arr[j];
                j--;
                // -1
                }
            arr[j+1] = current;
         }

        // best case if array will be sorted => O(n); 
        // worse case if array will not be sorted =>O(n^2);

        //  if(checksorted) print sorted else not sorted 





    }
    
}
