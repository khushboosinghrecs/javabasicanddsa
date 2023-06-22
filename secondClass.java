//Scanner class java.utils files 
import java.util.Scanner;
//maxmimum number of two number -> 12 14 
//conditional statements -> if(){}else{}, if(){}elseif(){}else{}
//maximum of two number , first number ;
//maximum of three number 
// year is leap year 

public class secondClass {
    public static void main(String args[]){
        Scanner myobj = new Scanner(System.in);
        System.out.println("please enter integer");
        int intValue = myobj.nextInt();
        System.out.println("please enter boolean");
        boolean boolValue = myobj.nextBoolean();
        System.out.println("please enter double");
        double doubleValue = myobj.nextDouble();
         System.out.println("pls enter string");
        String str = myobj.nextLine();
        System.out.println( intValue);
        System.out.println( boolValue);
        System.out.println( doubleValue);
        System.out.println( str);
        int firstNumber = 12;
        int secondNumber = 14;
        int thirdNumber = 2;
        //  firstNumber > secondNumber 
        // System.out.println(stringValue);
        if(firstNumber<secondNumber){
        System.out.println(secondNumber);
        }else{
           System.out.println("second number is not greater"); 
        }

        if(firstNumber>secondNumber){
            System.out.println("first number is smaller");
            System.out.println(firstNumber);
        }else if(secondNumber==firstNumber){
             System.out.println("second number is greater");
            System.out.println(secondNumber);
        }else{
            System.out.println("both numbers are equal");
        }

        if(thirdNumber<firstNumber){{
            System.out.println("first if");
        }}
        if(thirdNumber<secondNumber){
            System.out.println("second if");
        };
        if(thirdNumber==secondNumber){
            System.out.println("third if");
        }



    }
}
// 2012 
// operators -> 
//5%2  = 1
// number%4 ==0 or number %100 ==00 , number%400 ==0
//arithmetic -> +, -, *, /, %
//relation operator -> >, < , >=, <=, ==
//logical operator -> &&, || , !
//unary operator  -> ++, --;
// ternary operator ,
