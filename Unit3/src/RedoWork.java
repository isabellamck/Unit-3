public class RedoWork {
    public static void main (String[] args){
    
    }
    //public static void followMe (int f1){ // infinite loop
       
        //while (f1 > 0){
           // f1--; 
          //  if (f1 % 2 == 0){
             //   f1 = f1 + 2; 
          //  }
            //if ( f1 % 3 == 0){
              //  f1/=3;
            //}
            
        //}
    //}
    //public static void valOfArr(int []arrA){
        //int val = 0; 
       // for (int i = 0; i < arrA.length; i++) { //returns the index of an array if at index 2 its not 2
           // if (arrA[i] == 2 & i != 2) {
               // val = i;
           // } else{
              //  val = -1;
           // }
       // }
       // System.out.println(val);
   // }
    public static void interestValue(){ 
        
        double startingVal = 0;
        double endingVal = 0;
        int i = 0; 
        while (startingVal <= endingVal){
          startingVal *= 1.5;
            i++;
        }
       System.out.println(i);
    

 //   public static boolean[] ladybugFakeVsReal(int [] bugArr){
// real or fake ladybug if it has a odd num of spots, less thn 3 spots, or 14+ spots its fake
        //boolean[] fakeRealCount = new boolean[bugArr.length];
       // for (int i = 0; i < bugArr.length; i++) {
           // if (bugArr[i]%2 != 0){
                //fakeRealCount[i] = false;
           // }
            //if(bugArr[i] < 3){
                //fakeRealCount[i] = false;
           // }
           // if(bugArr[i] >= 14){
                //fakeRealCount[i] = false;
           // }
       // } 
       // return fakeRealCount;
   // }
 //public static void isOfheight(int inches){
   // boolean height; 
   // if (inches%12 <=5){
       // height = false;

  //  } else if (inches%12 <= 9){

 //   }

 
   // public static void isANamePhone(){
        // char[] letters= { 'A' , 'C' , 'M' , 'L', 'X', 'A', 'Y'};
        //for (int i = 0; i < letters.length; i++) {
            //if ( letters[i] - 97 > 0){
                //System.out.println(letters[i]);
          //  }
          
        //}
    //}
    }
    public static void nestFor(){
        String a = "hello";
        char[] arr = a.toCharArray();
        int loopVal = 4;
        for (int i = 0; i < arr.length; i++) {
            while( loopVal < arr[arr.length -1]){
                System.out.println(i);
            }  
        }
    }
}
