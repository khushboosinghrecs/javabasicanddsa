public class methodClass {
   
    public static void main(String args[]){
        // data type  argumente
        // a+b
        // a-b
        // a*b
        // a/b   
        // fucntionname()
        int c = 10;
        int var = sum(2, 3, 1);
        System.out.println("Hello");
        System.out.println();
        int multiply = multiplyFun();
        System.out.println(multiply);
        voidFun(4, 4);
        withoutargs();
        cuboidperim();
    }
    // data type and argument  return
    public static int sum(int a, int b, int c ){
        if(c == 1){
            return a+b;
        }
          if(c == 2){
            return a*b;
        }
          if(c == 3){
            return a-b;
        }
        return a*b;
    }
    // data type  argument  without return 
    //   public static float calculatordiv(int a, int b){
    //     float z= a/b;
    //     System.out.println(z);
    //     
    // }

     // data type and withour argument  return 
    public static int multiplyFun(){
        int a= 10*3; 
        return a;
    }
    // void argument with args
    public static void voidFun(int a, int b){
        System.out.println(a+b);
    }
    // void argument without args 
    public static void withoutargs(){
        System.out.println("last case funtion");
    }

     public static void cuboidperim(){
       double length = 50.5;
        double bredth = 50.5;
        double height = 50.5;
        double perimeteOfCuboid = 4*(length +bredth+height);
        System.out.println(
            "permiter " +perimeteOfCuboid);
     }
    
}
