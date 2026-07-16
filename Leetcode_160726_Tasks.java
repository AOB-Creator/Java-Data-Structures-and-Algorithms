import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_160726_Tasks {
    public int systems(String str, int[] arr){
        return arr.length;
    }

    //    Max Consecutive Ones
    public int findMaxConsecutiveOnes(int[] nums) {
        int numsLength = nums.length;
        ArrayList<Integer> consecutiveCounts = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < numsLength; i++){
            if(nums[i] == 1){
                count++;
            }else{
                consecutiveCounts.add(count);
                count = 0;
            }
        }
        consecutiveCounts.add(count);

        int[] result = new int[consecutiveCounts.size()];
        int resultLength = result.length;
        for (int k = 0; k < resultLength; k++){
            result[k] = consecutiveCounts.get(k);
        }
        Arrays.sort(result);
        return result[resultLength-1];
    }

    // 3289. The Two Sneaky Numbers of Digitville
    public int[] getSneakyNumbers(int[] nums) {
        int sneakyLength = nums.length;
        ArrayList<Integer> sneakyList = new ArrayList<>();

        for(int i = 0; i < sneakyLength; i++){
            int count  = 0;
            for (int k = i+1; k < sneakyLength; k++){
                if(nums[i]==nums[k]){
                    count++;
                }
            }
            if(count > 0){
                sneakyList.add(nums[i]);
            }
        }
        int[] sneakyNums = new int[sneakyList.size()];
        for (int i = 0; i < sneakyList.size(); i++){
            sneakyNums[i] = sneakyList.get(i);
        }

        return sneakyNums;
    }

    //    2574. Left and Right Sum Differences
    public int[] leftRightDifference(int[] nums) {
        int numsLength = nums.length;
        int[] leftItemsSum = new int[numsLength];
        int[] rightItemsSum = new int[numsLength];
        int[] answerItemsSum = new int[numsLength];

        for(int rl = 0; rl < numsLength; rl++){
            int sumItemR = 0;
            for (int ri = rl + 1; ri < numsLength; ri++){
                sumItemR += nums[ri];
            }
            rightItemsSum[rl] = sumItemR;
            int sumItemL =0;
            for (int li = 0; li < rl; li++){
                sumItemL += nums[li];
            }
            leftItemsSum[rl] = sumItemL;
            answerItemsSum[rl] = Math.abs(leftItemsSum[rl] - rightItemsSum[rl]);
        }

        return answerItemsSum;
    }

    // 35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < target){
                index = i + 1;
            }
        }
        return index;
    }

    // 17. Letter Combinations of a Phone Number
    public List<String> letterCombinations(String digits) {
        ArrayList<String> possibility = new ArrayList<>();
        String[] collector = new String[digits.length()];
        String[] keynote = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        for (int i = 0; i < digits.length(); i++){
            int keyNumber = digits.charAt(i) - '0';
            String key = keynote[keyNumber];
            collector[i] = key;
        }
        System.out.println(Arrays.toString(collector));
        return possibility;
    }

}
