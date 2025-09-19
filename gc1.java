public class gc1 {


    // difference of factorials of given number: 

    //calculate first factorial 
    public static int fact1(int n ) {
        int fact_first = 1;
        while (n>=1) {
            fact_first = fact_first * n;
            n--;
        }
        return fact_first;
    }
// calculate second factorial 
    public static int fact2(int m ) {
        int fact_second = 1;
        while (m>=1) {
            fact_second = fact_second * m;
            m--;
        }
        return fact_second;
    }
      
    public static int Difference(int factorial_of_one , int factorial_of_two) {
         if (factorial_of_one > factorial_of_two) {
         int difference =  factorial_of_one  -factorial_of_two;
          return difference;
         }
          return 0;
    }

public static void main(String[] args) {
    int n = 4;
    int m =2;
    System.out.println( fact1(n)); 
    System.out.println( fact2(m));
     int factorial_of_one =fact1(n);
     int factorial_of_two =fact1(m);
     int HERE = Difference(factorial_of_one, factorial_of_two) ; 
       if (HERE > 0) {
        System.out.println("Here is the difference of both Factorials "+HERE);
     }

     else{
        System.out.println("It gaves Negative value: "+HERE);
     }

    
   

}
}
