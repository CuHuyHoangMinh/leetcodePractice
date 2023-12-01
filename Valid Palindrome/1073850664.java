class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i< s.length();i++){
            char t = s.charAt(i);
            if ((t<='z' && t >='a') || (t>='0' && t<='9')){
                sb.append(t);
            }
        }
        String st = "";
        st = sb.toString();
        if (st.length()<2) return true;
        for (int i = 0;i<st.length()/2;i++){
            if (st.charAt(i)!=st.charAt(st.length()-i-1)) return false;
        }
    return true;
    }
}