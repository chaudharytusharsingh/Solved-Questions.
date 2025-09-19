public class recursion11 {
    public static void noconjecutiveone(int n  , String s  , int last ) {
        if (n== 0) {
            System.out.println(s);
            return ;
        }
        noconjecutiveone(n-1, s+"0" , 0);
        if (last == 0 ) {
            noconjecutiveone(n-1, s+"1", 1 );
        }
     
    }
    public static void main(String[] args) {
        noconjecutiveone(3, "", 0);
    }
}
