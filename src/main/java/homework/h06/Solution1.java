import java.util.ArrayList;
import java.util.List;

public class Solution9 

    // Практичне завдання з Java №1 (LeetCode 1512. Number of Good Pairs)
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
