// Last updated: 9/19/2026, 7:51:22 PM
1class Solution {
2    public boolean checkOverlap(int r, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
3        int nx=Math.max(x1,Math.min(x2,xCenter));
4        int ny=Math.max(y1,Math.min(y2,yCenter));
5        int dx=xCenter-nx;
6        int dy=yCenter-ny;
7        return (dx*dx+dy*dy)<=r*r;
8
9    }
10}