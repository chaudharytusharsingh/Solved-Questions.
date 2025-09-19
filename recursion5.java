//first occurance found
public class recursion5 {

    public static int find(int ar[] , int key , int i) {
        if (i == ar.length ) {
            return -1;
        }
        if (ar[i] == key) {
            return i;
        }

      return  find(ar, key, i+1);
    }

    public static void main(String[] args) {
        int ar[] = {1,3,78,6,12,478 ,21,1,78};
      //  int key = 12;
      System.out.println(find(ar, 78, 0));

    }
}