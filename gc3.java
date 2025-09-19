 public class gc3 {
    public static void sort(int ar[]) {
        for (int i = 0; i < ar.length-2; i++) {
            for (int j = 0; j < ar.length-1-i; j++) {
                if (ar[j] > ar[j+1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
            
        }
    }
 
    public static void main(String[] args) {
        int ar[] = { 2,9,7,92,6,4,2,42,2,4,5};
        sort(ar);
       for (int i = 0; i < ar.length; i++) {
        System.out.print(ar[i]+" ");
       }
    }
 }