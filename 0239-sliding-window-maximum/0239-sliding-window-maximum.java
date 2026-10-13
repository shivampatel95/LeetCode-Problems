import java.util.*;
class Solution {
public int[] maxSlidingWindow(int[] nums, int k) {
int n = nums.length;
if (n == 0 || k <= 0 || k > n) { return new int[0];
}
int[] answer = new int[n - k + 1];
Deque<Integer> deque = new ArrayDeque<>();
for (int i = 0; i < n; i++) {
// Remove indices outside current window
while (!deque.isEmpty()
&& deque.peekFirst() <= i - k) {
deque.pollFirst();
}
// Remove smaller or equal values
while (!deque.isEmpty()
&& nums[deque.peekLast()] <= nums[i]) {
deque.pollLast();
}
// Add current index
deque.offerLast(i);
// Store maximum once first full window exists
if (i >= k - 1) {
answer[i - k + 1] = nums[deque.peekFirst()];
}
}
return answer;
}
}