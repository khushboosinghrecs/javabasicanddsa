public class SpiralMatrix {
    public static void main(String[] args) {

        
        // spiral matrix => 0th [[1, 2, 3, 4],
		// 		           1th  [5, 6, 7, 8 ],
		// 		           2nd  [9, 10, 11, 12] ,
		// 		           last [13, 14, 15, 16],
                            // last[13, 14, 15, 16]]

                            //  0th [[1, 2, 3,  5 ,4],
		// 		           1th  [5, 6, 7, 6,  8 ],
		// 		           2nd  [9, 10, 11, 6,  12] ,
		// 		           last [13, 14, 15, 6,  16],
                            // last[13, 14, 15, 6,  16]]

        //                 0th row then all  column element ;
        //                 1st row then last column element;
        //                 2nd row then last column element;
        //                 :
        //                 :
        //                 last row all column element decreasing order of indeces last row;
        // top down
        // left right
        // direction;
        // 0 00, 01, 02, 03, 04
        // 1 14, 24, 34
        // 2 33, 32, 31, 30
        // 3 20, 10

        // 0 11, 12, 13
        // 1 23
        // 2 22, 21
        // 3


        //                 00, 01, 02, 03, 04,
        //                 10, 11,  12 , 13, 14,
        //                 20, 21,  22 , 23, 24
        //                 30, 31,  32, 33,  34
        //                 40, 41, 42, 43, 44

                        // l

                        int ar[][] = {{1, 2, 3, 4},
                                    {5, 6, 7, 8}, 
                                    {9, 10, 11, 12},
                                    {13, 14, 15, 16},
                                    {17, 18, 19, 20}};
                        int row= 5; 
                        int column = 4;
                       int   top =0;
                       int  down = row-1;
                        int  left= 0;
                        int  right = column-1;
                       int  direction =0;
                    for(int i =0; i< ar.length; i++){
                        while(top<=down && left<=right){
                            if(direction ==0){
                                for( int j= left; j<=right; j++){
                                    System.out.print(ar[left][j] + " ");
                                }
                                top++;
                                // direction++;
                                System.out.println();
                            }
                            if(direction ==1){
                                   for( int j= top; j<=down; j++){
                                    System.out.print(ar[j][right] + " ");
                                }
                                right--;
                                  System.out.println();
                            }
                            if(direction ==2){
                                  for( int j= right; j>=left; j--){
                                    System.out.print(ar[down][j] + " ");
                                }
                                down--;
                                  System.out.println();
                            }
                             if(direction ==3){
                                  for( int j= down; j>=top; j--){
                                    System.out.print(ar[j][left] + " ");
                                }
                                left++;
                                  System.out.println();
                            }
                            direction = (direction+1)%4;
                            // direction = (0+1)%4; =>1
                            // direction =(1+1)%4= 2; 2
                            // direction =(2+1)%4 = 3 
                            // direction = (3+1) %4 = 0

                        }
                    }




    }
    
}
