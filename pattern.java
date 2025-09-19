public class pattern {
    public static void f1(int n) {
       for (int i = 0; i < n-1; i++) {
        char c = 'A';
        for (int j = 0; j < n; j++) {
            System.out.print(c+" ");
            c++;
        }
        System.out.println(); 
       }
       return;
    }
    public static void main(String[] args) {
     f1(5);
    }
}
