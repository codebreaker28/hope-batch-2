class Solution {
    public int minCostToMoveChips(int[] position) {
        int ecount=0;
        int ocount=0;
        for(int i:position){
            if(i%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        return Math.min(ecount,ocount);
    }
}
