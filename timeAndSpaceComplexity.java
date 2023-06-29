import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.Scanner;

import javax.lang.model.type.UnionType;

public class timeAndSpaceComplexity {
    public static void main(String[] args) {
        // 4 unit of time
        // readWrite();
        // 1 unit
        int sumvalue = sum(3, 4);
        // 3unit of time
        System.out.println(sumvalue);
        // 5 unit;
        int arr[] = { 1, 2, 3, 4, 5 };
        nNumSum(arr, 5);

        logloop(16);
        checknum(arr, 5);

    }

    public static void readWrite() {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("entern  num1, num2");
        // 1 unit
        num1 = sc.nextInt();
        // 1 unit
        num2 = sc.nextInt();
        // 1 unit +1 unit
        System.out.println(num1 + " " + num2);

    }

    // 5, 6
    // 10, 20;
    // 100000.., 2000000...
    // 100, 100000 => sum method is not dependent on input => 2 unit of time =>
    // constant time;
    public static int sum(int a, int b) {
        // 1 unit for return , 1 unit for + => 2unit
        return a + b;
    }

    public static void nNumSum(int a[], int n) {
        // n =2 => 4unit
        // n= 3=> 6 unit;
        // n = n=> 2n;
        // 1 unit
        int sum = 0;
        // 1 unit, 1 unit, 1 unit
        for (int i = 0; i < n; i++) {
            // 2 unit

            sum = sum + a[i];
        }
        // 2*1 unit ;
        // 2* 2 unit;
        // 3 *2 unit;

        // n*2 +3 c
        // // 2*n + 3 +4 c
        // 2*n + 4 => constant unit

        // n =10000
        // 2*n unit of time 2 is constant 2
        // 2 unit of time
        // asymptotic nottion=>
        System.out.println("Sum " + sum);
    }

    public static void twoloops(int n) {
        // if n= 1;
        // if n=2;
        // 1 unit
        int sum = 0;
        // 3 unit of time
        for (int i = 1; i <= n; i++) {
            // 3 unit time
            for (int j = 1; j <= n; j++) {

                sum = i + j;
            }
        }
        // 1*1(2 unit);
        // 2*2(2 unit )
        // 3*3( 2 unit)

        // n*n(2 unit );

        // 2n^2 + 3 + 3+ 1;
        // 2unitn^2 + 7 unit time

        // time 2unit * n^2
        // time n^2

    }

    public static void twoloop(int n) {
        // n=1 => time;
        for (int i = 1; i <= n; i++) {
            // sum = i
        }
        // n
        for (int i = 0; i < n; i++) {
            // sum = i
        }
        //
        // n+ n;

    }

    public static void twoloopnm(int n, int m) {
        // n=1 => time;
        for (int i = 1; i <= n; i++) {
            // sum = i
        }
        // n
        for (int i = 0; i < m; i++) {
            // sum = i
        }
        //
        // n+ m;

    }

    public static void twoloopnms(int n, int m) {
        // n=1 => time;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                // sum = i
            }
            // sum = i
        }
        // n

        //
        // n*m

    }

    public static void logloop(int n) {
        // 32 => 5
        // 16= 4
        // 8-> 3
        // 4-> 2;
        // n = 3
        // 2=> 1
        // if n= 1;1/2=>0
        // if n= 2; 2/2=1;
        int count = 0;
        for (int i = 1; i < n; i =i*2) {
            // sum =sum + i
            count++;
            System.out.println(count + "count " + "i =" + i + " nnnnn =" + n);
            n = n / 2;
        }
        System.out.println(count + "count ");
        // ntimes
    }

    // asymptotic notation=> we ignore the least value
    // 2*n^2 + 3; ==> n^2
    // 2* n + 3 => n
    // 2 =>constant value => constant unit of time

    // worst case = big oh(O)
    // average case => big Omega( )
    // best case => big theta( )

    public static void checknum(int arr[], int num) {
        // if num is present or not int array
        // print num is present other not present
        // arrr= [2, 3, 4, 5, 6,] , 6;

        // arr =[6, 2, 3, 4, 5, 7, ] , 6
        // n
        // arr =[ 2, 3, 4, 6, 5, 7, ............ ] , 6
        boolean checknumber= false;
        // int checknumberwithint = 5;

        // // n o(1) best case;
        // 1 and n avergage case;
        // n time worst case;  bit oh(n);
        

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                // checknumberwithint = 1;
                checknumber =true;
                break;
                // System.out.println("num is present  "  + i);
            }
            // else{
            // System.out.println("num is not present " + i);

            // }
        }

        // if (checknumberwithint == 1) {
        //     System.out.println("num is present");

        // } else {
        //     System.out.println("num is not present");

        // }
        //  if (checknumberwithint == 5) {
        //     System.out.println("num is not present");

        // } else {
        //     System.out.println("num is  present");

        // }

        // if(checknumber){
        //     num is prese
        // }

    }

}
