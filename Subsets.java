import java.util.*;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubsets(nums, 0, current, result);
        return result;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude the current element
        generateSubsets(nums, index + 1, current, result);

        // Include the current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // Backtrack to remove the current element
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the nums array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the nums array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        List<List<Integer>> result = subsets(nums);
        System.out.println("All subsets are: ");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
