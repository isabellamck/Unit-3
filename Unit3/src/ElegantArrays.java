import java.util.Arrays;

public class ElegantArrays {
    public static void main (String []args){
        boolean [] yesNo = {true, true, true, true, false, false, false, false, false};
        System.out.println((majority(yesNo)));

        double [] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(minMeanMax(values)));

        int [] zeroToNine = {1, 2, 2, 2, 5, 6, 6, 7, 8, 9, 9, 9, 9, 9, 9};
        System.out.println(mode(zeroToNine));
        
    }
    public static int majority(boolean [] yesNo){ 
        int yesCount = 0;
        for (int i = 0; i < yesNo.length; i++) {
          if (yesNo[i]){
            yesCount++;
        }
    }
    int difference = (yesCount - (yesNo.length - yesCount));
    return difference;
}
    public static double [] minMeanMax (double []values){
        double min = values[0];
        double mean = values[0];
        double max = values[0];
        double total = 0;
        for (int i = 0; i < values.length; i++){
            total = total + values[i];  
            if (i < min) {
                min = values[i]; 
            if (i > max) {
                max = values[i];
                }
            }
        }
        mean = total/ values.length; 
        double[] result = {min , mean , max};
        return result;
    }
    public static int mode (int [] zeroToNine){
        int [] bins = new int[10];
        int max = bins[0];
        for (int i = 0; i < zeroToNine.length; i++) {
            int count = zeroToNine[i];
            int index = count - 0;
            bins[index]++;
        }
        for (int i = 0; i < bins.length; i++) {
            if (bins[i] > bins[0]){
                max = i;
            }   
        }
        return max;
    }
}

