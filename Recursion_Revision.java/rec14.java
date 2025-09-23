public class rec14 {
  
  public static void x_at_last(String str , String new_str , int index , int count ) {
    
    if (index == str.length()) {
      for (int i = 0; i < count; i++) {
        new_str += "x";
      }
      System.out.println(new_str);
      return;
    }
    
    char ch = str.charAt(index);
    if (ch == 'x') {
      x_at_last(str, new_str, index+1, count+1);
    }
    else{
       x_at_last(str, new_str+ch, index+1, count);
    }
   

  }

  public static void main(String[] args) {
    String str = "axbcxxd";
    String new_str = "";
    int index = 0;
    int count  = 0;

    x_at_last(str, new_str, index  ,count );
  }

}