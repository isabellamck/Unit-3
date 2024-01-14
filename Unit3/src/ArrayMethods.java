import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        //int[] a = { 4, 7, 18, -1, 7 };
        int[] a = { 1, 2, 3, 4, 5};
        String s = "";
        int[] gradeHistogram = makeHistogram(s);
        System.out.println(Arrays.toString(gradeHistogram));
        System.out.println(isInOrder(a));

        for (int i : a) {
            System.out.print(i);
        }
        System.out.println(indexOf(a, 7));

    }

    public static void printArray(int[] a) {
        // the for: each loop is a nice shortcut
        // of you don't need to modify or see the index of an array
        for (int val : a) {
            System.err.println(val);
        }
    }

    public static int findMax(int[] a) {

        int remember = a[0];
        for (int val : a) {
            if (val > remember) {
                remember = val;
            }
        }
        return remember;
    }

    public static int indexOfMax(int[] a) {
        int index = 0;
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Returns the first occurence of a target item in an array
     * or -1 if the target is not in the array
     * 
     * @param arr    the array to be searched
     * @param target the value to search for
     * @return an in with the index of the first occurence of the target or -1 if
     *         not found
     */
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                return i;
            }
        }
        return -1;
    }

    // finds the last occurence in a not so efficient way
    public static int lastindexOf(int[] arr, int target) {
        int loc = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                loc = 1;
                return loc;
            }
        }
        return loc;
    }

    public static int[] makeHistogram(String s) {

        final int NUM_BINS = 26;
        int[] hist = new int[NUM_BINS];
        for (int i = 0; i < s.length(); i++) {
            // calculated which bin to put data[i] into
            int bin = hist[i] / 10;
            // increase the count in that bin by 1
            hist[bin]++;

        }
        return hist;
    }

    public static void examples(String s) {
        char[] letters = s.toCharArray();
        int x = letters[0];

    }
    public static boolean isInOrder(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static int findIndexFromEnd(int[] arr, int target){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == target){
                return i;
            }
            
        }
        return -1;
    }
    public static double[] downsample(double[] arr){
        
        int length = (arr.length)/2;
        double[] halfSize = new double[length];
        for (int i = 0; i < arr.length - 1; i+=2) {
            halfSize[i/2] = (arr[i] + arr[i+1])/2;        
        
        }
        return halfSize;
    }
}
