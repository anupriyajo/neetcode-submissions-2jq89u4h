/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int l = intervals.size();
        int [] start = new int[l];
        int [] end = new int[l];
        for(int i=0;i< l;i++){
            start[i]= intervals.get(i).start;
            end[i]= intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int res=0,s=0,e=0,count=0;
        while(s<l){
            if(start[s]<end[e]){
                count++;
                s++;
            }else{
                e++;
                count--;
            }
            res= Math.max(res,count);
        }
        return res;
    }
}
