public class OOPS_6_ABSTRACTION {

    public static void main(String[] args) {
        cat c = new cat();
    }
}
abstract class Animals {
    Animals(){
        System.out.println(" animal constructor called ");
    }
    void eat(){
        System.out.println("eating");
    }
    abstract void walk();
}
class dog extends Animals{
    dog(){
        System.out.println( " dog constructor called");
    }
    void walk(){
        System.out.println("barking");
    }
}
class cat extends dog{
    cat (){
        System.out.println(" cat constructor called ");
    }
    void walk(){
        System.out.println("meww...");
    }
}


// WHEN OBJ CREATED OF CHILD CLASS THEN THE COMPILER FINDS THE CONSTRUUCTOR OF SUPER SCLASS FIRST THEN OTHER PARENT CLASS THEN CHILD CLASS