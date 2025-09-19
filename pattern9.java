public class pattern9 {

    public static void main(String[] args) {
        int n =4;
        for (int i = 0; i < n ; i++) {
            for (int j = n-i-1; j > 0; j--) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
           
            System.out.println();
        }
    }
}