class Solution {
    public String maximumOddBinaryNumber(String s) {
        char [] c = s.toCharArray();
        int n = s.length();
        int count = 0;
        for (char i: c){
            if (i=='1'){
                count ++;
            }
        }
        
        String re = "";
        count --;
        for (int i = 0;i<count;i++){
            re='1'+re;
        }
        for (int i=0;i<n-count-1;i++){
            re=re + "0";
        }
        return re+"1";
    }
}