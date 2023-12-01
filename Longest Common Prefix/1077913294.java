class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        boolean check = true;
        while (check){
            if (count>=strs[0].length()) break;
            char temp = strs[0].charAt(count);
            for (String st: strs){

                if ( count>=st.length() || st.charAt(count)!=temp){
                    check = false;
                    break;
                }
            }
            if (!check) break;
            count++;
        }
        System.out.println(count);
        return strs[0].substring(0,count);
    }
}