public class pattern10 {

    public static void main(String[] args) {
        int n =4;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (j== n-i-1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
             
          
    }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i!=n-2) {
                 for (int j = 0; j < 2*(n-i)-5; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
         System.out.println();
            }
           
       
    }

    }