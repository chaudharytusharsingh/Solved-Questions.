
// SINGLE LEVEL INHERITANCE 


/*public class OOPS_4_INHERITANCE {
    public static void main(String[] args) {
        Fish obj = new Fish();
        obj.eat();
    }
}

class Animal{
    int legs;
    String colour ;

    void eat (){
        System.out.println("eating");
    }

    void breadth(){
        System.out.println("breadthing");
    }
}

class Fish extends Animal{
    int fins;
    void Swim(){
        System.out.println("swiming");
    }
}*/




// MULTI LEVEL INHERITANCE 

public class OOPS_4_INHERITANCE {
    public static void main(String[] args) {
        birds peko = new birds();
        peko.eat();
       // peko. legs = 2;
        System.out.println(peko.legs=2);
        peko.Swim();
    }
}

class Animal{
    int legs;
    String colour ;

    void eat (){
        System.out.println("eating");
    }

    void breadth(){
        System.out.println("breadthing");
    }
}

class Fish extends Animal{
    int fins;
    void Swim(){
        System.out.println("swiming");
    }
}

class birds extends Fish {
     int wings;
}

