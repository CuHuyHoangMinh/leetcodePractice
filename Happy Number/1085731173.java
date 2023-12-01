class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int temp = n;
        set.add(temp);
        if (n == 1) return true;
        while (temp != 1){
            // System.out.println(temp);
            int h = happy(temp);
            if (h == 1) return true;
            if (set.contains(h)) return false;
            set.add(h);
            temp = h;
        }
        return true;

        
    }

    public int happy(int n){
        int temp = n;
        int sum = 0;
        while (temp>0){
            int d = temp % 10;
            sum = sum + d*d;
            temp =temp / 10;
        }
        return sum;
    }
}