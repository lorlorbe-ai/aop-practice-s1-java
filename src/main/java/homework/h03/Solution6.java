public class Solution5 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
