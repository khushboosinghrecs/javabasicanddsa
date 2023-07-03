public class bubblesort {
    // [10, 9, 2, 3, 6, 8]
        // 0, 1,
        // [9, 10, 2, 3, 6,8]
    // swaping => interchange the position 
    // 
    public static void main(String[] args) {
        // swapping 
        int a = 10;
        int b= 30;
        int temp =a ;
        a= b;
        b=temp;
        System.out.println(a + " aa"); // 30
        System.out.println(b + " bb"); //10
        int arr[] ={9, 10, 2, 3, 6 };
        bubbleSort(arr);
        
    }
    // 1, 2, 3, 4
    // 1, 2, 3, 4 , 5, 6, 7, 8 =>  you have given array you have to tell array sorted or not 

    // arr[j ] == arr[j+1]
    // arr[j] <=arr[j+1];
    // worse case O(n^2)
    //  best case => (O(n));
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        // 0 to n;
        // o to n-1; n**(n-1) => n^2 -n= > O(n^2)
          int temp;
            for(int i =0; i<n; i++){
            for(int j=0; j< n-1-i; j++){
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

          // u have to largest number with bubble sort => time complexity= 1* n = O(n)
           // u have to largest number with bubble sort => time complexity= 1* n = O(n)
        for(int i =0; i<n; i++){
            for(int j=0; j< n-1-i; j++){
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
            break;
        }

         // 1, 2, 3, 4 , 5, 6, 7, 8 =>  you have given array you have to tell array sorted or not 
        //   8, 2,1, 3, 4 , 5, 6, 7 =
        //  complexity => worse case O(n); best time => O(1)
            
             boolean checkSorted = true;


        for(int i =0; i<n; i++){
            for(int j=0; j< n-1-i; j++){
                if(arr[j] > arr[j+1]){
                  checkSorted = false;
                  break;
                }
            }
            break;
        }
        // if(checkSorted){arr sorted }
        // else{not sortted}

         System.out.print("after sorting");
         System.out.println(arr[arr.length-1]); 
         for(int i =0; i<n; i++){
           System.out.print(arr[i] + ", ");
        }
    }


    // time complexity=> O(n*n)
    
}
