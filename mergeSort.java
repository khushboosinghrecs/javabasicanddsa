public class mergeSort{
    public static void main(String[] args) {
        
    }


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


    public static void mergeSort(int arr[]){
        // if
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

    // merging => combininig 
    //    mainarry  [2, 1]
    //leftarr= [2]   [1]  =  rightarr=
    //          \      /
    //          [1,  2]


      // merging => combininig 
    //    arr     [2, 1]
    //              /  \
    //left =    [2]     [1]  =  right=
    //          \      /
    //          [1,  2] =>RESUL

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
    //  left [4, 7, 6, 9]  right [1, 8, 17, 100, 1001]
    public static void merge(int arr[],int left[],int right[]){

        int i =0;
        int j= 0; 
        int k= 0;
        

        // i leftarry index, j right array index, k = mainarry index
        // left [4 , 5]     right [3, 7, 8]
        // 0< 2   && 0 <3
        // arr[0] - minval
        // arr[1]  

        while(i<left.length &&  j<right.length){  // i=0 0<1 && 0<1
            if(left[i]< right[j]){   // left[0] <right[0] => 2 < 1
                arr[k]= left[i];     // arr[1] = left[0] =>  4 =  arr[2] => 5
                i++;   // 0=>1 => 2
            }
            else{
                arr[k] = right[j];     // arr[0] =right[0] arr[0] 3
                j++; // 0=>1
            }
            k++; // 0=>1  => 2  => 3
        }
// i 2<2
        while(i<left.length){  // i =0 arr[1, 1]
            arr[k] = left[i]; // k =1 arr[1] = left[0] => 2
            i++;        // 0 => 1
            k++;         //1 => 2
        }

        // arr[0] = 3  j=0  =>1
        // arr[1] = 4
        // arr[2] = 5
        //  j =1
        // j=2
        // arr[3]= 7
        // arr[4] =8

        while(j<right.length){ // j =1 1<1
            arr[k]= right[j];
            j++;
            k++;
        }
    }

    // arr= [1, 2]

}