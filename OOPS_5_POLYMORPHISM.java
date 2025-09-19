
//METHOD OVERLOADING 
//COMPILE TIME POLYMORPHISM  //SAME METHOD NAME WITH DIFFERENT PARAMETERS


/*public class OOPS_5_POLYMORPHISM {
    public static void main(String[] args) {
        calculator cal = new calculator();
       System.out.println(cal.sum((float)5.3, (float)2.7));
    }
}

class calculator{
   int sum(int a , int b){
        return a+b;

    }
   float sum(float a, float b){
        return a+b;

    }
}*/


//METHOD OVERRIDING 
//RUN TIME POLYMORPHISM  //EXACT SAME METHOD WITH DIFFERENT DEFINATION



public class OOPS_5_POLYMORPHISM {

    public static void main(String[] args) {
        lion cal = new lion();
        cal.eat();
    }
}
class animal{
    void eat(){
   System.out.println("hello");
    }
}
class lion extends animal{
     void eat(){
  System.out.println("helloji");
    }
}