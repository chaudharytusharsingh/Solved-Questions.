public class rec7 {
  public static int f1(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int half = f1(x, n / 2);
    int halfs = half * half;
    if (n % 2 != 0) {
      halfs = halfs * x;

    }
    return halfs;
  }

  public static void main(String[] args) {
    int x = 2;
    int n = 10;
    System.out.println(f1(x, n));
  }
}
