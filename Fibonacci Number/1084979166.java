class Solution {
    public int fib(int n) {
        if (n ==0 ) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int count = 2;
        int a = 1;
        int b = 1;
        int c = 0;
        while (count <n){
            c = a+ b;
            a= b;
            b =c; 
            count ++;
        }
        return c;
    }
}