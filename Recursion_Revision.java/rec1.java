/* public class rec1 {
  public static void f1(int n , int i , int sum ) {
    if (i==n) {
      sum+=i;
      System.out.println(sum);
      return;
    }
    sum+=i;
     f1(n, i+1, sum);
  }

  public static void main(String[] args) {
    f1(5, 1, 0);
  }
}
 */

 public class rec1 {
  public static int sum(int n) {
    if (n==0) {
      return 0;
    }
     int y =  sum(n-1);
     int x = n  +y;
     return x;
  }
 
  public static void main(String[] args) {
    int n  = 5;
   System.out.println(sum(n)); 
  }
 }