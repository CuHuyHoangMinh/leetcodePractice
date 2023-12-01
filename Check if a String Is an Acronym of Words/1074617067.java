class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (String d:words){
            sb.append(d.charAt(0));
        }
        return sb.toString().equals(s);
        
    }
}