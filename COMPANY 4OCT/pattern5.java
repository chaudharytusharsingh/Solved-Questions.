import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;

public class pattern5 {

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
  public static void hollow_rec(int row, int col) {
    for (int j2 = 0; j2 < row; j2++) {
      for (int k = 0; k < col; k++) {
        if (j2 == 0 || j2 == row - 1 || k == 0 || k == col - 1) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

  public static void reverse_pyramid(int n) {
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

  public static void inverted_half_pyramid(int n) {
    for (int i = 0; i < n; i++) {
      // int h =1;
      for (int j = 1; j <= n - i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

  public static void Floyds_Triangle(int n) {
    int num = 1;
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j < i + 1; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

  public static void zero_one_triangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

  public static void Butterfly(int n) {
    for (int i = 1; i <= n; i++) {
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // space
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // reverse this same pattern
    for (int i = n; i >= 1; i--) {
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // space
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
  public static void Solid_Rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

  public static void hollow_Rhombus(int n) {

    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      // hollow rectangle
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
public static void Diamond_Pattern(int n ) {
  for (int i = 1; i <= n ; i++) {
  //spaces
  for (int j = 1; j <= n-i; j++) {
    System.out.print(" ");
  }
  //stars
  for (int j = 1; j <= (2*i)-1; j++) {
    System.out.print("*");
  }
  System.out.println();
  }
  //reverse
  for (int i = n; i >= 1 ; i--) {
  //spaces
  for (int j = 1; j <= n-i; j++) {
    System.out.print(" ");
  }
  //stars
  for (int j = 1; j <= (2*i)-1; j++) {
    System.out.print("*");
  }
  System.out.println();
  }
}


  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
  public static void right_triangle(int n) {
     for (int i = 0; i < n; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }}

  /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

     public static void reverse_right_triagle(int n ) {
    for (int i = 0; i <  n; i++) {
      for (int j = n-i; j >=0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
 public static void right_triangle_alphabet_increasing_order(int n ) {
    
    char ch ='A';
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print(ch+" ");
        ch++;
      }
      System.out.println();
    }
  }


 public static void right_triangle_counting_increasing_order(int  n) {
    
  int num = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= i+1; j++) {
        System.out.print(num+" ");
      num++;
      }
      System.out.println();
    }
  }


  public static void main(String[] args) {
    // hollow_rec(4, 5);
    // reverse_pyramid(4);
    // inverted_half_pyramid(5);
    // Floyds_Triangle(5);
    // zero_one_triangle(5);
    // Butterfly(4);
    // Solid_Rhombus(5);
    // hollow_Rhombus(5);
    //Diamond_Pattern( 4);
    //right_triangle(4);
  //  reverse_right_triagle(4);
  //right_triangle_alphabet_increasing_order(4);
      right_triangle_counting_increasing_order(4);

  }
}