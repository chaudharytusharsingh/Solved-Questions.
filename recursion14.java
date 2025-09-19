 //INCREASING NUMBER FROM N

public class recursion14{
  public static void dec(int n) {
    if (n==10) {
      System.out.println(n);
      return;
    }
     System.out.println(n);
  
       dec(n+1);  
        
  }
  
  public static void main() {
    int n =0;
   dec(n);
  }}

