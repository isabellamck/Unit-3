import java.util.Random;

public class Array2DMethods {
    public static void main(String[] args) {
        int[][] a = new int[4][6]; // rows then columns
        a[0][0] = 15;
        a[3][5] = 31;
        a[1][4] = 12;
        //print2DArray(a);
        int[][] b = createRandomArray(3, 10);
        print2D(b);
        System.out.println(sum(b, 0));
     }
    public static void print2DArray(int[][] arr) { // nested loop to traverse 2D array
        for (int r = 0; r < arr.length; r++) { // r is for row
            for (int c = 0; c < arr[r].length; c++) { // c is for column
                System.out.print(arr[r][c] + "   ");
            }
            System.out.println(); // prints a line return at the end of every row
        }
    }
     public static void print2D(int[][] arr) { 
        for (int [] row : arr) { // take each row from from the array
            for (int val : row) { // .... and then take each value from the row
                System.out.print(val + "   ");
            }
            System.out.println(); 
        }
    }
    /**
     * Creates a 2D int array of size rowx coland fills it with random numbers
     *  from 0 to 99
     * 
     * @param row the number of rows
     * @param col the number of columns
     * @return and int[][] array the size rox x col filled with randomnumber from 
     * 0 to 99  */
    public static int[][] createRandomArray(int row, int col){
        final int RANGE= 100;
        int[][] arr2d = new int[row][col];
        for (int r = 0; r < arr2d.length; r++) {
            for (int c = 0; c < arr2d[r].length; c++) {
             arr2d[r][c] = (int)(Math.random() * RANGE);   
            }
        }
        return arr2d;
    }
    /**
     * Recieves a 2darray and column index and return
     * the sumof that column
     * 
     *@param arr a 2d int array
     *@param col the columnto sum
     *@return the sum all elements in a specificed column
     */
    public  static int sum(int[][] arr2d, int columnI){
        int sum = 0;
        for (int r = 0; r < arr2d.length; r++) {
            sum += arr2d[r][columnI];
            }
            return sum;
            //visits every row in a specified column
    }
    /**
     * Search an array in column order for the first occurence 
     * ofa targets value
     */
    public static int[] columnOrder(int [][] arr2d, int target){
        for (int c = 0; c < arr2d[0].length; c++){
            for (int r = 0; r < arr2d.length; r++) {
                if(arr2d[r][c] == target){
                    return new int[]{r,c};
                }
            }
        }
        return null;
    }
    public static String[][] createArraySection(String[][] arr2d, int startR, int endR, int startC, int endC){
        String[][] section = new String[endR - startR][endC - startC];
        for (int r = startR; r < endR; r++) {
            for (int c = startC; c < endC; c++) {
                section[r - startR][c - startC] = arr2d[r][c];
            }
        }
        return section;
    }
    public static boolean isValid(char[][] arr){
        int diff = 0;
        for(char[] row : arr){
            for(char thisChar: row){
                if (thisChar == 'X'){
                    diff++;
                } else if (thisChar == 'O'){
                    diff--;
                }else if (thisChar != ' '){
                    return false;
                } 
            } 
     }
    return Math.abs(diff) > 1;  
}
}

