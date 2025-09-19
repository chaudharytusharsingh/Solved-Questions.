public class gc2 {
    public static int factorial1(int n) {
        if (n==0) {
            return 1;
        }
       int f =  factorial1(n-1);
       int x = n * f;
       return x;
    }

    public static int factorial2(int m ) {
        if (m == 0) {
            return 1;
        }
         int y=  factorial2(m-1);
          int z = m*factorial2(m-1);
          return z ;
            }
    
    public static void main(String[] args) {
       int fact1 = factorial1(5);
        int fact2= factorial2(4);
        if (fact1 > fact2) {
            int result ;
          System.out.println( result = fact1 - fact2);  
        }
        else{
            System.out.println(" the values is negative , for conveninence we display 0:");
        }
    }
}
