public class Stringpractice {
    // "a b "
    // String => "Avinash" reverse the string =>"hsanivA" print the string in
    // reverse order ;
    // 012 length-1
    // str ="A v i n a s h K h u s h b o o A m i t"; make another from the given
    // string odd character (characetor at position is odd);
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17

    // STR "ABCDEFGHIJKLMOPQRSTUVWXYZ"; CONTAINS ALL ALPHABETS => 65, //paNaGram
    // String
    // STR ="AbcDeFgHIjklmOpqresTUvwxyz" contains aphlath all alphabets // either we
    // have to conveert to lower or uppercase ;
    // str1 ="hello world", str2 ="world" // str2 is prsent in str1 or not str2
    // length < str1 length
    // (for i =0; str1.length - str2.length, i++){
    // for(j =0; j< str2.lenth; j++){
    // if(str1.charAt(i+j) !=str2.charAt(j)){
    // false;
    // }
    // if(j = str2.length){
    // true;
    // }
    // }
    // }
    // hello word -world string str="";
       
         


    //
    public static void checkString(String str1, String str2) {
        // "world" , "world"
        // helllo world
        // hello worldhhhhhh hello hello hello world
        // hello str2 = world 
        // never optimise start thinking question in brute force f
        int i = 0;
        int j = 0;
        boolean samestr = false;
        int str1length = str1.length() - 1;
        int str2Length = str2.length() - 1;
        String str3 = "";
        while (i <= str1length && j <= str2Length) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
                if (j == str2Length) {
                    samestr = true;
                    break;
                }
            } else if (str1.charAt(i) != str2.charAt(j)) {
                i++;
            }
        }
        if (samestr == true) {
            System.out.println("string contain string 2");
        } else {
            System.out.println("string doese not contain string 2");
        }

    }


    public static void main(String[] args) {
        String str = "AvinashKhushbooAmit"; //
        // System.out.println("Str after reverse");
        // String reversestr= reverseStr(str);
        // System.out.println(reversestr);
        String str1 = "Hello world";
        String str2 = "world";
        checkString(str1, str2);

        String STR = "ABCDeFgHIjklmOpqresTUvwxyz";
       // panagram(STR);
    }

    public static void panagram(String str) {
        boolean panagram = true;
        String str2 = str.toUpperCase();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
            if (!str2.contains(String.valueOf(ch))) {
                panagram = false;
                break;
                // System.out.println(ch + "is present");
            }
            // else{
            // System.out.println(ch + "is missing");
            // panagram =false;
            // break;
            // }
        }
        if (panagram == false) {
            System.out.println("String is not pangram  ");
        } else
            System.out.println("String is  pangram ");

        // return panagram;
    }
    // pallindrome "AABAA" = " AABAA"

    public static String reverseStr(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
            System.out.println(str.charAt(i));
        }
        System.out.println(reverseStr);
        return reverseStr;

    }

    // 1/2 => 1 2/2 =0, 3/2= 1; 2*2 +0
    public static String oddStr(String str) {
        String oddStr = "";
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        // 0%2 = 0; 1%2=> 1; 2%2= 0, 3%2=1, 4%2 =>0
        for (int i = 0; i <= str.length() - 1; i++) {
            if (i % 2 != 0) {
                oddStr = oddStr + str.charAt(i);
            }
        }
        System.out.println();
        return oddStr;

    }

    // str[length-1] =h
    // str[length-2] =s
    // str[length-3] =a;

    // str[0] = A

    // arr[i] =>
    // charAt(i) =>String A v i n a s h
    // str[-1]; 0 1 2 3 4 5 6 str[0] => A , str[1]= v, str[6] = h str[-1];
    // reverseStr = reverseStr + str.charAt(i); // reverstr = ""+h => h => length -1
    // reverstr = h+s => hs=> length -2 =>5
    // reverstr = hs +a => hsa=> length -4 =>4

    // i =string.length -1; 6 => 5; =4 = 3 => 2 => 1=>0 => -1
    // i--
    // char ch= str.charAt(-1);
    // System.out.println("Str at -1" + ch
    // );

    // Nikhi solution
               String s1 = "Hello world";
            String s2 = "world";
            int check = sameString(s1, s2);
            if (check == -1)
                System.out.println("Not present");
            else
                System.out.println("Present is present");
        public static int sameString(String s1, String s2)
        {
            int A = s1.length();
            int B = s2.length();
            // 4 +5 =9
            // A= 9
            //  i+j = a.lenth -1
            // hello world 
            B = 5;
            // 9-5
            for (int i = 0; i <= A - B; i++) {
                int j;
                for ( j = 0; j < B; j++){
                      if (s1.charAt(i + j) == s2.charAt(j)){

                      }
                    else if( s1.charAt(i + j) != s2.charAt(j)){
                        break;
                    }
                    if ( j == B)
                    return i;
            }
            return -1;
        }
     
}
