import java.util.*;
class Solution {
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
Stack<Integer> stack = new Stack<>();
HashMap<Integer, Integer> map = new HashMap<>();
for (int num : nums2) {
while (!stack.isEmpty()
&& stack.peek() < num) {
int smaller = stack.pop();
map.put(smaller, num);
}
stack.push(num);
}
// Remaining elements have no greater element
while (!stack.isEmpty()) {
map.put(stack.pop(), -1);
}
int[] answer = new int[nums1.length];
for (int i = 0; i < nums1.length; i++) {
answer[i] = map.get(nums1[i]);
}
return answer;
}
}