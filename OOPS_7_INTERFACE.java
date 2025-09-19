/*
public class OOPS_7_INTERFACE {

    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}

interface chess{
    void moves();
}
class king implements chess{
   public void moves(){
        System.out.println(" i am king ");
    }
}
class queen implements chess{
   public void moves(){
        System.out.println(" i am queen ");
    }
} */


public class OOPS_7_INTERFACE {

    public static void main(String[] args) {
        beer b = new beer();
        b.eat();
        b.sleep();
    }
}

interface herbivorous{
    void eat();
}

interface carnivorous{
    void sleep();
}
class beer implements carnivorous , herbivorous{
   public void eat (){
        System.out.println(" i am animal");
    }
    public void sleep(){
        System.out.println(" i am sleeping");
    }
}


