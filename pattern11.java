public class pattern11 {

    public static void main(String[] args) {
        int n = 4;
        //first half 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" "+" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            
          
           System.out.println();

           //second half
        }
        for (int i = 0; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
         
        
    }
}

    