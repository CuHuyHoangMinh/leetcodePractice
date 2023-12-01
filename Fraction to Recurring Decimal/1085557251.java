class Solution {
    public String fractionToDecimal(long numerator, long denominator) {
        String re = "";

        if (numerator * denominator < 0) {
            re = "-";
            
        }
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        long dec = numerator / denominator;
        re = re+dec;

        long remainder = numerator % denominator;
        if (remainder < 0) remainder = -remainder;
        List<Long> remains = new ArrayList<>();
        List<Long> left = new ArrayList<>();
        HashSet<Long> set = new HashSet<>();
        set.add(remainder);
        while (remainder != 0 || !set.contains(remainder)){
            remains.add(remainder);
            remainder = remainder * 10;
            left.add(remainder/denominator);
            remainder = remainder % denominator;
            if (set.contains(remainder)) break;
            set.add(remainder);
        }
        // System.out.println(remainder);
        // for (int i  = 0;i<left.size();i++){
        //     System.out.println(remains.get(i) + " " + left.get(i));
        // }
        if (remainder != 0){
            if (remains.size()>0){
                re = re+ ".";
                for (int i=0;i<remains.size();i++){
                    if (remains.get(i).equals( remainder ) ){
                        re = re+ "(" + left.get(i); 
                    }else{
                        re = re+ left.get(i);
                    }
                }
                re= re+")";
            }
        } else{
            if (remains.size()>0) {
                re = re+ ".";
                for (int i = 0;i<left.size();i++){
                    re = re + left.get(i);
                }
            }
        }
        
        return re;
    }
}