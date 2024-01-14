import java.util.Arrays;

public class RedoWorkTESTMETHOD {
    public static void main(String[] args) {
        
      
      System.out.println(finedAmount( 12, 4));
      
      
      
     // String a = "supercalifragilisticexpialidocious";
       // char[] arr = a.toCharArray();
       //int loopVal = -4;
        //for (int i = 0; i < arr.length; i++) {
           ///  loopVal++;
           // while(loopVal < arr.length){
           
            //  System.out.println(arr[i]);
           }     
     public static int finedAmount( int speedOverLimit, int hour){
        int fine = 0;
        if (speedOverLimit < 9 && hour <= 24 && hour > -1){
            fine = 0;
        }
        if (speedOverLimit >=10 && speedOverLimit < 25 && hour >= 23 || hour <= 4 && !(hour >= 24)){
            fine = 5000;
        }
        if (speedOverLimit >=10 && speedOverLimit < 25 && hour > 4 && hour <= 22){
            fine = 2500;
        }
        if (speedOverLimit >= 25){
            fine = 10000;
        }
        return fine;
      }
    }

