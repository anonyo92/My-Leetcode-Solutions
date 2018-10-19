class Solution {
	public int searchInsert(int[] nums, int target) {
		int len = nums.length;
		for (int i = 0; i < nums.length; i++)
			if (target <= nums[i])
				return i;
		
		return nums.length;
	}
}