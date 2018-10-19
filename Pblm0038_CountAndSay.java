class Solution {
	public String countAndSay(int n) {
		String result = "1", tempResult;
		char prevChar, ch;
		int charCount;
		for (int i = 1; i < n; i++){
			prevChar = result.charAt(0); charCount = 0;
			tempResult = "";
			for (int j = 0; j < result.length(); j++){
				ch = result.charAt(j);
				if (ch != prevChar){
					tempResult += charCount + "" + prevChar;
					charCount = 1;
				}
				else
					charCount++;
				prevChar = ch;
			}
			tempResult += charCount + "" + prevChar;
			result = tempResult;
		}
		return result;
	}
}