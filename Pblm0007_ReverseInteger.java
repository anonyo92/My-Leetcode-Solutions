class Solution {
	public int reverse(int x) {
		int abs = (int)Math.abs(x), sgn = (x>=0?1:-1);
		long rev = 0;
		while(abs > 0){
			rev = rev * 10 + (abs % 10);
			abs /= 10;
		}
		return rev > Integer.MAX_VALUE?0:(int)rev*sgn;
	}
}