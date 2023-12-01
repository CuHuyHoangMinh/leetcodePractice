class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> a = new HashSet<>();
        int zeros = 0;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        HashSet<Integer> posSet = new HashSet<>();
        HashSet<Integer> negSet = new HashSet<>();
        for (int i : nums){
            if (i ==0) zeros++;
            if (i>0) {
                pos.add(i);
                posSet.add(i);
            }
            if (i<0){
                neg.add(i);
                negSet.add(i);
            }
        }
        List<List<Integer>> re = new ArrayList<>();
        if (zeros >=3) a.add(Arrays.asList(0,0,0));
        if (zeros >0 ){
            for (int i: posSet){
                if (negSet.contains(-i)){
                    a.add(Arrays.asList(-i,0,i));
                }
            }
        }
        //2 pos
        for (int i = 0; i<pos.size()-1;i++){
            for (int j = i+1;j<pos.size();j++){
                if ( negSet.contains( -1 *(pos.get(i)+pos.get(j) ) ) )  {
                    List<Integer> temp = Arrays.asList(-1 * (pos.get(i)+pos.get(j)), pos.get(i),pos.get(j));
                    Collections.sort(temp);
                    a.add(temp);
                }
            }
        }
        
        // 2 neg
        for (int i = 0 ;i<neg.size()-1;i++){
            for (int j = i+1; j<neg.size();j++){
                if (posSet.contains( -1 * (neg.get(i)+neg.get(j)) )){
                    List<Integer> temp = Arrays.asList(neg.get(i),neg.get(j),-1 * (neg.get(i)+neg.get(j)));
                    Collections.sort(temp);
                    a.add(temp);
                }
            }
        }       
        re.addAll(a);

        return re;
        
    }
}

