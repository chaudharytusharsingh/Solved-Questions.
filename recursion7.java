public class recursion7 {
    public static int find(int ar[] , int key , int i) {
        // first of all we try to found after current index
         if (i == ar.length) {
            return -1;
         }
        int findes = find(ar, key, i+1);
        if (findes == -1 && ar[i]==key) {
            return i;
        }
        return findes;
    }

    public static void main(String[] args) {
        int ar[] = { 5,7,941,31,3,113,7,3,31,44,64,3};
        System.out.println(find(ar, 31, 0));
        
    }
}