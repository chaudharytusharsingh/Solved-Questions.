public class oopsthis {
        String colour;
        String type ;

        public  void write() {
            System.out.println(this.colour);
        }



    public static void main(String[] args) {
       
        oopsthis p1 = new oopsthis();
         p1.colour = "black";
         p1.type = "gel";

         oopsthis p2 = new oopsthis();
         p2.colour = "blue";
         p2.type =  "ball";

         p1.write();
         p2.write();




        
    }
}