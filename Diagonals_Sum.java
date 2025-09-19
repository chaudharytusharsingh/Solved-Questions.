public class Diagonals_Sum {
    public static int diagonal_sum(int matrix[][]) {
        int sum =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum+=matrix[i][j];
                } 
                else if (i+j == matrix.length-1  && i != j) {
                    sum+=matrix[i][j];
                }
                else{
                    continue;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,5,1,3}
                         ,{6,5,6,0,6},
                          {3,8,7,1,5},
                          {2,3,1,8,0},
                          {11,5,12,6,1}};
        diagonal_sum(matrix);
        System.out.println( diagonal_sum(matrix));
    }
}