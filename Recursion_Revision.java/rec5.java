public class rec5 {
  public static int f1(int n ) {
    if (n==1) {
      return 1;

    }
    int  x = f1(n-1);
   int y =  n*x;
    return y;

  }
  public static void main(String[] args) {
    int n =5;
    System.out.println(f1(n));
  }
}
