package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {

	public static int lengthOfLongestSubstring(String s) {
		String longest = "";
		String temp = "";
		for (int i = 0, j = 0; j < s.length(); j++) {
			if (temp.contains(Character.toString(s.charAt(j)))) {
				if (temp.length() > longest.length()) {
					longest = temp;
				}
				i = i + temp.indexOf(s.charAt(j)) + 1 ;
				temp = s.substring(i, j+1);
			} else {
				temp += s.charAt(j);
			}
		}
		if (temp.length() > longest.length()) {
			longest = temp;
		}
		System.out.println(longest);
		return longest.length();
	}
	
	public static int searchInsert(int[] nums, int target) {
        int midIdx = 0;
        for (int i=0, j=nums.length-1; i <= j; ) {
            midIdx = i + (j-i)/2;
            int el = nums[midIdx];
            System.out.println(midIdx + " - " + el);
            if (el == target) {
                return midIdx;
            } else if (el > target) {
                j = midIdx - 1;
            } else if (el < target) {
                i = midIdx + 1;
            }
        }
        return midIdx;
    }
	
	public static int[] negativeToLeft(int[] arr) {
		int temp;
		for (int i = 0, j = arr.length - 1; i < j;) {
			if (arr[i] < 0) {
				i++;
			} else if (arr[j] >= 0) {
				j--;
			} else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		return arr;
	}
	
    public static boolean isPalindrome(String s, int start, int end) {
        
        if (s.charAt(start) == s.charAt(end)) {
            if (start + 1 < end -1) {
                return isPalindrome(s, ++start, --end);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public static String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] a = new boolean[len][len];
        int start = 0, end = 1;
        int longest = 0;
        for (int i=0; i<len; i++) {
            a[i][i] = true;
        }
        for (int k=0; k<len;k++) {
            for (int j=k+1, i=0; j<len;j++, i++) {
                if (i == j-1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        a[i][j] = true;
                        if (j - i > longest) {
                            start = i;
                            end = j;
                        }                        
                    }
                } else {
                    if ((s.charAt(i) == s.charAt(j)) && a[i+1][j-1]) {
                        a[i][j] = true;
                        if (j - i > longest) {
                            start = i;
                            end = j;
                        }                        
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }

	public static void main (String[] args) {
		String s = "cbba";
//		lengthOfLongestSubstring("abbcbdaebc");
//		System.out.println(searchInsert(new int[] {2,3,5,6}, 3));
//		System.out.println(Arrays.toString(negativeToLeft(new int[] {2,-2,0,-6,1,-3,8,6,0})));
//		System.out.println(Arrays.toString(negativeToLeft(new int[] {0,-2,2,-2})));
//		System.out.println(isPalindrome(s, 0, s.length()-1));
		
		System.out.println(longestPalindrome(s));
	}
	

}
