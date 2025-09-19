//PRIINT X^N

public class recursion15 {
  public static int powe(int n , int p) {
    if (p==0) {
      return 1;
    }

    int fi = powe(n, p-1);
    int fii = n*fi;
    return fii;
  }
  public static void main(String[] args) {
    int n =2; int p=10;
    System.out.println(powe(n, p));

  }
}
