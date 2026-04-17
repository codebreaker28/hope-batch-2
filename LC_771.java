class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jlen = jewels.length();
        int slen = stones.length();
        int count = 0;

        for (int i = 0; i < jlen; i++) {
            for (int j = 0; j < slen; j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
