// Last updated: 8/20/2026, 6:45:13 PM
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int left = 1, right = n;
13        while(left < right){
14            int mid = left + (right - left)/2;
15            int val = guess(mid);
16            if(val == 0){
17                return mid;
18            }else if(val == -1){
19                right = mid;
20            }else{
21                left = mid + 1;
22            }
23        }
24        return left;
25    }
26}