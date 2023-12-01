class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] st = new StringBuilder[numRows];
        for (int i = 0;i<numRows;i++) st[i] = new StringBuilder();
        int count = 0;
        main:
        while (count<s.length()){
            for (int i = 0;i< numRows;i++){
                if (count >=s.length() ) break main;
                st[i].append(s.charAt(count));
                count++;
            }
            for (int i = numRows - 2 ; i>=1; i--){
                if (count >=s.length() ) break main;
                st[i].append(s.charAt(count));
                count++;
            }
        }
        StringBuilder re = new StringBuilder();
        for (StringBuilder si:st){
            re.append( si.toString() );
        }
        return re.toString();
        
    }
}