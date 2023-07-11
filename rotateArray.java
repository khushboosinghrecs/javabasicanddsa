// ['a', 'b', 'c', 'd', 'e', 'f'] => rotate the anticlock wise number can be any thing and print like this

// 1=>['b', 'c', 'd', 'e', 'f', 'a']
// 2=>[ 'c', 'd', 'e', 'f', 'a', 'b',]
// 3=>[ 'd', 'e', 'f', 'a', 'b','c',]
// 4=>['e', 'f', 'a', 'b','c','d']
// 5=>[ 'f', 'a', 'b','c','d', 'e',]
// 6=>['f', 'a', 'b','c','d', 'e', ]
// 7=>[ 'a', 'b','c','d', 'e','f' ]
// 8=>[ 'b','c','d', 'e','f', 'a' ]
// :
// :
// :

import java.util.Scanner;

public class rotateArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a[]={'a','b','c','d','e','f'};
        //         0  1    2   3   4    5
        char temp;
        
        System.out.println("enter the number of times to shifted");
        int n=sc.nextInt();

// char a[]={'a','b','c','d','e','f'};
//           0  1    2   3   4    5
//1=> {'b','c','d','e','f', 'a'};
//      0  1    2   3   4     5    

// n=5,  a[5+1];

   for (int i=0; i<n%a.length; i++) {
    temp=a[0];
        for (int j=0; j<a.length-1; j++) {

            a[j]=a[j+1]; // length -1 
            // j=> a.lenght-2;
      }
      a[a.length-1]=temp;
      //a.length-1 =temp;
    }
      
      
      for (int i=0; i<a.length; i++) {
        System.out.print(a[i]+" ");
      }
     }
}
