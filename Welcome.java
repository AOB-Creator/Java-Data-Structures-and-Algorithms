import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class Welcome {

    public static void main(String[] args) {
        int[] array = {5,1,2,3,4,6};
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println("AVERAGE of array " + Arrays.toString(array) + " is " + findAverage(array));
        System.out.println("Bitwiser: " + bitwiser());
        System.out.println("Removed duplicates: " + removeDuplicates(array));
        System.out.println("The maximum number of words: " + mostWordsFound(sentences));
        System.out.println(" the number of indices : " + heightChecker(array));


    }

    private static double findAverage(int[] values) {
        double result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return 1.2;
    }

    int a;

    private static void primitives(){
        int x = 5;
        System.out.println("++x: " + ++x);
        System.out.println("x++: " + x++);
        System.out.println("x: " + x);
    }

    private static int bitwiser(){
        int x = 3;
        int y = 8;
        System.out.println("&: "+(x&y));
        System.out.println(x|y);
        System.out.println(~y);
        System.out.println(x^y);
        return x|y;
    }

    private static void workwitharray(){
        int [] arraynumbs = {34,56,776,43,56,76,54,34,23,65,7,8,3,3,6,7,43};
        String [] words = new String[3];
        double [] numbs = new double[]{1.2, 3.4, 54.5};
        float [] flots = {1,2,3,4};
        float [] flots2 = new float[2];
        float [] flots3 = new float[]{1,2,34,4,5,76};
        char[] chars1 = {'s', 'k', 'd'};
        char[] chars2 = new char[2];
        char[] chars3 = new char[]{'a', 's'};
        arraynumbs[0] = 2333;
        arraynumbs[1] += 2;
        ++ arraynumbs[2];
        System.out.println(Arrays.toString(arraynumbs));
//        System.out.println(Arrays.toString(words));
//        System.out.println(Arrays.toString(numbs));
        Arrays.sort(arraynumbs);
//        Arrays.fill(arraynumbs, 2);
        boolean equal = Arrays.equals(chars1, chars2);
        int index  = Arrays.binarySearch(arraynumbs, 34);
        int[] copied = Arrays.copyOf(arraynumbs, 5);
        int[] copiedRange = Arrays.copyOfRange(arraynumbs, 3, 9);
        System.out.println(Arrays.toString(arraynumbs));
        System.out.println(Arrays.toString(copied));
        System.out.println(Arrays.toString(copiedRange));
        System.out.println(equal);
        System.out.println(index);
    }




    public static int removeDuplicates(int [] nums){
        int k = 0;
        int newInd = 0;
        for(int l = 0; l < nums.length; l++){
            int count = 0;
            for(int m = l+1; m < nums.length; m++){
                if(nums[l] == nums[m]){
                    count++;
                }
                if(count>0){
                    k++;
                    break;
                }
            }

            if (count==0){
                nums[newInd] = nums[l];
                newInd++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }


    public static int mostWordsFound(String[] sentences) {
        int MaxWords = Integer.MIN_VALUE;
        for(int k = 0; k < sentences.length; k++){
            int maxWord = 1;
            for(int l = 0; l < sentences[k].length(); l++){
                System.out.println(sentences[k].charAt(l));
                if(sentences[k].charAt(l) == ' '){
                    maxWord++;
                }
            }
            if(maxWord > MaxWords){
                MaxWords = maxWord;
            }

        }
        return MaxWords;
    }


    public static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        int matched = 0;
        for(int k = 0; k < heights.length; k++){
            System.out.println(Arrays.toString(expected) + " - " + Arrays.toString(heights));
            if(heights[k] != expected[k]){
              matched++;
            }
      }
        return matched;
    }

}
