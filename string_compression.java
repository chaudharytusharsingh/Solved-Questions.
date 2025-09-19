public class string_compression {
    public static String f1(String str) {
        
        StringBuilder sb = new StringBuilder("");
      
        for (int i = 0; i < str.length(); i++) {
              Integer count =1;
              while ( i < str.length()-1 &&  str.charAt(i) == str.charAt(i+1)  ) {
                i++;
                count++;
              }
              sb.append(str.charAt(i));
              if (count > 1) {
                sb.append(count);
              }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccccddd";
       System.out.println(f1(str)); 
    }
}