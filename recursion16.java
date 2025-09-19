//PRINT X^N WITH time complexity O(logn)

public class recursion16 {
  public static int powe(int n , int p) {
    if (p==0) {
      return 1 ;
    }
     int power_even =powe(n, p/2) ;
       power_even  =  power_even *power_even;
      
     if (p%2!=0) {
       power_even =   power_even * n ;
     }
     return power_even;
  }
 public static void main(String[] args) {
  int n =2;  int p =10;
    System.out.println(powe(n, p));
 } 
}
