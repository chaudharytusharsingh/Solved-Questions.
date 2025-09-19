//sum of n natural no.

public class recursion3 {
    public static int f1(int n ) {
       // base case
        if (n == 1) {
            return 1;
        }
        //work
        int sum = f1(n-1);
        int sum1 = n+sum;
        return sum1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(f1(n));
    }
}