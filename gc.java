public class gc {

  //  PATETRN IN SINGLE LINE SERIES:

    public static void consequtive_no(int n ) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+" ");
            }
        }
    }

   // PATETRN IN LINE BY  LINE SERIES:

    public static void line_by_line(int n ) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println("PATETRN IN SINGLE LINE SERIES:  ");
        consequtive_no(n);
        System.out.println("PATETRN IN LINE BY  LINE SERIES: ");
        System.out.println();
        line_by_line(n);

        
    }
}