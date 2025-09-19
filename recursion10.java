public class recursion10 {
    public static int   friendspairing(int n ) {
       /*  if (n==1 ||  n==2) { 
            return n;
        }
        int single = friendspairing(n-1);
        int pair = friendspairing(n-1) + (n-1)*friendspairing(n-2);
        return  pair;  
        */

        if ( n== 1 || n==2) {
            return n ;
        }
        
    } 
    public static void main(String[] args) {
        int n =3;
       System.out.println(friendspairing(n)); 
     


    }
}
