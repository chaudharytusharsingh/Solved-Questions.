import java.util.*;
public class bit_check_E_OR_O {
    public static void bit_check (int n) {
        int bitmask = 1;
        if ((n & bitmask) == 1) {
            System.out.println("odd ");
        }
        else{
            System.out.println("even");
        }
    }
 

   public static void main(String[] args) {
    System.out.println(" Enter no. u want  to check weather odd or even : ");
    Scanner sc = new Scanner(System.in);
    int n=  sc.nextInt();
    bit_check(n);

     
   }
}
