public class gc4 {

    public static void main(String[] args) {

     
          int   i ;
          int   j; 
          int   k;
          int   n = 5;
    for (i = 1; i <= n; i++) {
        // Print leading spaces
        for (j = 1; j <= n - i; j++)
           System.out.print(" ");
        // Print increasing part
        for (k = i; k < 2 * i; k++)
            System.out.print(" "+k);
        // Print decreasing part
        for (k = 2 * i - 2; k >= i; k--)
            System.out.print(" "+k);
       System.out.println();
    }
   
}
        
    }
   