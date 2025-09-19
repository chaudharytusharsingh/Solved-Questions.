public class str {

    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("CHAUDHARY_TUSHAR _SINGH");
        for (int i = 0; i < sc.length()/2; i++) {
            int start = i;
            int end = sc.length()-i-1;

            char ENDS = sc.charAt(end);
            char STARTS = sc.charAt(start);

            sc.setCharAt(end, STARTS);
            sc.setCharAt(start, ENDS);
        }
        System.out.println(sc);
    }
}