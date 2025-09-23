public class rec12 {
  public static int first = -1;
  public static int last = -1;

  public static void first_LAST_OCCUR(String str, int index, char found) {
    if (index == str.length()) {

      System.out.println(first + " ");

      System.out.println(last + " ");

      return;
    }
    String small = str.toLowerCase();
    char ch = small.charAt(index);
    if (ch == found) {
      if (first == -1) {
        first = index;

      } else {
        last = index;

      }
    }        
    first_LAST_OCCUR(str, index + 1, found);
  }

  public static void main(String[] args) {
    String str = "animals";
    char found = 'a';
    int index = 0;
    first_LAST_OCCUR(str, index, found);
  }
}