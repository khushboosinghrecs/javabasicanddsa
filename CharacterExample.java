import java.util.Scanner;

public class CharacterExample  {
    public static void main(String[] args) {
        // char  is a data type => singgle char value "a A b B "
        // "a" A, 89
        Scanner sc = new Scanner(System.in);   
        System.out.print("Input a character: ");  
        // reading a character   
       char c = sc.next().charAt(0);   
       //prints the character   
        System.out.println("You have entered "+c); 
        char ch1 = 'A';
        char ch2 = 69;  // ASCII value of 'A'
        // char ch3 = '\u0041';  // Unicode value of 'A'n--

        // Operations with characters
        // "A" +1;
        // // int +int ;
        
        // 63 => B
        // "A" => 65 
        // char +int not possible;
        // type casting or type convirsion

        double a = 7.0000;
        int b= 7; 
        // a+ b; => 14.0000;
        // int ans2= (int)a + b; => 14
        // double ans = a + (double)b; => 14.0000=> 7.000 + 7.0;
        // double + int => double value;
        // 4.0 + 3; 7.0


        // "A" + "1";
        // + => add => concatation (string and char) => two char values will be jonied => "A1";
        //  2+5 =>7
        // "A" + "1"  +"2" => "A11"
        char ch4 = 65 +1 ; // Increment character value
        char chh= (char)(ch1 +1);
        // ch1 ="A"
        char ch5 = Character.toLowerCase(ch1);   // Convert character to lowercase
        char ch55 = Character.toUpperCase(ch1);

        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);
        // System.out.println("ch3: " + ch3);
        System.out.println(chh + ":chhh");
        System.out.println("ch4: " + ch4);
        System.out.println("ch5: " + ch5);

        // Comparison with characters
        // "A "== " E";
        // // 65 == 69
        // "A" > "a";
        // 65 > 97 => ascii values 
        // a=97 z
        // A=> 65
        boolean isEqual = (ch1 == ch2);
        boolean isLower = (ch1 > 'a');

        System.out.println("ch1 is equal to ch2: " + isEqual);
        System.out.println("ch1 is lower than 'a': " + isLower);
    }
}

