import java.util.Arrays;

public class BirthdayParadox {
    public static void main(String[] args) {
        int n = 23; 
        double percent = percentTwoBday();
        System.out.println(percent);
    }
    public static int[] birthday(int n) {
        final int NUM_DAYS = 365;
        int[] randomBday = new int[n];
        for (int i = 0; i < randomBday.length; i++) {
            randomBday[i] = (int) (Math.random() * NUM_DAYS);
        }
        return randomBday;
    }
    public static int[] hist( int[] birthday){
        final int NUM_DAYS = 365;
        int [] bins = new int[NUM_DAYS];
        for (int i = 0; i < birthday.length; i++) {
            int index = birthday[i];
            bins[index]++;
        }
        return bins;
    }
    public static boolean isTwoBday(int [] hist) {

        for (int i = 0; i < hist.length; i++) {
            if (hist[i] > 1){
                return true;
            }
        }
        return false;
    }
    public static double percentTwoBday() {
    //fix
        double range = 100001;
        double trueCount = 0;
        double percent = 0;
        for (int i = 0; i < range ; i++) {
            int[] group = birthday(23);
            int[] groupHist = hist(group);
            if(isTwoBday(groupHist)){
                trueCount++;
            }
        }
        percent = (trueCount / range);
        return percent;
    }

}
