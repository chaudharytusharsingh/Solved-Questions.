package Linked_List;


public class Linked_List_Add_Delete_Insert {

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

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
  public static int size;;

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

  public void add_at_Middle(int index, int data) {
    // Create node
    Node node = new Node(data);
    size++;
    int i = 0;
    Node temp = head;
    while (i < index - 1) {
      temp = temp.next;
      i++;
    }
    // When Ever i == index-1
    // Link Establish to next node
    node.next = temp.next;
    // Link Establish to next node
    temp.next = node;
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

  public void add_at_start(int data) {
    // Create Node
    Node node = new Node(data);
    size++;
    if (head == null) {
      tail = head = node;
      return;
    }
    // Linking
    node.next = head;
    // update
    head = node;
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

  public void add_at_last(int data) {
    // Create Node
    Node node = new Node(data);
    size++;
    if (head == null) {
      tail = head = node;
      return;
    }
    // Linking Step
    tail.next = node;
    // Update Tail
    tail = node;
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

  public void print_Link_List() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

  public int remove_first() {
    if (head == null) {
      System.out.println("ll is empty");
      return Integer.MIN_VALUE;
    }

    if (head == tail) {
      int val = head.data;
      System.out.println(" only one node present in ll");
      return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;

  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

  public int remove_last() {
    if (head == null) {
      System.out.println("Nothing is here to remove");
      return Integer.MIN_VALUE;
    }
    if (head == tail) {
      int val = head.data;
      System.out.println("Only one Node is Present");
      head = tail = null;
      size--;
      return val;
    }
    int i = 0;
    Node temp = head;
    while (i < size - 2) {
      temp = temp.next;
      i++;
    }
    int val = temp.next.data;
    temp.next = null;
    tail = temp;
    size--;
    return val;
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++ */

  public static void main(String[] args) {
    Linked_List_Add_Delete_Insert Am = new Linked_List_Add_Delete_Insert();
    Am.add_at_start(10);
    Am.add_at_last(15);
    Am.add_at_last(70);
    Am.add_at_last(19);
    Am.add_at_start(79);
    Am.add_at_start(60);
    Am.add_at_Middle(4, 100);
    Am.remove_first();
    Am.remove_last();

    Am.print_Link_List();
  }
}