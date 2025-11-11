package Arrays;

public class RemoveElementsAndReturnNewLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {5,6,3, 2, 2, 3, 4, 2};
        int val = 2;
        int result = newLen(nums, val);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + result);
	}

	private static int newLen(int[] nums, int val) {
		// TODO Auto-generated method stub
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        return index;
	}

}
