public class recursion4 {
    public static boolean issort(int ar[], int i) {
        if (ar[i] > ar[i+1]) {
            return false;
        }

        if (i == ar.length-1) {
            return true;
        }

       return issort(ar, i+1);
    }

    public static void main(String[] args) {
        int ar[]= {1,2,3,4,5,6};
        System.out.println(issort(ar, 0));
    }
}