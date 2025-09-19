public class gc5 {

    //pattern
    public static void  patt(int n ) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = n-i-1; j >= 0 ; j--) {
                System.out.print(" ");
            }
            //increase
            for (int j = i+1; j <= 2*i+1 ; j++) {
                System.out.print(j+" ");
            }
            //decrease
            for (int j = 2*i ; j >= i+1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =5;
        patt(n);
        
    }
}