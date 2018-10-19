class Solution {
	public boolean isPalindrome(int x) {
		int copy = x;
		long rev = 0;
		while (copy > 0){
			rev = rev*10 + (copy%10);
			copy /= 10;
		}
		return x == rev;
	}
}