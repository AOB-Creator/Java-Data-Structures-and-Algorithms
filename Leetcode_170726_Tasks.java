import java.util.List;

public class Leetcode_170726_Tasks {
    // Recursion Function
    public static void backtracking(int[] nums, int index){
        if (index == nums.length){
            return;
        }
        // System.out.println(nums[index]);
        backtracking(nums, index+1);
    }

    static void backtrack(int[] nums, int start, List<Integer> current) {
        // Hozirgi holatni chiqaramiz
        System.out.println("Current -> " + current);

        for (int i = start; i < nums.length; i++) {

            // 1. Qo'shish
            current.add(nums[i]);
            System.out.println("Add " + nums[i] + " -> " + current);

            // 2. Chuqurroq borish
            backtrack(nums, i + 1, current);

            // 3. O'chirish (Backtrack)
            current.remove(current.size() - 1);
            System.out.println("Remove -> " + current);
        }
    }

    public static void backtrackPossible(int[] nums, int start, List<Integer> current){
        System.out.println(current);
        for (int i = start; i < nums.length; i++){
            current.add(nums[i]);
            backtrackPossible(nums, i + 1, current);
            current.remove(current.size()-1);
        }
    }

    public static void backtracking2Digit(int[] nums, int start, List<Integer> current){
        if(current.size()==3){
            System.out.println("Double Mix: "+current);
            return;
        }
        for (int i = start; i < nums.length; i++){
            current.add(nums[i]);
            backtracking2Digit(nums, i + 1, current);
            current.remove(current.size()-1);
        }
    }

}
