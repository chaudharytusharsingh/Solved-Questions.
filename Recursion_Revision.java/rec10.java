public class rec10 {
  public static void toh(int disks , String a ,String b ,String c)  {
    if (disks == 1) {
      System.out.println("Disk "+ disks + " move from " + a + " <- to ->"+ c );
      return;
    }
    toh(disks-1, a, c, b);
    System.out.println("Disk "+ disks +" move from " + a + " <- to ->"+ c );
    toh(disks-1,  b, a, c);
  }
  public static void main(String[] args) {
    int disks =2;
    toh(disks, "A", "B", "C");
  }
}
