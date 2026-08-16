// Last updated: 8/16/2026, 9:00:26 AM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int left = 1;
7        int right = n;
8        while(left <= right){
9            int mid = left + (right -left)/2;
10            if(isBadVersion(mid))right = mid-1;
11            else left =mid+1;
12        }
13        return left;
14    }
15}