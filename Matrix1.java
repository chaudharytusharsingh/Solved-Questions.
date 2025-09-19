public class Matrix1 {

    //search element in sorted matrix

    public static void search(int matrix[][],int key) {
        int row = 3;   int column = 0;
        while (row>=0 && column<=3) {
            if (matrix[row][column] ==key) {
                System.out.println(matrix[row][column]+"Finally found at  [" + row + " ,"+ column +"]" );
                break;
            }
            else if (matrix[row][column] > key) {
                row--;
            }
            else if (matrix[row][column] < key) {
                column++; 
            }
            else{
                System.out.println("key not found");
            }
            
        }
    }
public static void main(String[] args) {
    int matrix[][] ={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};

 int key = 50;
 search(matrix, key);
   
    
}
}