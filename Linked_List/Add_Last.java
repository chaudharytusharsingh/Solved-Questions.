package Linked_List;

public class Add_Last {
  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head;
  public Node tail;

  public void add_Last(int data) {
    // Create New Node
    Node new_node = new Node(data);

    if (head == null) {
      head = tail = new_node;
      return;
    }
    // Linking Step
    tail.next = new_node;
    // Update Tail
    tail = new_node;
  }

  public void print_linked_list() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    Add_Last Al = new Add_Last();
    Al.add_Last(10);
    Al.add_Last(20);
    Al.add_Last(30);
    Al.add_Last(40);
    Al.print_linked_list();
  }
}