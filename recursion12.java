//FACTORAIL OF N 

public class recursion12 {
  public static int dec(int n) {
    if (n==0 || n==1) {
      return 1;
    }
    int cal = dec(n-1);
    int res = n*cal;
    return res;
  }

  
  public static void main() {
    int n =10;
   System.out.println(dec(n)); 

  }
}
