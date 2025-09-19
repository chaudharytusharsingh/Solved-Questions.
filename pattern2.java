public class pattern2 {
    public static void f1() {
         int n =4;
    int num =1;
    for (int i = 0; i < n; i++) {
       
        for (int j = 0; j < i+1 ; j++) {
            System.out.print(num +" ");
            num++;
            
        }
        System.out.println();
    }
    }

    public static void f2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void f3(int n) {
         char c ='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(c);
            }
             c++;
            System.out.println();
        }
    }



public static void main(String[] args) {
   //f1();
   //f2(4);
   f3(4);
}
}