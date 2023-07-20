// Binary Search => more efficient algorithm then linear search, It works on sorted array by repeatly dividing in half portion of the array that would contain the item;
// time complexty => (O(logn))
// [1, 2, 3, 4, 5]  => 3 is present or not; 1, is p[resent or not , 4 is present or not

// {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'j'};
// if(arr[mid] === element ) {return mid index}
// if(arr[mid]< element) left =0 right =
public class BinarySearch {
    public static void main(String[] args) {
       char arrr[] = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'j'};
                                    
       char elementTofind = 'c'; //  left = mid+1 right => arr.length-1;
     int elementIndex=  BinarySearch(arrr, elementTofind);
     if(elementIndex>=0){
        System.out.println("Element is  there");
     }
     else{
          System.out.println("Element is there");
     }
    }

    // char arrr[] = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'j'};
    // 0 1 2 3 4 5 6 7 8
    // target element = 'c';
    // int left =0;
    // int right = 8;
    // mid = 0 + (8-0)/2 =>4
    // if(e==c)
    // if(e> c){}
    // else{ right mid -1}; = mid4 =>3

    // right = 3

    // left =0 < 3
    // mid = 0 + (3-0)/2 =1
    // if(b =='c')
    // (c> b){ left =1+1 =>} left = 2

    // 2<=3{
    // 5/4 (left +rigt)/ 2
    // mid = 2 +(right -left)/2= 2+ (3-2)/2 = 2+ 0;

    // if(c==c){
    // return mid;
    // }
    // }
    // // char arrr[] = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'j'};
    // 0 1 2 3 4 5 6 7 8
    // target element = 'h';
    // left =0; right = 8;
    // 0<8 mid= 0+ 8-0/2 =4;
    // left = 5, right =8
    // 5<=8
    // mid =5+ 8-5 => 5+1 =6
    // g==h
    // left = 7 , right = 8
    // 7=8
    // mid = 7;
    // h ==h
    // mid 7
    // trget = "u";
    /*
     * target ele = b , (log(n) log(2)
     * target elem = g , log(2),
     * h = 3 step , 8 step
     * j 4 step , 9 stewpo
     * 8= 2^3
     * ;1lc = 2^1000
     * // 1 sec 64 o(64) = 64 10lcksecond
     * // log2(64) => 6 1 step => 6sec 100 second
     * target elete = e => time complexity => O(1) (64) > log(n) 1 l => O() =
     * (log(64))
     * log(9) = 3. 0000 => 4
     * //
     * // {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'j'};
     * // 0 1 2 3 4 5 6 7 8
     * // / \
     * // {'a', 'b', 'c', 'd'] ['f', 'g', 'h', 'j']
     * // 0 1 2 3 5 6 7 8
     * // / \ /\
     * // {'a'} [ 'c', 'd'] ['f'] ['h', 'j']
     * // 0 2, 3 5 7 8
     * /\ /\
     * ['d'] ['j']
     * 3 8
     * 
     * 
     */

    public static int BinarySearch(char arr[], char target) {
        // 0 to n-1
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
