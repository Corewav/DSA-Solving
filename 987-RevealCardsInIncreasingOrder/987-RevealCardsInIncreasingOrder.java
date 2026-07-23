// Last updated: 7/23/2026, 9:33:33 AM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int [] res = new int[n];
        Deque<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(i);
        }
        for(int card : deck){
            int idx = q.poll();
            res[idx] = card;
            if(!q.isEmpty()) {
                q.add(q.poll());
            }
        }
        return res;
    }
}