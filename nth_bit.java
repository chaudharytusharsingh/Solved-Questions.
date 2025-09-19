import java.util.*;
public class nth_bit {

    //get_ nth _bit value: 
    public static int get_nth_bit(int n , int i) {
        if ((1 << i & n )==0) {
           return 0;
        }
        return 1;
    }



    //set_nth_bit: 
    public static int set_nth_bit(int n , int i) {
        if ( (1<<i | n)  != 0 ){
            return (1<<i | n) ;
        }
        
   return (1<<i | n) ; 
}

     public static int  clear_nth_bit(int n , int i) {
       //System.out.println(~(1<<i) & n); 
       return ~(1<<i) & n; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number :");
       int n= sc.nextInt();
         System.out.println(" enter i :");
       int i = sc.nextInt();
   //   System.out.println(get_nth_bit(n , i)); 
   //  System.out.print(set_nth_bit(n, i));
       System.out.print(clear_nth_bit(n, i));
    }
}