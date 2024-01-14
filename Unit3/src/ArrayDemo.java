import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[]args){
        int[] a = {1,2,3};
        String s = "helloworld";
        String x = "spot";
        String y = "stop";
        String x1 = "Banana";
        String y1 = "Nab";
        
        System.out.println(Arrays.toString(letterHist(s)));
        System.out.println(isAnagram(x, y));
        System.out.println(canSpell(x1, y1));
        
     
    }
    public static void modifer(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i]= Math.abs(a[i]);
        }
    }
    public static int[] functional(int[] a){
        
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    return b;
    }
    public static int[] letterHist(String s){ //7.7
        int [] counts = new int[26];
        String lower = s.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
        char letter = lower.charAt(i);
        // int index = 0;
        int index = (int) letter - 'a';
        counts[index]++;
        
        }
     return counts;
    }
    public static boolean isAnagram(String x, String y){ //7.8
        int[] arrX = letterHist(x);
        int[] arrY = letterHist(y);
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] == arrY[i]) {
            return true;
        }
    }
       return false;
    
    }
    public static boolean canSpell (String x, String y){ //6.6
        int[] arrX = letterHist(x);
        int[] arrY = letterHist(y);
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] < arrY[i]) {
            return true;
        }
    }
       return false;
    
    }
}

    

