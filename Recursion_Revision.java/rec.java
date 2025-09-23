public class rec {
public static void print_upto_n(int n ) {
  if (n==0) {
    return;
  }
  System.out.print(n+" ");
  print_upto_n(n-1);
}

  public static void main(String[] args) {
    print_upto_n(10);
  }
}
