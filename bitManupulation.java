
// bit Manipulation=> solving problem at bit level => bit =smallest unit of our computer programmint 0/1; 
// int a, int b=20; int arr[] ={1, 3, 4, 5} => converted into 0 |1 =>computer can only understand 0|1;
// int 4 byte = 32 bits => 4 *8 = 01
// 2^31.........2^3 + 2^2 +2^1 +2^0=>.....+...16+8+ 4+ 2 + 1 =>

// 5 = 000 ..+1*4 + 0*2 + 1*1=>  = 0+ 1*2^2 + 0*2^1 + 1*2^0 =>5=> 101
// 6 = 000   + 1*4 + 1*2 + 0*1=> 000+ 1*2*2 +1*2^1+ 0*2^0=> 000000110
// 7 = 1*4 + 1*2+ 1 *1 ==111
// 8=>1*8+0*4* 0*2 +0*1= 1000

// 0*2^31 +..... 0*2^3+ 0*2^2 +0*2^1 +0*2^0 =>0
//  0*2^31 +..... 0*2^3+ 0*2^2 +0*2^1+1*2^0 =>
// 0=> 0000000000000....., 1=> 000000000000001, 2=> 0000000000000010
// number =>bits
// 0=> 0      => 0*(2^0)=> 0*1 =0
// 1=> 1	=> 1*(2^0)=>1* 1 =1 =>1 => 000001 = 
// 2=> 10		=>  1*(2^1)+0*(2^0) =>     1*2 +0*1 => 2+ 0 => 2
// 3=> 011   =>0*(2^2)+1*(2^1) + 1*(2^0) => 0*(4)+ 1*2 + 1*1 = 0 + 2 + 1=>3
// 4=> 100 =>1*(2^2)+0*(2^1)+0*(2^0) =>  1*4+0*2+0*1 => 4+0+0 =>4 => 1
// 5=> 101 => 1*(2^2)+ 0*(2^1) +1*(2^0)=>  1*4 +0*2 + 1*1 => 4+0+1=> 5
// 6=>110
// 7=> 111
// 8=>1000
//9=> 8+1=> 1001
// 10=> 1010
//11 => 1011 11/2=>
// 15 =1111
// 000001000 => 8 
//  18 => 16 + 2  =>     1*2^4 + 0*2^3 + 0*2^2 + 1*2^1  + 0*2^0  = 16 + 0+ 0 + 2+ 0 => 10010
// 0*2^31 +..... 0*2^3+ 0*2^2 +0*2^1+1*2^0 
// 21 => bit representation => 10101 => 16 + 4 + 1 =   1*2^4+ 0*2^3+  1*2^2 +0*2*1+ 1*2^0 => 10101
// 25=> 11001 => 16+8+0+0+1 =>    
// 17 => 10001 

// 32 bits  = 32 bit => 2^31  => 
// 0 0000000000000000000000101
// 1 0000000000000000000000100
// 
        // 100 => 00000000000100 => 1111111111011 

public class bitManupulation {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        //  101
        //  100
        //  001
        // 00000000000000000101
        // 10000000000000000100
        // 101 => 101 =>1 00000101 ==> 01111111111010 = +1          11111111111011
        // 100 =>  0 0000000000000100 => 1 111111111011;
        //  
        //            1   11111111111111010 
        //                              1
        // 0  00000000000001001 => 0110=> +1 =>  1 11111111110110 
        // // 101
        // 101=> 1010=> 10100
        // 101= 10=> 1
        //  System.out.println(a); // NOT operator

        System.out.println(a&b); // and operator
        System.out.println(a|b); // or operator
      
        System.out.println(a^b); //xor
        System.out.println(5<<2);     //left shift
        System.out.print(5>>2); // right shift
        

    }
}
