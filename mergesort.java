public class mergesort {
    public static void divide(int ar[] , int si , int ei ) {
        if (si>= ei ) {
            return;
        }
        int mid = si+(ei-si)/2;
        divide(ar, si, mid);
        divide(ar, mid+1, ei);
        conquer(ar, si, ei, mid);
      //  
    }

    public static void conquer(int ar[] , int si , int ei , int mid ) {
              
        int temp[]  = new int[ei-si+1];  //
        int indx1 = si;
        int indx2 = mid+1;
        int x = 0;
        while (indx1 <= mid && indx2 <= ei) {
            if (ar[indx1] <= ar[indx2]) {
               temp[x]  = ar[indx1];
                x++ ;
                indx1++;
            }else{
               temp[x]  = ar[indx2];
                x++;
                indx2++;
            }
  }
            while(indx1 <= mid) {
                temp[x] = ar[indx1];
                x++;
                indx1++;
            }
            while (indx2 <= ei) {
                temp[x] = ar[indx2];
                x++;
                indx2++;
            }
          for (int i = 0, j= si ; i < temp.length; i++ , j++) {
            ar[j] = temp[i];
          }
      

    }
 public static void main(String[] args) {
    int ar[] = {6,3,9,5,2,8};
    divide(ar, 0, ar.length-1);
    for (int i = 0; i < ar.length; i++) {
        System.out.print(ar[i]+" ");
    }
    System.out.println();

    
}
}
