class Solution {
	public String frequencySort(String s) {
		Map<Character, Integer> charFreqMap = new HashMap<Character, Integer>();
		char ch;
		String result = "";
		for (int i = 0; i < s.length(); i++){
			ch = s.charAt(i);
			charFreqMap.put(ch, charFreqMap.containsKey(ch)? charFreqMap.get(ch)+1 : 1);
		}
		charFreqMap = charFreqMap.entrySet()
								 .stream()
								 .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
								 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet())
			result += String.join("", Collections.nCopies(entry.getValue(), entry.getKey()+""));
		return result;
	}
}