class Solution {
    public boolean canBeEqual(String s1, String s2) {
        String s1_1 = ""+s1.charAt(2)+s1.charAt(1)+s1.charAt(0)+s1.charAt(3);
        String s1_2 = ""+s1.charAt(2)+s1.charAt(3)+s1.charAt(0)+s1.charAt(1);
        String s1_3 = ""+s1.charAt(0)+s1.charAt(3)+s1.charAt(2)+s1.charAt(1);
        return s1.equals(s2) || s1_1.equals(s2) || s1_2.equals(s2) || s1_3.equals(s2);
    }
}