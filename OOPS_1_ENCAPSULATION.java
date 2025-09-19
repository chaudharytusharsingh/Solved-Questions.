/*public class OOPS_1_BASIC {
    public static void main(String[] args) {
        Pen p1 =new Pen();
        p1.setcolour("blue");
        System.out.println(p1.colour);

          p1.setip_size(5);
        System.out.println(p1.tip_size);
        }
}

class Pen  {
      String colour ;
      int tip_size ;
      
      void setcolour(String newcolour) {
        colour = newcolour;
      }
      void  setip_size (int new_tipsize){
        tip_size =new_tipsize;
      }  
    
}
public class OOPS_1_BASIC {

  public static void main(String[] args) {
               
    Pen p1 = new Pen();
    p1.setColour("green");

    p1.set_tip(5);
   }
 }

  class Pen {
    int tip;
    String colour;

     void setColour(String newcolour) {
        colour = newcolour;
           }
      void set_tip(int new_tip){
        tip = new_tip;
      
    }
  }
/*
public class OOPS_1_BASIC {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColour("green");
        p1.setTip(5);

        System.out.println("Colour: " + p1.colour);
        System.out.println("Tip Size: " + p1.tip);
    }
}

// Pen class
class Pen {
    int tip;
    String colour;

    void setColour(String newcolour) {
        colour = newcolour;   // ✅ correct assignment
    }

    void setTip(int new_tip) {
        tip = new_tip;
    }
}*/





//   ENCAPSULATION
public class OOPS_1_ENCAPSULATION {

  public static void main(String[] args) {
    pen p1 = new pen();
     p1.setcolour("voilet");
     p1.setsize(5);
     //System.out.println("COLOUR OF PEN: "+p1.colour);
    // System.out.println("SIZE OF PEN : "+p1.size);
    
  }
}

class pen {
  int size;
  String colour;

  void setcolour(String new_colour){
     colour = new_colour;
  }
  void setsize(int new_size){
     size = new_size;
  }
}
