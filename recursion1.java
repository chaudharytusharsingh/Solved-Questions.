public class recursion1 {
    public static void fun1(int n) {
        if (n==52) {
            System.out.print(n);
            return;
        } 
        System.out.print(n+" ");
        fun1(n+1);
        
    }

    public static void main(String[] args) {
        int n =1;
        fun1(n);

    }
}