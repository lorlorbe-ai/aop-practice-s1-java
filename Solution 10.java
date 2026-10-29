public class Solution10 {

    // Практичне завдання з Java №1 (LeetCode 3304. Find the K-th Character in String Game I)
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        
        while (word.length() < k) {
            int currentLength = word.length();
            for (int i = 0; i < currentLength; i++) {
                char nextChar = (char) (word.charAt(i) + 1);
                if (nextChar > 'z') {
                    nextChar = 'a';
                }
                word.append(nextChar);
            }
        }
        
        return word.charAt(k - 1);
    }

    // Практичне завдання з Java №2 (LeetCode 344. Reverse String)
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
