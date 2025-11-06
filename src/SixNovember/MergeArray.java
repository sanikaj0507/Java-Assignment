package SixNovember;

import java.util.Arrays;

	public class MergeArray {
	    public static void main(String[] args) {
	        int[] a = {3, 5, 7};
	        int[] b = {1, 4, 6};
	        int[] c = new int[a.length + b.length];

	        int k = 0;
	        for (int i : a) {
	        	c[k++] = i;
	        }
	        for (int j : b) {
	        	c[k++] = j;
	        }

	        Arrays.sort(c);

	        System.out.println("Merged Sorted Array: " + Arrays.toString(c));
	    }
	}

