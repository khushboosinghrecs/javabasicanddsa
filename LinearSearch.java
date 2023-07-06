// Searching  => finding any element from any data structure, such that the element is stored in certain data structure;
// data structure =>array [], 
// linked list, stack, queue, tree, graph

// ['a', 'b', 'c', 'd'] = c is present or not =>, e is present or not 

// Linear Search=>sequentially check the array untill match is found in list or till end of array
// time =>(O(n))


public class LinearSearch {
    // Time complexity => O(n)
    public static void main(String[] args) {
    char a[]={'a', 'b', 'c', 'd'};
    boolean b= false;

    for (int i = 0; i < a.length; i++){
        if(a[i] == 'e' ){
            b= true;
            // break;
        }
    }
    if(b==true){
        System.out.println("e is present ");
    }else{
        System.out.println("e is not present ");
    }
}
    
}
