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
    class IntegerAscendingComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval val1,Interval val2) {
        return val1.end-val2.end;
    }
    }

    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.isEmpty()){
            return true;
        }
        Collections.sort(intervals,new IntegerAscendingComparator());
        int lastEnd = intervals.get(0).end;

        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start < lastEnd){
                return false;
            }else{
                lastEnd = intervals.get(i).end;
            }
        }
        return true;
    }
}
