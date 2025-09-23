// Merge sort
public class Merge_Sort {

  public static void divide(int ar[], int start_idx, int end_idx) {
    if (start_idx >= end_idx) {
      return;
    }

    int mid = start_idx + (end_idx - start_idx) / 2;
    divide(ar, start_idx, mid);
    divide(ar, mid + 1, end_idx);
    conqer(ar, start_idx, mid, end_idx);

  }

  public static void conqer(int ar[], int start_idx, int mid, int end_idx) {
    int merg[] = new int[end_idx - start_idx + 1];
    int indx1 = start_idx;
    int indx2 = mid + 1;
    int merg_idx = 0;

    while (indx1 <= mid && indx2 <= end_idx) {
      if (ar[indx1] <= ar[indx2]) {
        merg[merg_idx] = ar[indx1];
        merg_idx++;
        indx1++;
      } else {
        merg[merg_idx] = ar[indx2];
        merg_idx++;
        indx2++;
      }
    }

    while (indx1 <= mid) {
      merg[merg_idx] = ar[indx1];
      merg_idx++;
      indx1++;
    }

    while (indx2 <= end_idx) {
      merg[merg_idx] = ar[indx2];
      merg_idx++;
      indx2++;
    }

    for (int i = 0, j = start_idx; i < merg.length; i++, j++) {
      ar[j] = merg[i];
    }
  }

  public static void main(String[] args) {
    int ar[] = { 6, 3, 9, 5, 2, 8 };
    divide(ar, 0, ar.length - 1);
    for (int index = 0; index < ar.length; index++) {
      System.out.print(ar[index]+" ");
    }
  }

}
