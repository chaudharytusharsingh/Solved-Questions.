public class r2 {
  public static void tillzero(int n) {
    if (n == 0) {
      // System.out.println(n);
      return;
    }
    tillzero(n - 1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    tillzero(10);
  }
}
