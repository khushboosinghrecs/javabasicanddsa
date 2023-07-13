import java.util.Vector;

public class VectorEx {

    // [1, 2, 3, 4, 5 ] => 3
    // 0 ............loength -1
    public static void main(String[] args) {
        Vector<Integer> vectorarr = new Vector<>();
        vectorarr.add(1);
        vectorarr.add(2);
        vectorarr.add(3); 
        vectorarr.add(4); 
         vectorarr.add(5);
         vectorarr.remove(0);
         vectorarr.removeElement(3);
        // itertint traversing 
         for(int ele : vectorarr){
            System.out.println(ele);
         }

        Vector<String> vectorarrStr = new Vector<>();
        vectorarrStr.add("hello");
        vectorarrStr.add("world");
        vectorarrStr.add("java"); 
        vectorarrStr.add("world"); 
         
        for( String str : vectorarrStr){
             System.out.println(str);
        }
        


    }
    
}
