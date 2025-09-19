//print x^n using recursion   O(N)
public class recursion8 {
    public static int power(int x , int n ) {
        if (n==0) {
            return 1;
        }
        int fin = power(x, n-1);
        int result = x* fin;
        return result;
    }

    
     //print x^n using recursion   O(LOG )
    public static int poweropti(int x , int n) {
        if (n==0) {
            return 1;
        }
        int opt = poweropti(x, n/2);
        int optes = opt * opt ;
        // if n is odd
        if (n%2!=0) {
             opt = x*opt;
        }
        return opt;
    }

    public static void main(String[] args) {
        System.out.println(poweropti(2,5));
      System.out.println(  power(2, 5));
      

    }
}


