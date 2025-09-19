public class Matrix2 {
    public static int diagonalsum(int matrix[][]) {
        int sum =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if (i==j || i+j==matrix.length-1) {
                sum+=matrix[i][j];
               } 
            }
        }
        return sum;
    }

    public static int approach2(int matrix[][]) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            //primary diagonal 

            result += matrix[i][i];
            
            System.out.println();
            //secondary diagonal

            if (i != matrix.length-1-i) {
                result += matrix[i][matrix.length-1-i];
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        diagonalsum(matrix);  
        System.out.print( diagonalsum(matrix)); 
        System.out.print(approach2(matrix));  
    } 
}