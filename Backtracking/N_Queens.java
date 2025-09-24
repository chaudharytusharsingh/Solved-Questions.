//     N Queens Problem
public class N_Queens {
  static int count =0;
  public static void n_queen(char chess_board[][] , int row) {
    if (row  == chess_board.length) {
      print_board(chess_board);
      return;
    }
    for (int j = 0; j < chess_board.length; j++) {
      //is safe call
      if (is_safe(chess_board, row, j)) {
      chess_board[row][j] =  'Q';
      n_queen(chess_board, row+1);
      chess_board[row][j] ='x';
    } 
   }
  }

  //Is_Safe check
  public static boolean is_safe(char chess_board[][] , int row , int column) {
    //verical up
    for (int i = row-1; i >= 0 ; i--) {
      if (chess_board[i][column] == 'Q') {
        return false;
      }
    }
    //diagonal up right 
    for (int i=row-1, j=column+1 ;  i>=0 && j<chess_board.length;  i--,j++) {
      if (chess_board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonal up left
    for (int i=row-1,j=column-1;  i>=0 && j>=0;  i--,j--) {
      if (chess_board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  //print_board
  public static void print_board(char chess_board[][]) {
    count ++;
    System.out.println("No. of Solutions are  :"+count);
    System.out.println("<------>");
    for (int i = 0; i < chess_board.length; i++) {
      for (int j = 0; j < chess_board.length; j++) {
        System.out.print(chess_board[i][j]+" ");
      }
          System.out.println();
    }

  }

  public static void main(String[] args) {
    int n = 4;
    char chess_board[][] = new char[n][n];
    //initialize that chess board
    for (int i = 0; i < chess_board.length; i++) {
      for (int j = 0; j < chess_board.length; j++) {
        chess_board[i][j] = 'x'; 
      }
    }
    //first call to the chess board
   n_queen(chess_board, 0);
  }
}

