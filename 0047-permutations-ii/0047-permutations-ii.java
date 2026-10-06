class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];

        backtrack(nums, visited, new ArrayList<>(), result);

        return result;
    }

    void backtrack(
        int[] nums,
        boolean[] visited,
        List<Integer> current,
        List<List<Integer>> result
    ) {

        // Base case
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used
            if (visited[i]) {
                continue;
            }

            // Skip duplicate
            if (i > 0 &&
                nums[i] == nums[i - 1] &&
                !visited[i - 1]) {

                continue;
            }

            // Choose
            visited[i] = true;
            current.add(nums[i]);

            // Explore
            backtrack(
                nums,
                visited,
                current,
                result
            );

            // Undo choice
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}