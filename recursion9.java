public class recursion9 {

    
    public static void remove_duplicate(String str , StringBuilder sb , int index , boolean map[]) {
        if (index == str.length()) {
            System.out.println(sb);
            return;
        }
        
        char now = str.charAt(index);

        if (map[now - 'A'] == true) {
            remove_duplicate(str, sb, index+1, map);
        }
        else{
            map[now - 'A'] = true;
            remove_duplicate(str, sb.append(now), index+1, map);
        }
    }

    public static void main(String[] args) {
        String str = "CHAUDHARYTUSHARSINGH";
        remove_duplicate(str, new StringBuilder(), 0, new boolean[26]);
    }
}