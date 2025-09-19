public class pattern4 {
public static void f1(int n) {
       for (int i = 1; i <= n; i++) {
        for (int j = i; j >0; j--) {
            System.out.print(j+" ");
        }
        System.out.println();
       }
}
    public static void main(String[] args) {
        f1(4);
       
    }
}