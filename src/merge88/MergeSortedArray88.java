package merge88;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class MergeSortedArray88 {

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // copy nums 1 to newArray
        // for all elements in nums 1, see if it's bigger then
        // each element in nums 2. 
        // If its bigger, then insert it into nums1 at the next free position.
        // If it's smaller, then insert the element in nums2 at that position to the next free position.

        int[] leftSide = nums1.clone();
        int right = 0;
        int left = 0;

        for (int i=0; i <= m; i++) {
        	if (m != 0) {
        		if (leftSide[left] > nums2[right] && leftSide[left] != 0 && nums2[right] != 0) {
            		nums1[i] = nums2[right];
            		right++;
            	}
            	else if (leftSide[left] == 0) {
            		nums1[i] = nums2[right];
            		right++;
            	}
            	else if (nums2[right] == 0) {
            		nums1[i] = leftSide[left];
            		left++;
            	}
            	else {
            		nums1[i] = leftSide[left];
            		left++;
            	}
        	}
        	else {
        		nums1 = nums2.clone();
        	}
        }
        return nums1;
    }
	
	// TEST DRIVER
	public static void main(String[] args) {
//		int[] nums2 = {2, 4, 5, 11, 12};
//		int n = nums2.length;
//		int arrayLength = n*2;
//		if (n % 2 == 1) {
//			arrayLength--;
//		}
//		int[] nums1 = new int[arrayLength];
//		int m = nums1.length;
//		for (int i=0; i < Math.floor(m/2); i++) {
//			switch(i) {
//			case 0: 
//				nums1[i] = 1;
//				break;
//			case 1: 
//				nums1[i] = 3;
//				break;
//			case 2: 
//				nums1[i] = 6;
//				break;
//			case 3: 
//				nums1[i] = 9;
//				break;
//			}
//		}
		int[] nums1 = new int[0];
		int m = nums1.length;
		int[] nums2 = {1};
		int n = nums2.length;
		
		StdOut.println("nums1: " + Arrays.toString(nums1));
		StdOut.println("nums2: " + Arrays.toString(nums2));
		
		nums1 = merge(nums1, m, nums2, n);
		
		StdOut.println("A: " + Arrays.toString(nums1));	
	}

}
