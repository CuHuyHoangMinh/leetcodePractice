class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        List<Data> nums_data = new ArrayList<>();
        int n = nums.size();
        for (List<Integer> i : nums){
            nums_data.add(new Data(i.get(0),i.get(1)));
        }
        Collections.sort(nums_data);
        for (Data d: nums_data){
                        System.out.println(d.a+" "+d.b);

        }
        LinkedList<Data> re = new LinkedList<>();
        re.add(nums_data.get(0));
        for (int i =1;i<n;i++){
            Data d = re.getLast();
            Data i_d = nums_data.get(i);
            if (d.b>=i_d.a) {
                d.b = Integer.max(d.b,i_d.b);
            } else{
                re.add(i_d);
            }
        }
        int count = 0;
        for (Data d: re){
            System.out.println(d.a+" "+d.b);
            count = count + d.b-d.a+1;
        }
        return count;
    }
}

class Data implements Comparable<Data>{
    int a;
    int b;
    public Data (int x, int y){
        a= x;
        b = y;
    }

    @Override
    public int compareTo(Data o){
        if (a==o.a) return Integer.compare(b,o.b);
        return Integer.compare(a,o.a);
    }
}