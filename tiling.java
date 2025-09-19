public class tiling {
    public static int place(int n) {
        if (n==0 || n==1) {
            return 1;
        } 
        //if choose horizontal placing of tiles on floor    
        int hori =  place(n-2);
        int verti =  place(n-1);
        
        int finals = hori + verti;
        return finals;
    }

    public static void main(String[] args) {
        System.out.println(place(5));
    }
}