package Arrays;

public class FindDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 4, 1, 5, 6, 5};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        System.out.println("\nCount " + count);
	}

}
