class Solution {
    class IntegerAscendingComparator implements Comparator<int []> {
    @Override
    public int compare(int[] val1,int[] val2) {
        return val1[1]-val2[1];
    }
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new IntegerAscendingComparator());
        int count=1;
        int lastEnd = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] >= lastEnd){
                count++;
                lastEnd = intervals[i][1];
            }
        }
        return intervals.length-count;

    }
}
