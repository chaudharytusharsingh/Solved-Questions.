public class matrix_find {
    public static void  matrix_find(int matr[][]) {
        int x = matr.length;
        int y = matr[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matr[i][j]%2!=0) {
                    continue;
                }
                System.out.print("["+matr[i][j]+ "]"+" " +"at "+i+","+j+" ");
                System.out.println();
            }
            System.out.println();
            
        }
        
    }

    public static void main(String[] args) {
        int  matr[][] = {{1,5,8,9}, {6,5,9,4},{3,7,9,7},{8,5,3,8}};
        matrix_find(matr);


    }
}