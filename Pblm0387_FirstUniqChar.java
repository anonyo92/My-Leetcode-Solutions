class Solution {
	public int firstUniqChar(String s) {
		String subStr = "", uniqueChars = "";
		char ch;
		for (int i = 0; i < s.length(); i++){
			ch = s.charAt(i);
			if (uniqueChars.indexOf(ch) != -1)
				continue;
			uniqueChars += ch;
			subStr = s.substring(0,i) + s.substring(i+1);
			if (subStr.indexOf(ch) == -1)
				return i;
		}
		return -1;
	}
}