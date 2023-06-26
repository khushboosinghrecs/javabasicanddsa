import javax.swing.text.html.parser.Element;
import javax.xml.crypto.Data;

public class pattern{
    public static void main(String[] args) {
        // 50 100
        // byte 8bit
        // int 64bit
        // 8000 to 10000 =>short

        // decimal float(4byte =>32bits) 5-6 decimal digit double(8byte=>64bits) 15-16 decimal digit 

        // 29.5, 28.67, 34.789, 45.6789
        float firstnum = 29.5f;

        float firstnumTwo ;
        // firstnumTwo => Datataype => float => 4 byte , 32bitse
          
        firstnumTwo = 29.5f;
        // 8 byte => 64
        // = 29.5; 

        // => [64] => [0|1] , firstnumTwo= size 32 aray size => [011]

        // 32bit of memory value = 64bit memory value

        // array1 size = 32 => 32 elemtets
        // array2 size 64 => 64 Element
        //  32 arrays size to 64arrasize


        // => 29.5 =>double

        // 29.345456
        // float 
        
        for(int i = 1; i<=8; i++)
        {
            for (int j=1;j<=i ;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=8-i+1;j++)
            {
             System.out.print("*"+ "  ");
            }
             System.out.println();
        }
        
    }
}