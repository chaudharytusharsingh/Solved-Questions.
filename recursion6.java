public class recursion6 {
    public static int last(int ar[] , int key , int i ) {
       if (i == ar.length) {
        return -1;
       }
      int lasts =  last(ar, key, i+1);
       if (lasts != -1) {
        return lasts;
       }
       if (ar[i] == key ) {
        return i;
       }
       return -1;
    }

    public static void main(String[] args) {
        int ar[] = { 1,6,479,3,13,6,23,40};
      System.out.println(last(ar, 6, 0));
    }
}