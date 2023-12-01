class Solution {
    public String convert(String s, int numRows) {
        String []st = new String[numRows];
        Arrays.fill(st,"");
        int count = 0;
        main:
        while (count<s.length()){
            for (int i = 0;i< numRows;i++){
                if (count >=s.length() ) break main;
                st[i] = st[i] + s.charAt(count);
                count++;
            }
            for (int i = numRows - 2 ; i>=1; i--){
                if (count >=s.length() ) break main;
                st[i] = st[i] + s.charAt(count);
                count++;
            }
        }
        String re = "";
        for (String si:st){
            re= re + si;
        }
        return re;
        
    }
}