class Solution {
	public String longestCommonPrefix(String[] strs) {
		String lcp = "";
		if (strs.length == 0)
			return lcp;
		if (strs.length == 1)
			return strs[0];
		
		for (int i = 0; i < strs[0].length(); i++){
			char ch = strs[0].charAt(i);
			
			for (String str : strs)
				if (i == str.length() || str.charAt(i) != ch)
					return lcp;
			
			lcp += ch;
		}
		return lcp;
	}
}