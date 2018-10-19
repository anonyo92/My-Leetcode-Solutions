class Solution {
	public boolean repeatedSubstringPattern(String s) {
		String p = "", newStr = "";
		int len = s.length(), n = 0;
		if (len == 1)
			return false;
		
		for (int k = len/2; k > 0; k--){
			if (len % k != 0)
				continue;
			n = len / k;
			p = s.substring(0, k);
			newStr = String.join("", Collections.nCopies(n, p));
			if (newStr.equals(s))
				return true;
		}
		return false;
	}
}