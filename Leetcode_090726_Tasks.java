import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Leetcode_090726_Tasks {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>(List.of());
        for(int start = left; start<=right; start++){
            boolean isSelfDividing = true;
            String numText = Integer.toString(start);
            for(int k = 0; k < numText.length(); k++){
                if(numText.charAt(k) == '0'){
                    isSelfDividing = false;
                    break;
                }else{
                    if(start % (numText.charAt(k) - '0') != 0){
                        isSelfDividing = false;
                        break;
                    }

                }
            }
            if (isSelfDividing){
                numbers.add(start);
            }
        }
        return numbers;
    }


    public int subtractProductAndSum(int n) {
        int productOD = 1;
        int sumOD = 0;
        String stgNum = Integer.toString(n);
        for(int k = 0; k < stgNum.length(); k++){
            productOD *= (stgNum.charAt(k)-'0');
            sumOD += (stgNum.charAt(k)-'0');
        }

        return productOD - sumOD;
    }


    public int maximum69Number (int num) {
        String strNum = Integer.toString(num);

        StringBuilder sb = new StringBuilder(strNum);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }


    public int[] sortArray(int[] nums) {
        int[] sorted = new int[nums.length];
        for (int k = 0; k < nums.length; k++){
            int minItem = nums[k];
            for (int l =k+1; l < nums.length; l++){
                int vase = Integer.MAX_VALUE;
                if(minItem > nums[l]){
                    minItem = nums[l];
                    vase = nums[l];
                    nums[l] = nums[k];
                    nums[k] = vase;
                }
            }
            sorted[k] = minItem;
            System.out.println(Arrays.toString(sorted));
        }
        return sorted;
    }


    public int lengthOfLastWord(String s) {
        int start = 0;
        int ends = 0;
        for (int k = s.length()-1; k >= 0; k--){
            System.out.println(s.charAt(k));
            if(s.charAt(k) != ' '){
                start = k;
                if (s.charAt(k+1) == ' '){
                    ends = k;
                    break;
                }
            }
        }
        System.out.println(start +" "+ ends);
        return 2;
    }


    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                System.out.println(i + " < " + j);
                if (nums[i] == nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int goodTriplets = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (Math.abs(arr[i] - arr[j]) > a) {
                    continue;
                }
                for (int k = j+1; k<arr.length; k++){
                    if( Math.abs(arr[j]-arr[k])<= b && Math.abs(arr[i]-arr[k])<= c){
                        goodTriplets++;
                    }
                }
            }
        }
        return goodTriplets;
    }

    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[n*2];
        int index = 0;
        for(int i = 0; i < n; i++){
            shuffled[index++] = nums[i];
            shuffled[index++] = nums[n+i];
        }
        return shuffled;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] outputs = new int[nums.length];
        for(int k = 0; k < nums.length; k++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[k] > nums[i] && k != i) {
                    count++;
                }
            }
            outputs[k] = count;
        }
        return outputs;
    }

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        String[] wordsMorse = new String[words.length];

        for(int i = 0; i < words.length; i++){
            String morseTransalted = "";
            for(int ch = 0; ch<words[i].length(); ch++){
                morseTransalted += morse[words[i].charAt(ch) - 'a'];
            }
            wordsMorse[i] = morseTransalted;
            set.add(morseTransalted);
        }
        return set.size();
    }

    public int diagonalSum(int[][] mat) {
        int sumOfMatrix = 0;
        int middleIndex = Math.round( mat.length / 2 );

        for(int i = 0; i < mat.length; i++){
            sumOfMatrix += mat[i][i];
            sumOfMatrix += mat[i][mat.length-i-1];
        }
        if (mat.length%2 != 0){
            sumOfMatrix -= mat[middleIndex][middleIndex];
        }
        return sumOfMatrix;
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            boolean isExist = false;
            for (int k = 0; k < words[i].length(); k++){
                if(words[i].charAt(k) == x){
                    isExist = true;
                }
            }
            if (isExist){
                numbers.add(i);
            }
        }
        return  numbers;
    }

    public int minimumOperations(int[] nums) {
        int operationNum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 3 != 0){
                operationNum++;
            }
        }
        return operationNum;
    }
}
