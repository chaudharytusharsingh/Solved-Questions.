public class sumofdigit {
  public static int sum_of_digit(int n) {
    int sum =0;
    while (n>0) {
      int x = n%10;
     sum = sum+x;
     n = n/10;

    }
    return sum;
  }


  public static int product_of_digit(int n) {
    int product =1;
    while (n>0) {
      int x = n%10;
     product = product*x;
     n = n/10;

    }
    return  product;
  }


  public static int sum_of_Even_digit(int n) {
    int sum_Of_Even_Digit = 0;
    while (n>0) {
      int last_Value = n%10;
      if (last_Value % 2== 0) {
        sum_Of_Even_Digit += last_Value;
        n= n/10;
      }
      else{
         n= n/10;
        continue;
      }
    }
    return sum_Of_Even_Digit;
  }


  public static int reverse_of_digit(int n) {
    int r =0;
       while (n>0) {
       int x = n%10;
      r*=10;
      r+=x;
     n = n/10;


       }
       return r;
  }


  public static int factorial_of(int n) {
        if (n==0) {
          return 1;
        }
             int fin = factorial_of(n-1);
             int res = n*fin;
             return res;
         

  }
  public static void main(String[] args) {
    int n =5;
    sum_of_digit(n);
   // System.out.println(sum_of_digit(n));
      //  System.out.println(product_of_digit(n));
         //System.out.println(sum_of_Even_digit(n));
        //          System.out.println(reverse_of_digit(n));
                                    System.out.println(factorial_of(n));



  }
}
