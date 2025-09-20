public class power_of_n {
  public static int f1(int n , int p) {
    if (p == 0) {
      return 1;
    }

    int x = f1(n , p-1);
    int y = x*n;
    return y;
  }


  public static void main(String[] args) {
    int n = 5;    int p = 3;
  System.out.println(f1(n, p));
  }
}
