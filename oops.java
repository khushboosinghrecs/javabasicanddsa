// java file=> java.class=> (static )class loader => byetecode verifications 

public class oops {
    // public class void 
    // int double
    // {acces modifer} {keyword} => not to create instance of a class;

    public static void main(){
        // fun1();
        oops makefun1 = new oops();
        makefun1.fun1();
        fun2();

    }
    
    public void fun1(){
        System.out.println("I am running funtion");
    }

     public static void fun2(){
        System.out.println("I am running funtion");
    }
}
