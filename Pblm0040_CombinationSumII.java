class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		Map<Integer, Integer> hashMap = new HashMap<>();

		for(int i: candidates){
			hashMap.put(i, hashMap.containsKey(i)?hashMap.get(i)+1:1);
		}
		
		DFS(0, target, candidates, new ArrayList<Integer>(), result, -1, hashMap);
		return result;
	}

	private void DFS(int sum, int target, int[] candidates, List<Integer>current, List<List<Integer>>result, int pos, Map<Integer, Integer> hashMap){
		if(sum > target || pos>= candidates.length){
			return;
		}
		else if(sum==target){
			result.add(new ArrayList<Integer>(current));
		}
		else{
			int c = 1;
			for(int i=pos+1; (i<candidates.length && candidates[i]+sum<=target); i=i+c){
				c = hashMap.get(candidates[i]);
				for(int k=1; k<=c; k++){
					sum += k*candidates[i];

					for(int l=1; l<=k; l++)
					current.add(candidates[i]);

					DFS(sum, target, candidates, current, result, i+c-1, hashMap);

					for(int l=1; l<=k; l++)
						current.remove(current.size()-1);

					sum -= k*candidates[i];
				}
			}
		}
	}
}