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
        	int p1 = temp[0];
        	int p2 = nums2[0];
        	for (int i=0; i<m-1; i++) {
        		if (p1 != p2 && p1 != 0) {
        			if (p1 < p2) {
        				nums1[i] = p1;
        				p1 = temp[i+1];
        			}
        			else {
        				nums1[i] = p2;
        				p2 = nums2[i+1];
        			}
        		}
        		else if (p1 == 0){
        			nums1[i+1] = p2;
        			if (nums2[i-1] == nums2[n]) {
        				p2 = nums2[i--];
        			}
        			if (temp[1+i] == m-1) {
        				p1 = temp[1 + i++];
        			}
        		}
        		else {
        			nums1[i] = p1;
        			p1 = temp[i+1];
        			nums1[i+1] = p2;
        			p2 = nums2[i];
        		}
        	}
        }
		return nums1;
    }
}
