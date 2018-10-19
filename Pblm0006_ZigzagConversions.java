class Solution {
	public String convert(String s, int numRows) {
		int len = s.length(), dir = 1;
		if(numRows == 1)
			return s;
		String rowRes[] = new String[numRows], result = "";
		for(int row = 0; row < numRows; row++, dir = 1){
			int c = row, next = 0;
			rowRes[row] = "";
			while(c < len){
				rowRes[row] += s.charAt(c);
				next = (row == 0 || row == numRows-1? 2*numRows-2 : (dir == 1? 2*(numRows-row-1) : 2*row));
				c += next;
				dir *= -1;
			}
		}
		for(String res : rowRes)
			result += res;
		return result;
	}
}