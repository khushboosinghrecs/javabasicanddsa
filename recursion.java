// find sum of 5 numbers ->1+2+3+4+5
// sum =0;
// 1+2+3+4+5
// for(i =1; i<=5; i++){
// sum = sum +i
// }

// 5 +4+3+2+1
// findsum(int n=5){
// if(n==0){
//     return 8;
// }

// return n + findsum(n-1); 
// }
//n= 5; 5 +findsum(4)=> 
//n= 4;        	4 + findsum(3)=>
//n=3			         3 +findsum(2) =>
//n= 2				             2 +findsum(1); 
//	n= 1					           =>1 +findsum(0) => 0
//  n = 0                                           0;
//  n=0                                            0+ findsum(-1);

//  n= -1                                               -1 +findsum(-2 );
// n =-2                                                       -2 +findsum(-3); .........
// condition => 

//  1*2*3*4*5; => recursion;  => factorial of number 
// int mul =1;
// for(i =1; i<5; i++){
//     mul= mul*i;
// }

//   n^m with loop ;
//   and recursion;

public class recursion {
    public static void main(String args[]) {

        int nm = 13, a = 0, b = 1;
        int sum = 0;

        for (int i = 1; i <= nm; ++i) {
            System.out.print(a + ", ");
            sum = a + b;
            a = b;
            b = sum;
        }
        // sum of digits=> loop ;

        // num= 1234657;
        // 7+5+6+4+3+2+1;
        System.out.println(sum);
        System.out.println(a);

        int n = 5;
        int fivesum = findsum(n);
        System.out.println(fivesum);
        int num = 1;
        int secondsum = findSumIncreasinOrdr(num);
        System.out.println(secondsum);
        int funval = fun(4);
        System.out.println(funval);

        // num^power = 2^8 => 2*2*2*2*2*2*2*2;

        int power = 4;
        int number = 2;
        // 2^1= 2
        // 2^2 = 4
        // 2^3 = 8

        int powerans = 1;
        // 1*2;=>2
        // 2*2 =>4;
        // 4*2= 8;
        // 8*2= 16;

        for (int i = 1; i <= power; i++) {
            powerans = powerans * number;
        }

        powerNumInc(2, 4);
    }

    // 5+4+3+2+1
    public static int findsum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + findsum(n - 1);
    }

    // calling function itself=> recursion
    // method call itself =>recursion;

    // for(int i =0; i<7; i++){
    // print(i);
    // }

    public static int fun(int n) {
        if (n == 4) {
            return 0;
        }
        return 1;
    }

    // 1+2+3+4+5;
    // findSumIncreasinOrdr(1); => 15
    // 1 +findSumIncreasinOrdr(2) =>14
    // 2+ findSumIncreasinOrdr(3) = >12
    // 3+ findSumIncreasinOrdr(4) => 9
    // 4+ findSumIncreasinOrdr(5); =>5
    // if(n ==5){
    // return n;
    // }

    // 5+fun(6);
    // 6+ fun(7) .......
    public static int findSumIncreasinOrdr(int n) {
        // 1
        if (n == 5) {
            return n;
        }
        return n + findSumIncreasinOrdr(n + 1);
    }

    // num^power = 2^4 => 2*2*2*2;
    // powerNUM(num= 2, power=1)=> if power =1; return num;
    // powerNUM(num= 2, power=2)=> if power = 2; retrun num*powerNUM(num, power+1);
    // powerNUM(num= 2, power=3)=>if(power = 3); retrun num * powerNUM(num= 2,
    // power=2);
    // //
    // 2^4
    public static int powerNum(int num, int power) {
        if (power == 4)
            return num;

        return num * powerNum(num, power + 1);
    }

    // powerNum(2, 1); =>16
    // 2* powerNum(2, 2); 8
    // 2* powerNum(2, 3); =>4
    // 2* powerNum(2, 4) =>2

    // power =4;
    // num 4;
    public static int powerNumInc(int num, int power) {
        if (power == 1) {
            return num;
        }
        // if(power ==0){
        // return 1;
        // }
        return num * powerNumInc(num, (power - 1));
    }

    // main->powerNum(2, 4); =8;
    // 2* powerNumInc(2, 3); => 4;
    // 2*powerNumInc(2, 2); => 2
    // 2 * powerNumInc(2, 1) =>1
    //

    // if n==8 => 21;
    // if n==9; 34;
    // if n==2; 1;
    // if n==0 ;0
    // if n==1; 1;

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, => fibbonacci seriese ->loop

    // int n = 10, a= 0, b = 1;

    // for( int i = 1;i<=n;++i)
    // {
    //     System.out.print(a + ", ");
    //     int sum = a + b;
    //     a = b;
    //     b = sum;
    // }
}
