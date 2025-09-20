public class Back_Tracking {

  public static void BackTr(int ar[] , int i , int val) {
    //base_case
    if (i == ar.length) {
      printarray(ar);
      return ;
      
    }

    //Main kaam
    ar[i] = val;
    BackTr(ar, i+1, val+1);
    ar[i] -= 2;

  }

  public static void printarray(int ar[]) {
    for (int i = 0; i < ar.length; i++) {
      System.out.print(ar[i]+" ");
    }
  }

  public static void main(String[] args) {
    int ar []  = new int[5];
     BackTr(ar, 0, 1);
     System.out.println( );
     printarray(ar);
  }
}