public class mergeSort{
    public static void main(String[] args) {
        int arr[] = {89, 20, 40,2, 3, 1};
        mergeSort(arr);
        System.out.println("array after sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    // merging => combininig  
    //    arr     [2, 1]
    //              /  \
    //left =    [2]     [1]  =  right=
    //          \      /
    //          [1,  2] =>RESULT

                        // 8 = 3, 16, => 4 (n*logn)
                        // / \ 
                        // 4   4
                        // /\  /\
                        // 2 2 2 2
                        // /\
                        // 1 1
    // time complexity=> O(n*(log(n)))
    public static void mergeSort(int arr[]){
        if(arr.length<=1 ){
            return;
        }
        int mid = arr.length /2;
        int n= arr.length;
        int leftarray[] = new int[mid];
        int i;
        int rightarray[] = new int[arr.length -mid];
        for(i =0; i<mid ;i++){
            leftarray[i] = arr[i];
        }
        for(int j = mid; j<n; j++){
            rightarray[j-mid] = arr[j];
        }
        mergeSort(leftarray);
        mergeSort(rightarray);
        merge(arr, leftarray, rightarray);
    }
    public static void merge(int arr[],int left[],int right[]){
        int i =0;
        int j= 0; 
        int k= 0; 
        while(i<left.length &&  j<right.length){ 
            if(left[i]< right[j]){
                arr[k]= left[i];   
                i++;// 3=>4
            }
            else{
                arr[k] = right[j];
                j++; 
            }
              k++;
        }
        while(i<left.length){  
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length){ 
            arr[k]= right[j];
            j++;
            k++;
        }
    }

    // arr= [1, 2]
    // mainarra = [1, ]
// i leftarry index, j right array index, k = mainarry index  
// arra =length 4, last index =3, array length 5 last index =4
// arr[0] = left [0] = -1
// 0th index arr 1st
// i=0, k=0 => i=1, j=0, k=1
// arr[0] = -1
// arr[1] = 1, j=>1, k=2, i =1, j=1, k=2
// arr[2] = 6 , i=2, j= 1, k=3
// arr[3] = 7  i=3, j =1, k=4
// arr[4] = 8 , i=4, j= 1, k=5
// arr[5] = 9, j= 2, k=6
// arr[6] = 17 , j= 3, k=7
// arr[7] = 100, j=4, k=8
// arr[8] =1001, j=5, k=9
// arr[9] = 5000, j=6; k=10;
// arr[10]= 6000, j= 7, k=11
// left [5, 6, 7, 8], right [1, 2, 3, 4] ,
// length =4, lenght =4


    //                   [8, 9, 6, 4, 5, 2]   // mid = 6/2= 3
    //                      /             \
    //                     /                 \
        //              /                        \
        //             /                            \         
//  leftarr         [8, 9 6]  // mid = 3/2 =1          rightarr= [4, 5, 5]
                //    / \
    // leftar    [8]  [9, 6]  mid= 2/2 = 1
                //      /\
        // leftarr [9] rightarr[1] =[6]
                    
// mid = 3/2 =1
            // leftar [8]
//arr1= [2, 3, 4, 5];
// /int[]  arr2 == new int(arr.lenght); => [ , , , ]
// for(int i=0; i<arr.lenght; i++){
//     arr2[i] = arr1[i] 
    // arr2[0] = 2
    // arr[1] = 3
    // arr[2] = 4

 // }

//  [8, 89, 1, 4, 5, 7] => 6 ;mid =3 i=0, 1, 2 , 3
// 0,1, 2,3

        // i=3
        // 3-3 
        // arrrr[0]  [1]
        // i j =4
        // rightarr [4-mid ] [4-3] => rightarr[1] =5
        // 4, 5, 5

        //  [8, 89, 1, 4, 5, 7]
        //   0,  1, 2, 3, 4, 5
        //   0,  1, 2, => lefarr;
//  rightarr [6 -3] = rightarr lentth => 3 => [ ,  , ]

    //  rightarr[0] = arr[3]    3-3
    //      rightarr[1] = arr[4]  4- 3 => 1 
    //      rightarr[2] = arr[5]   5 -3 => 2
      // rightarr[0] = arr[i] =>arr[3] => 4
        //  rightarr [6 -3] = rightarr lentth => 3 => [ ,  , ]
    // LEFT.LENTH =1
    // RTGHT.lenth =1
    // left[0] =2
    // right[0]=1
    // arr = [2, 1];
    // arr[0] = [1 ,1]
    // arr=[4, 7, 3]
    // left [4] , right [7, 3] => [3, 7] 
    //              left [7] right [3]
    // arr [ 8, 5, 4, 7, 3]    left [4 , 5]     right [3, 7, 8]
    //  left [4, 7, 6, 9]  right [1, 8, 17, 100, 1001]
    // [3, 4, 5, 7, 8]
    //  [] 
    // mainarr[6, 4, 9, 7, 10001, 8, 17, 100, 1]
    //  left [4, 6, 7, 9] , right [1, 8, 17, 100, 1001]
    // two array arr1=[1, 2,3] arr2= [3, 4, 5] , arr =[1, ,2 ,3, 3, 4, 5]
    //  mainarr[6, 4, 9, 7, 10001, 8, 17, 100, 1]
    //  left [4, 6, 7, 9] , right [1, 8, 17, 100, 1001, 5000, 6000]
    // merging => combininig 
    //    mainarry  [2, 1]
    //leftarr= [2]   [1]  =  rightarr=
    //          \      /
    //          [1,  2]


}