public class hollowrectangle {
    public static void f3(int row , int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i==0||  j==0|| i==3 || j ==4) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
            
        }
    }

    public static void main(String[] args) {
        int row =4;
        int column =5;
        f3(row, column);

    }
}