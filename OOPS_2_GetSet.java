/*public class OOPS_2_GetSet {

     public static void main(String[] args) {
        Pen p1 = new  Pen();
        p1.setColour("red");
       System.out.println(p1.getColour()); 
        p1.setTip_size(5);
      System.out.println((p1.getTip_size()));

    }

   public static class Pen{
       private int tip_size;
      private  String colour;

        public String getColour() {
            return colour;
        }

         void setColour(String colour) {
            this.colour = colour;
        }

        public int getTip_size() {
        return tip_size;
        }
        void setTip_size(int tip_size) {
            this.tip_size = tip_size;
        }



    }

   
}*/

public class OOPS_2_GetSet {

    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolour("green");
        System.out.println(p1.colour);
        p1.setsize(6);
        System.out.println(p1.size);
    }
}

class Pen{
    private int size ;
    private String colour;

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

 
}