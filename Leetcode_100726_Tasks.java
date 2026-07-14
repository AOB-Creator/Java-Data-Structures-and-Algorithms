import java.util.ArrayList;
import java.util.List;

public class Leetcode_100726_Tasks {

    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < pivot){
                result[index] = nums[i];
                index++;
            }
        }

        for (int k = 0; k < nums.length; k++){
            if (nums[k] == pivot){
                result[index] = nums[k];
                index++;
            }
        }

        for (int l = 0; l < nums.length; l++){
            if (nums[l] > pivot){
                result[index] = nums[l];
                index++;
            }
        }

        return result;
    }

    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] decompression = new int[size];
        for(int i = 0; i < nums.length; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            for (int k = 0; k < freq; k++){
                decompression[index++] = val;
            }
        }
        return decompression;
    }


    public int countDigitOccurrences(int[] nums, int digit) {
        int howmany = 0;
        char currentDigit = Character.forDigit(digit, 10);

        for (int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            String currentText = String.valueOf(currentNum);
            for(char k : currentText.toCharArray()){
                if(currentDigit == k){
                    howmany++;
                }
            }
        }

        return howmany;
    }

    public int[] concatWithReverse(int[] nums) {
        int length = nums.length;
        int[] reversedArray = new int[2 * length];
        for (int  k = 0; k < length; k++){
            reversedArray[k] = nums[k];
        }

        for (int i = length; i < 2 * length; i++){
            reversedArray[i] = nums[2*length - i - 1];
        }

        return reversedArray;
    }








}
