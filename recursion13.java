//DECREASING NUMBER FROM N

public class recursion13 {
  public static void dec(int n) {
    if (n==1) {
      System.out.println(n);
      return;
    }
    System.out.println(n);
       dec(n-1);  
  }
  
  public static void main() {
    int n =10;
   dec(n);
  }}
