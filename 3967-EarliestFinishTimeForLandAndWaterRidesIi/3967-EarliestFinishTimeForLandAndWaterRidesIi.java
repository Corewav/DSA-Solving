// Last updated: 7/23/2026, 9:31:56 AM
class Solution {
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {
        int ml = Integer.MAX_VALUE;
        int mw = Integer.MAX_VALUE;

        for(int i = 0; i < ls.length;i++){
            ml = Math.min(ml, ls[i] + ld[i]);
        }
        for( int i = 0; i < ws.length;i++){
            mw = Math.min(mw,ws[i] + wd[i]);
        }
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < ws.length; i++){
            res = Math.min(res, Math.max(ml, ws[i]) + wd[i]);
        }
        for(int i =0; i <ls.length;i++){
            res = Math.min(res, Math.max(mw, ls[i]) + ld[i]);
        }
        return res;
    }
}