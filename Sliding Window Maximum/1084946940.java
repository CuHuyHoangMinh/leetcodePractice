class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
		Deque<Integer> dNum = new ArrayDeque<Integer>();
		Deque<Integer> dInd = new ArrayDeque<Integer>();
		int n = nums.length;
		dNum.addLast(nums[0]);
		dInd.addLast(0);
		List<Integer> reL = new ArrayList<>();

		int count = 1;
		if (count >= k)
				reL.add(dNum.getFirst());
		for (int i = 1; i < n; i++) {
			int lowBound = i - (k - 1);
			while (!dInd.isEmpty() && dInd.peekFirst() < lowBound) {
				dInd.removeFirst();
				dNum.removeFirst();
			}
			if (dNum.isEmpty()){
				dNum.addLast(nums[i]);
				dInd.addLast(i);
			}
			else {
				while (!dNum.isEmpty() && dNum.getLast()<=nums[i]) {
					dNum.removeLast();
					dInd.removeLast();
			}
			dNum.addLast(nums[i]);
			dInd.addLast(i);
			}
			
			count++;
			if (count >= k)
				reL.add(dNum.getFirst());
		}
		int[] re = new int[reL.size()];
		for (int i = 0; i < reL.size(); i++) {
			re[i] = reL.get(i);
		}
		return re;
	}
}