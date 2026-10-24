public class Solution10 {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-A0-9]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
