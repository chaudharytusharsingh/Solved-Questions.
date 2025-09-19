public class recursionremove {
    public static void ma(String str , int idx , StringBuilder sb , boolean map[]) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        char c = str.charAt(idx);
        if (map[c-'a'] == true) {
            ma(str, idx+1, sb, map);
        }else{
            map[c-'a' ] =  true;
            ma(str, idx+1, sb.append(c), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollage";
          ma(str, 0,  new StringBuilder(""), new boolean[26]);
    }
}