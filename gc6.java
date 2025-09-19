public class gc6 {
    //calculate no. of spaces
    public static int count_space(StringBuilder sb) {
        int count =0;
        for (int i = 0; i < sb.length(); i++) {
            if ( sb.charAt(i) == ' ') {
                count++;
            }
            else{
                continue;
            }
        }
        return count ; 
       }
          


        //calculate no. of vowels
        public static int count_vowels(StringBuilder sb) {
            int count = 0;
            for (int i = 0; i < sb.length() ; i++) {
                char s = Character.toLowerCase(sb.charAt(i));
                if (s =='a' || s =='e' || s =='i'  || s =='o'  || s=='u' ) {
                    count ++;
                }
                else{
                    continue;
                }
            }
            return count;
            
        }


          //calculate highest frequency of vowel
         public static void highest_freq(StringBuilder sb) {
            int ar[] = new int [5];
            for (int i = 0; i < sb.length(); i++) {                
                char ch = Character.toLowerCase(sb.charAt(i));
                switch (ch) {
                    case 'a':
                        
                        break;
                
                    default:
                        break;
                }
                
            }

            
         }        

    public static void main(String[] args) {

        //calculate no. of spaces
        System.out.println("no. of spaces");
             StringBuilder sb = new StringBuilder("HELLO WORLD I AM WRITING A PROGRAM");
       System.out.println( count_space(sb));

       //calculate no. of vowels
       System.out.println("no. of vowels");
       System.out.println(count_vowels(sb) );

        //calculate highest frequency of vowel
        System.out.println("highest frequency of vowel");
        highest_freq(sb);
       
        



    }
}
