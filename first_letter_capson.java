/*
public class first_letter_capson {


    public static String caps_on(String str) {

        StringBuilder st= new StringBuilder("");
       char cap = Character.toUpperCase(str.charAt(0));
       st.append(cap);
     .charAt(i)));
        }
        else{
            st.append(str.charAt(i));
        }
        
       }
      return st. toString(); 
    }

    public static void main(String[] args) {
        String str = "hello guys am tushar";
       
        System.out.println( caps_on(str));
    }
} 











public class first_letter_capson {

    public static String upper_case(String str) {

        StringBuilder sb = new StringBuilder("");
      char  start =  Character .toUpperCase ( str.charAt(0));
      sb.append(start);
        for (int i = 1; i < str.length() ; i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
             sb.append( Character.toUpperCase (str.charAt(i)));
            }
            else{
               sb.append( str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello tushar singh are you student";
      System.out.println(upper_case(str)); 
    }
}

*/









public class first_letter_capson {


     public static String upper_cass(String str) {
        StringBuilder st = new StringBuilder("");
       char x= Character .toUpperCase(str.charAt(0));
       st.append(x);
       for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == ' '  &&  i<str.length()) {
            st.append(str.charAt(i));
            i++;
            st.append(Character.toUpperCase(str.charAt(i)));

        }
        else 
        {
             st.append(str.charAt(i));
        }
       }
          return st.toString();
     }
    public static void main(String[] args) {
        String str = "hrllo guys am tushar singh";
        System.out.println(upper_cass(str)); 
    }
}
