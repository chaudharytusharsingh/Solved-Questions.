import java.util.*;
public class Matrix0 {
    public static void show(int matrix[][]) {
        System.out.println("entered successfully");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("["+matrix[i][j]+"]"+" ");
            }
            System.out.println();
        }
    }
    public static void search(int matrix[][], int key) {
       System.out.println("found successfully"); 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                  System.out.print(matrix[i][j]+" found at location [ "+i+","+j+" ]");   
                }
            }
        }
    }

    public static void evenvalues(int matrix[][],int even) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] %2 == 0) {
                    System.out.print(matrix[i][j] +" at [ " + i +" , "+ j+" ]");
                }
                //System.out.println();
            }
        }
        
    }

    public static void main(String[] args) {
       
        int row = 3; int column= 3;
         int matrix[][] = new int[row][column];
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your matrix");
        for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
           matrix[i][j] =  sc.nextInt();
         }   
        }
        show(matrix);
        search(matrix, 20);
        evenvalues(matrix, column);


    }
}