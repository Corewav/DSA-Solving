# Last updated: 10/11/2026, 5:09:16 PM
1class Solution:
2    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
3        max_count = 0
4        current_count=0
5        for num in nums:
6            if num == 1:
7                current_count = current_count +1
8                max_count = max(max_count, current_count)
9            else:
10                current_count=0
11        return max_count
12        