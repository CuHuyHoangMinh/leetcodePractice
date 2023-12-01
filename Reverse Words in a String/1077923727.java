class Solution {
    public String reverseWords(String s) {
        String [] temp = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = temp.length-1; i>=0;i--){
            System.out.println(temp[i]);
            sb.append(temp[i] + " ");
        }
        return sb.toString().trim();
        
    }
}