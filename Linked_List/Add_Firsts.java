package Linked_List;

public class Add_Firsts {
   public class Node {
      int data;
      Node next;

      public Node(int data) {
         this.data = data;
         this.next = null;
      }
   }

   public static Node head;
   public static Node tail;

   public void add_node(int data) {
      // create node
      Node node1 = new Node(data);

      if (head == null) {
         tail = head = node1;
         return;
      }
      // linking
      node1.next = head;
      // update head
      head = node1;
   }

   public void print_linked_list() {
      Node temp = head;
      while (temp != null) {
         System.out.print(temp.data + " -->> ");
         temp = temp.next;
      }
      System.out.println("null");
   }

   public static void main(String[] args) {
      Add_Firsts Af = new Add_Firsts();
      Af.add_node(10);
      Af.add_node(20);
      Af.add_node(30);
      Af.add_node(40);
      Af.add_node(50);
      Af.add_node(60);
      Af.print_linked_list();
   }

}