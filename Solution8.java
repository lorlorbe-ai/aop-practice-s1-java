import java.util.List;

public class Solution8 {

    // Практичне завдання з Java №1 (LeetCode 485. Max Consecutive Ones)
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        
        return maxCount;
    }

    // Практичне завдання з Java №2 (LeetCode 2824. Count Pairs Whose Sum is Less than Target)
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
