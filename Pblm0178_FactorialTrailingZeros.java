class Solution {
	public int trailingZeroes(int n) {
		long p = 5, count = 0;
		do{
			count += (n/p);
			p *= 5;
		}while(n/p > 0);
		
		return (int)count;
	}
}