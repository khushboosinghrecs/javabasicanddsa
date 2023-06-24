
// datatype variablename = somevalue
// int num ==> declaration
// int num = 20; ==> intializiation

// datatype nameofFun(arguments){
// arguments=> value that will be accessable to this function (scope of that variable)
// }
// outside of fun=> error
// datatype=> int, char, float, double, char, Strings, array

// 1->datatye arguments
// 2->void arguments
// 3-> datattye without_arguments
// 4-> void  without_arguments
public class methodPractice {
    public static void main(String args[]){
         // [ | | | | ] index->
        int arr[] = new int[5];
        // 5
        for(int i=0; i<arr.length; i++){
            arr[i] = i*10;
        }
        // sum(arr);
        // 
        sum();
        max(arr);
        multiply(arr);
    }
    public static int[] takeinginput(){
        // [ | | | | ] index->
        int arr[] = new int[5];
        // 5
        // 0, 100, 200, 300, 400
        for(int i=0; i<arr.length; i++){
            arr[i] = i*100;
        }
        return arr;
    }
      public static void max(int arrone[]){
          // 0, 10, 20, 30, 40
       int arrTwo[] = takeinginput();
       //0 , 100, 200, 300, 400
         int max = 0;
        for(int i=0; i<5; i++){
            if(arrone[i]>max){
            max=arrone[i];
        }
        }
        System.out.println(max);
    }
     // public static void sum(int arr[]){
    public static void sum(){
        int arr1[] ;
        // 0, 10, 20, 30, 40
       int arr[] = takeinginput();
        int sum = 0;
        for(int i=0; i<5; i++){
            sum=sum+arr[i];
            System.out.println( "sum" + " " +arr[i]);
        }
        System.out.println(sum);

    }
   
   
    public static void multiply( int arr[]){
         int mul = 1;
        for(int i=0; i<5; i++){
            mul = mul*arr[i];
        }
        System.out.println(mul);
    }
}
