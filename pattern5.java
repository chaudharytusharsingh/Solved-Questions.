public class pattern5 {
    public static void f1(int n ) {
        int num =1;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(num + " ");
                num++;
              
            }
            System.out.println();
        }
    }

     public static void f2(int n ) {
        char ch ='A';
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(ch + " ");
                ch++;
              
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      //  f1(3);
         f2(3);
    }
}