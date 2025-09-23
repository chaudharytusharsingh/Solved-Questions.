public class rec3 {
  public static int  sum(int n ) {
    int i=0;
    int sum =0;
    while (i!=n+1) {
      sum+=i;
      i++;
    }
    return sum;
  }
  public static void main(String[] args) {
    int n =5;
    System.out.println(sum(n));
  }
}
