public class bit_countnoof1 {
    public static int set_one(int num) {
        int count =0;
        while (num > 0 ) {
            if (( num & 1) !=0  ) {
                count++;
        }
         num = num >> 1;
          }  
        return count;
    }
    public static void main(String[] args) {
        int num = 10;
       System.out.println(   "THE NUMBER OF 1'S ARE: "+set_one(num) + " IN " + num);
    }
}
