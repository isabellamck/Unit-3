public class Array2DAssignment {
    public static void main(String[] args) {
       String[][] og = createArray(10, 10);
      
        char[][] board = {{'O', 'O' , 'X'},
                          {' ', 'X' , 'X'}, 
                          {'X', ' ' , 'O'}};
        
       System.out.println(isWinner(board)); 
    }
    public static String[][] createArray(int row, int col){
        
        String[][] arr2d = new String[row][col];
        for (int r = 0; r < arr2d.length; r++) {
            for (int c = 0; c < arr2d[r].length; c++) {
                arr2d[r][c] = "Row" + r + "Column" + c; 
        }
    }
        return arr2d;
    }
    public static void arrayPortion(String[][] startingArray, int startR, int endR, int startC, int endC){
        
        String[][] newArr = new String[endR - startR][endC - startC];
         for (int r = startR; r < endR; r++) {
            for (int c = startC; c < startingArray[endC].length; c++) {
                startingArray[r][c] = newArr[r + startR][c + startC];
                System.out.println(newArr);
            }
        }
       System.out.println();
    //public  static int sum(String[][] arr2d){
       // String sum = 0;
       // for (int r = 0; r < arr2d.length; r++) {
           // sum += arr2d[r][columnI];
           // }
           // return sum;
            //visits every row in a specified column
    }
    public static void ticTacToe(){
        char[][] board = {{'O', 'O' , 'X'},
                          {' ', 'X' , 'X'}, 
                          {'X', ' ' , 'O'}};
    }
    public static boolean isValid(char[][] arr){
        for (int r = 0; r < arr.length; r++) {
           if (r != 'X' || r != 'O'){
            return false;
            }
        for (int c = 0; c < arr[r].length; c++) {
            if (c != 'X' || c != 'O'){
                return false;
            }
        }
    }
     return true;
    }
    public static char isWinner(char[][] arr){

        for (int r = 0; r < arr[0].length; r++) {
            if ('X' == arr[r][0] && 'X' == arr[r][1] && 'X'== arr[r][2]){
                return 'X';
            } if('O' == arr[r][0]){   
                return 'X';
            }
        }
        for (int c = 0; c < arr.length; c++){
            if ('O' == arr[0][c] && 'O' == arr[1][c] && 'O' == arr[3][c]){
                return 'O';
            }
            if('O' == arr[0][c]){
            return 'O';
            }
        }
        if ('X' == arr[0][0] && 'X' == arr[1][1] && 'X' == arr[2][2]){
            return 'X';
        }
        if ('O' == arr[0][0] && 'O' == arr[1][1] && 'O' == arr[2][2]){
            return 'O';
        } 
        if ('X' == arr[0][2] && 'X' == arr[1][1] && 'X' == arr[2][0]){
            return 'X';
        }
        if ('O' == arr[0][2] && 'O' == arr[1][1] && 'O' == arr[2][0]){
            return 'O'; 
    }
       return ' '; 
    }
}
