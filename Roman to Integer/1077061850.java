class Solution {
    public int romanToInt(String s) {
        char [] c = s.toCharArray();
        HashMap<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int n = c.length;
        int prev = 0;
        int sum = 0;
        for (int i = n-1;i>=0;i--){
            int cur = m.get(c[i]);
            if (cur>=prev) sum = sum+m.get(c[i]);
            else sum = sum - m.get(c[i]);
            prev= cur; 
        }
        return sum;
    }
}