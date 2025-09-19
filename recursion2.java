public class recursion2 {
    public static int  f1(int n) {

        if (n==0) {
            return 1;
        }
        int fact = f1(n-1);
        int fact1 = n * fact;
        return fact1;
    }
    public static void main(String[] args) {
        int n =3;
        System.out.println(f1(n)) ;
    }
}