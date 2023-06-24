// 10, 20 , 30 40 , 50
// 20 is present or not,  
public class breakclass {
    public static void main(){
        int arr[] = {10, 20 , 30, 40 , 50, 40};
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]== 20){
                System.out.println( "20  is present");
                 System.out.println( i + " i is present");

                break;
            }
        }
    }
    
}
