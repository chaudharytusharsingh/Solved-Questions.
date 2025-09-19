public class bitwise_check_power_of2 {

    public static int check(int num ) {
        if ((num & (num-1)) == 0) {
            System.out.println("YES power of 2: " );
            return 1;
        }
       
            System.out.println("NOT power of 2: ");
            return 0;
        
    }
    public static void main(String[] args) {
        int num = 19;
       System.out.println(check(num)); 
    }
}
