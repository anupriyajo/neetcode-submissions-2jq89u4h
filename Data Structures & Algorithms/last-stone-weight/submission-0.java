class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int x : stones){
            pq.offer(x);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            pq.offer(Math.abs(a-b));
        }
        return pq.size()==0?0: pq.poll();
    }
}
