public class Palindrome {
  public static boolean ispalindrome(String str1) {
    str1.toLowerCase();
    int first =0;
    int last = str1.length()-1;
    while (first <= last) {
      if (str1.charAt(first) == str1.charAt(last)) {
        first++;
        last--;

      }
      else{
        return false;

      }
    }
    return true;
  }
  public static void main(String[] args) {
    String str1 = "RACEcAR";
   System.out.println(ispalindrome(str1)); 
  }
}
