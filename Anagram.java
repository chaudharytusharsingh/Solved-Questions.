import java.util.Arrays;

public class Anagram {
  public static boolean isAnagram(String str1 , String str2) {
     if (str1.length() == str2.length()) {
      char characterArr [] = str1.toCharArray();
            char characterArr2 [] = str2.toCharArray();

            Arrays.sort(characterArr);
            Arrays.sort(characterArr2);

         boolean result =   Arrays.equals(characterArr, characterArr2);
         return result;

     }
     else{
        return false;
     }
  }
  public static void main(String[] args) {
    int n1 = 1578;
    int n2 = 5871;
    String str1 = String.valueOf(n1);
    String str2 = String.valueOf(n2);
      System.out.println(isAnagram(str1, str2)); 
      System.out.println(str1 +  "  "+ str2 );



  }
}
