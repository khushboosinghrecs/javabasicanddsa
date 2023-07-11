// Two pointer =>it is mostly used in iterating over an array or linked list using two pointer or references that move the datastructure in specific way. it used to reduce the time complexity;

// sorted  [10, 20, 30, 40, 50],  => target = 70; you  have to find two index such that their sum == target;

// 1, 4 => 70;

// sum of two element == target;
public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum =70;
        twosum(arr, sum);

        int targetArr[] = twoPointer(arr, sum);
    //     if(targetArr.length <=1){
    //         print nolement
    //     }
    //     else{
    //         element is there and  targetArr[0], targetArr[1];
    //     }
    }

    public static void twosum(int arr[], int target){
    //  time complexity ? O(n^2); 
    // 1*n
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] +arr[j] == target){
                    System.out.println(i + "  " + j);
                }
            }
        }
    }
    // {10, 20, 30, 40, 50}; target = 60;
    // sum =target
    // sum< target
    // sum>target
     // {10, 20, 30, 60, 190}; target = 70; sum =60; arrais sorted min + max <given num;
     // {10, 20, 30, 40, 50}; target = 40; sum =60; arrais sorted min + max >given num;

  // {10, 20, 30, 60, 190, 799, 800}; target = 10; 


//   diffrence of two element = target => index
    public static int[] twoPointer(int arr[], int target){
        // O(n)
        // O(arr.lenght -1)=> O(n-1)=> (O(n))

        int left =0;
        int right = arr.length-1;
        // left =0, right =1; => 0
        while(left < right){
            int sum = arr[left] + arr[right]; // 810 // 809 // 200 // 70 //40 // 30 
            if(sum == target){
                return new int[]{left, right};
            }
            else if(sum <target){
                left++; // 1
            }else{
                right --; // 5 // 4 // 3 // 2 //1
            }
        }
        return new int[0];
    }
    
}
