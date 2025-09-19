public class pattern1 {

    public static void main(String[] args) {
        int n = 3;
        char inner = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(inner+" ");
                inner++;
            }
            System.out.println();
        }System.out.println(" after print the va;ue of num is : "+inner);
    }
    
} 