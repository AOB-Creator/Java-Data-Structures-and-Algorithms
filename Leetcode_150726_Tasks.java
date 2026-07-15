import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_150726_Tasks {
    // 3668. Restore Finishing Order
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int ord = 0; ord < order.length; ord++){
            for (int frs = 0; frs < friends.length; frs++){
                if(order[ord] == friends[frs]){
                    numbers.add(friends[frs]);
                }
            }
        }
        int [] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++){
            result[i] = numbers.get(i);
        }
        return result;
    }

    // 1920. Build Array from Permutation
    public int[] buildArray(int[] nums) {
        int arrayLength = nums.length;
        int[] ans = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    // 2011. Final Value of Variable After Performing Operations
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++){
            switch (operations[i]){
                case "++X": ++x; break;
                case "X++": x++; break;
                case "--X": --x; break;
                case "X--": x--; break;
                default: break;
            }
        }
        return x;
    }
    // 3838. Weighted Word Mapping
    public String mapWordWeights(String[] words, int[] weights) {
        int wordsLength = words.length;
        String result = new String("");
        for(int i = 0; i < wordsLength; i++){
            int sumOfCharIndex = 0;
            for(int each = 0; each<words[i].length(); each++){
                int orderSimbol = words[i].charAt(each) - 'a' + 1;
                sumOfCharIndex += weights[orderSimbol-1];
            }
            sumOfCharIndex %= 26;
            char letter = (char) ('a' + 26 - sumOfCharIndex - 1);
            result += letter;
        }
        return result;
    }

    // 3701. Compute Alternating Sum
    public int alternatingSum(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                count += nums[i];
            }else{
                count -= nums[i];
            }
        }
        return count;
    }

    // 1929. Concatenation of Array
    public int[] getConcatenation(int[] nums) {
        int numLength = nums.length;
        int[] ansConcatNums = new int[2 * numLength];
        for (int i = 0; i < numLength; i++){
            ansConcatNums[i] = nums[i];
            ansConcatNums[2*numLength - 1 - i] = nums[numLength - i - 1];
        }
        return ansConcatNums;
    }

    // 3467. Transform Array by Parity
    public int[] transformArray(int[] nums) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }else{
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }

    // 1769. Minimum Number of Operations to Move All Balls to Each Box
    public int[] minOperations(String boxes) {
        int [] outputs = new int[boxes.length()];
        int numberOfBoxes = boxes.length();

        for (int move = 0; move < numberOfBoxes; move++){
            int moveCount = 0;
            for(int fromBox = 0; fromBox < numberOfBoxes; fromBox++){
                if(boxes.charAt(fromBox) != '0'){
                    moveCount += Math.abs(fromBox - move);
                }
            }
            outputs[move] = moveCount;
        }

        return outputs;
    }

    //  2974. Minimum Number Game
    public int[] numberGame(int[] nums) {
        int numsLength = nums.length;
        Arrays.sort(nums);
        int[] answers = new int[numsLength];
        for (int k = 0; k < numsLength; k+=2){
            answers[k]= nums[k+1];
            answers[k+1] = nums[k];
        }
        return answers;
    }

    // 3512. Minimum Operations to Make Array Sum Divisible by K
    public int minOperations(int[] nums, int k) {
        int sumAll = 0, remaining = 0;
        for(int num: nums){
            sumAll += num;
        }
        remaining = sumAll % k;
        return remaining;
    }



}
