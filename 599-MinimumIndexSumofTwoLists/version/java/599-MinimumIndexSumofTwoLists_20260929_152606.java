// Last updated: 9/29/2026, 3:26:06 PM
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        HashMap<String,Integer> m1=new HashMap<>();
4        ArrayList<String> l1=new ArrayList<>();
5        for(int i=0;i<list1.length;i++){
6            m1.put(list1[i],i);
7        }
8        int min_val=Integer.MAX_VALUE;
9        for(int i=0;i<list2.length;i++){
10            if(m1.containsKey(list2[i])){
11                int sum=i+m1.get(list2[i]);
12                if(sum<min_val){
13                    min_val=sum;
14                    l1.clear();
15                    l1.add(list2[i]);
16                }
17                else if(sum==min_val){
18                    l1.add(list2[i]);
19                }
20            }
21        }
22        return l1.toArray(new String[0]);
23    }
24}