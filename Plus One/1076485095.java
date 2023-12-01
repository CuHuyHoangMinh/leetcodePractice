class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        LinkedList<Integer> re = new LinkedList<>();
        int i = n-1;
        int left = 1;
        while (i>=0){
            if (digits[i] + left >9 ){
                left = 1;
                re.addFirst(0);
            } else{
                re.addFirst(digits[i]+left);
                left = 0;
            }
            i--;
        }
        if (left==1) re.addFirst(1);
        int re1 [] = new int[re.size()];
        int count = 0;
        for (int val:re){
            re1[count] = val;
            count++;
        }
        return re1;
    }
}