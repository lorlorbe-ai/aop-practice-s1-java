public class Solution6 {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        if (num == Integer.MAX_VALUE) mask = -1;
        return num ^ mask;
    }
}
