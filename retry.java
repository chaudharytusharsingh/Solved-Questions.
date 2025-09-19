import java.util.*;
public class retry {
    public static void show(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[ "+matrix[i][j]+" ]");
            }
        }
    }
    public static void main(String[] args) {
       Scanner c = new Scanner(System.in);
      int n =  c.nextInt();
      int m = c.nextInt();
        int matrix[][] = new int[n][m];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value in matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] =  sc.nextInt();
            }
        }
        show(matrix);
       
    }
}
