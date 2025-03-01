package com.Easy;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = intervals.length;

        // Correct sorting syntax
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) { // Select an interval
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Skip all the merged intervals
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            // Check the rest of the intervals
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }

        // Convert List<List<Integer>> to int[][]
        int[][] merged = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            merged[i][0] = ans.get(i).get(0);
            merged[i][1] = ans.get(i).get(1);
        }
        return merged;
    }

    public static void main(String[] args) {
        MergeIntervals obj = new MergeIntervals();

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] result = obj.merge(intervals);

        // Print merged intervals
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
