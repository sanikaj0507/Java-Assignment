package Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {5,6,0, 1, 0, 3, 12};
        move(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
	}

	private static void move(int[] nums) {
		// TODO Auto-generated method stub
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
	}

}
