public class rec13 {
  public static boolean is_sorted(int ar[], int i) {
    if (i == ar.length - 1) {
      return true;
    }
    if (ar[i] < ar[i + 1]) {
      return is_sorted(ar, i + 1);

    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    int ar[] = { 1, 8, 9, 10, 10 };
    System.out.println(is_sorted(ar, 0));

  }
}
