import java.util.*;

class Solution {
    public int scheduleCourse(int[][] courses) {

        Arrays.sort(courses, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());

        int totalTime = 0;

        for (int[] course : courses) {
            int duration = course[0];
            int deadline = course[1];

            totalTime += duration;
            pq.add(duration);

            if (totalTime > deadline) {
                totalTime -= pq.poll();
            }
        }

        return pq.size();
    }
}