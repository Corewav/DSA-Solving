// Last updated: 10/10/2026, 9:57:46 AM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int n = nums1.length;
4        long k = (long)k1 + k2;
5        int arr[] = new int [100001];
6        for(int i=0;i<nums1.length;i++){
7            arr[Math.abs(nums1[i]-nums2[i])]++;
8        }
9        for(int i =100001-1;i>0;i--){
10            if(k<arr[i]){
11                arr[i-1]+=k;
12                arr[i]-=k;
13                break;
14            }
15            else{
16                arr[i-1]+=arr[i];
17                k-=arr[i];
18                arr[i]=0;
19            }
20        }
21        long sum=0;
22        for(int i=1;i<arr.length;i++){
23            long d = i;
24            long freq = arr[i];
25            sum+=d*d*freq;
26        }
27        return sum;
28    }
29}