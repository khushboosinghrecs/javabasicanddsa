import java.util.Scanner;


// string => collecection of character "aaaaaaa kjhushb"
public class StringExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: "); 

        //  Khushboo singh is a softweare developer
        String str= sc.nextLine(); //reads string    "khushboo singh" => 14 => 


        System.out.println("You have entered: "+str); 

        System.out.print("Enter a seconde string: ");
        //  Khushboo singh is a softweare developer
        //  khushboo

        String strr= sc.next();   //reads string before the space  "khushsssssssssssssss bbbbbbbb ccccc"
        System.out.print("You have second entered: "+strr);  
        // 4
        // 0 to 3;

        String str1 = "Hello, World world!";
                    //   0,1,2,3,4,5,6
                    // 0 to n-1
                    
        
        String str2 = "Hello";
        // String str2 = new String("Hello");

        // String concatenation => joining 
                    // "Hello , World!" + " " + "hello" => 19; // string concatanation
                    // 1 + 3 => 
        String str3 = str1 + " " + str2;
  // Hello World! Hello => 18
//   0123456...........


        // String length
        int length = str3.length();

        // Accessing characters
        char firstChar = str3.charAt(4); //o
        char lastChar = str3.charAt(length - 1); //o 

        for(int i =0; i<str3.length(); i++){
            
            System.out.println(str3.charAt(i));
        }

        // Substring

        //s1= "hello world", s2="hello " 
        String substring = str3.substring(7, 12);

        // Comparing strings
        String s1="heloo";  
        String s2= "heloo";
        if(s1==s2) {System.out.println("equaljjjjjjjjjjjjjjjj");}
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        // Searching within a string
        boolean contains = str1.contains("World");
        boolean startsWith = str1.startsWith("Hellovvvvvvvv");
        boolean endsWith = str1.endsWith("!hhhhhhh");

        // String modification
        // hello world , => hello java
        String modifiedString = str1.replace("World", "Java");

        // String conversion
        int number = 123;
        String strNumber = String.valueOf(number);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("Length of str3: " + length);
        System.out.println("First character of str3: " + firstChar);
        System.out.println("Last character of str3: " + lastChar);
        System.out.println("Substring of str3: " + substring);
        System.out.println("str1 is equal to str2: " + isEqual);
        System.out.println("str1 is equal to str2 (ignoring case): " + isEqualIgnoreCase);
        System.out.println("str1 contains 'World': " + contains);
        System.out.println("str1 starts with 'Hello': " + startsWith);
        System.out.println("str1 ends with '!': " + endsWith);
        System.out.println("Modified string: " + modifiedString);
        System.out.println("strNumber: " + strNumber);
    }
}
