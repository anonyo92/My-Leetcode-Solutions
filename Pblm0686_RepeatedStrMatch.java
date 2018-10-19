class Solution {
	public int repeatedStringMatch(String A, String B) {
		int lenA = A.length(), lenB = B.length(), c = 1;
		String nA = A;
		while (c*lenA <= 2*lenA + lenB){
			if (nA.indexOf(B) != -1)
				return c;
			nA += A; c++;
		}
		return -1;
	}
}