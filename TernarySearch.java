// ternary search-> is a searching algorithm , based on divide and conquer algorithm used to search for an element in a sorted array.

// [10, 20, 30, 40, 50, 60, 70, 80 ,90] = three parts division will be happen , target element = 20, 60, 90
// [10, 20, 30, 40, 50, 60, 70, 80 ,90]
//   0 	 1  	2   	 3 	  4   5    6    7    8 => indexes
// length of array =9
// left =0, right =8
// mid1= left + (right-left)/3, 0 + 2 => 2  arrr[mid1] = 30
// mid2 = right -(right-left)/3 8- (2) => 6 arr[mid2] = 70

// complexty => log3(n);



public class TernarySearch {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50, 60, 70, 80 ,90}    ;
        // int searchedIndex = ternarySearch(arr, 20);
          int searchedIndex = ternarySearch(arr, 400);
        if(searchedIndex>=0){
            System.out.println(searchedIndex + " " + arr[searchedIndex] + " element is there");
        }
        else{ System.out.println(searchedIndex + " element is not  there");
    }
     }

     /*
       length => array length; 
        log3(9) => log3(3^2) => 2*(log3(3)) 2*1 =>2 
        log2(n )=
        // [10, 20, 30, 40, 50, 60, 70, 80 ,90] => log3(9) => 2 log2(n )= 
        //   0 	 1  2    3 	 4   5   6   7   8 => indexes
        / 
        [10, 20,]       [ 40, 50,]      [80 ,90]


      */
     public static int ternarySearch(int arr[], int target){
        int left = 0;
        int right  =arr.length-1;
        while(left<right){
            int mid1= left + (right - left)/3; // 0 + (8-0)/3 => 2.66 = > 2
            int mid2 = right -(right-left)/3;  // 8 - (8-0)/3 => 2.66 = > 2 => 9-2 => 6
            // mid1 = 0 + (1-0)/ 3 => 0+ 0.3333=> 0
            // mid2 = 1- 1-0/3= 1- 0;

            if(target== arr[mid1]){
                return mid1;
            }
            if(target == arr[mid2]){
                return mid2;
            }
            if(target<arr[mid1]){
                right = mid1 -1;
            }
            else if(target > arr[mid2]){
                left = mid2+1;
            }
            else{
                left = mid1+1;
                right = mid2 -1;
            }
        }
        return -1;
     }
}
