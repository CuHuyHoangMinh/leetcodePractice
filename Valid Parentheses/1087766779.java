class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        
        for (char i:s.toCharArray()){
            if (i=='(' || i == '[' || i == '{') open.add(i);
            if ((i==')' || i == ']' || i == '}') && (open.size() == 0)) return false;
            if (i == ')' && open.peek()!='(') return false;
            if (i == ']' && open.peek()!='[') return false;
            if (i == '}' && open.peek()!='{') return false;
            if (i==')' || i == ']' || i == '}') open.pop();
        }
        if (open.size() == 0) return true;
        return false;
    }
}