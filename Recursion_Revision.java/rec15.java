//Remove_Duplicate

public class rec15 {
  public static boolean ar[] = new boolean[26];
  public static void Remove_Duplicate(String str , String newString , int index  ) {
    if (index == str.length()) {
    System.out.println(newString);
   return ;  
  }
    char ch = str.charAt(index);
    if (ar[ch - 'a'] == false) {
      ar[ch - 'a'] = true;
      Remove_Duplicate(str, newString+ch, index+1);
    }
    else{
    Remove_Duplicate(str, newString, index+1);
    }
  }

  public static void main(String[] args) {
    String str = "abbcda";
    String new_str = "";
    int index = 0;
    Remove_Duplicate(str, new_str, index);
  }
}