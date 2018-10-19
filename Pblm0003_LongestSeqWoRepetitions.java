class Solution {
	public int lengthOfLongestSubstring(String s) {
		int windowStart = 0, len = s.length(), maxLen = 0;
		char ch;
		String substr = "";
		for (int i = 0; i < len && windowStart <= len;){
			ch = s.charAt(i);
			if (substr.indexOf(ch) == -1){
				substr += ch;  i++;
				if (maxLen < i - windowStart)
					maxLen = i - windowStart;
			}
			else{
				windowStart++;
				substr = substr.substring(1);
			}
		}
		return maxLen;
	}
}