public class hello {
    public static void f1(int n ) {
        if (n==0) {
            System.out.print(n+" ");
            return;
        }
        
        System.out.print(n+" ");
        f1(n-1);
          

    }

    

public static void main(String[] args) {
    int n =10;
    f1(n);
}
}
