class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        
        int g = 0;
        int c = 0;
        for (int i: gas){
            g= g + i;
        }
        for (int i:cost){
            c = c+i;
        }
        if (g<c) return -1;
        int n = gas.length;
        int a [] = new int [n];
        for (int i=0;i<n;i++){
            a[i] = gas[i] - cost[i];
        }
        int start = 0;
        int runSum = 0;
        for (int i = 0; i< n ; i++){
            runSum = runSum+a[i];
            if (runSum<0){
                start = i+1;
                runSum=0;
            }
            // System.out.println(start+" "+runSum);

        }
        // for (int i: a){
        //     System.out.print(i +" ");

        // }
        // System.out.println();
        

        return start;
        
    }

    
}