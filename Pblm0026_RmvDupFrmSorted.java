class Solution {
	public int removeDuplicates(int[] nums) {
		int len = nums.length, pos = 0;
		if (len == 0 || len == 1)
			return len;
		
		for (int i = 1; i < len; i++)
			if (nums[i] != nums[pos])
				nums[++pos] = nums[i];
		
		return ++pos;
	}
}