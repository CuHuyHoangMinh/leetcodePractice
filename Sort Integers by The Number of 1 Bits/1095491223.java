
class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> a = new ArrayList<Integer>();
        for (int i :arr) a.add(i);
        Collections.sort(a,new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b){
                if (Integer.compare(Integer.bitCount(a),Integer.bitCount(b)) == 0) 
                    return Integer.compare(a,b);
                return Integer.compare(Integer.bitCount(a),Integer.bitCount(b));
            }
        } );
        int []re = new int[a.size()];
        for (int i = 0; i< re.length;i++) re[i] = a.get(i);
        return re;
    }
}