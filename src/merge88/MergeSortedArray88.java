package merge88;

class Solution {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n != 0) {
            nums1 = nums2.clone();
        }
        else if (n == 0) {
            return nums1;
        }
        else {
        	int[] temp = nums1.clone();
        	int p1 = 0;
        	int p2 = 0;
        	for (int i=0; i<m; i++) {
        		if (p1 != p2) {
        			if (p1 < p2) {
        				nums1[i] = p1;
        			}
        			else {
        				nums1[i] = p2;
        			}
        		}
        		else {
        			nums1[i] = p1;
        			nums1[i+1] = p2;
        		}
        	}
        }
		return nums1;
    }
}
