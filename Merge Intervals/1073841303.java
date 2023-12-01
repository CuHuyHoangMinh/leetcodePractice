class Solution {

    public int[][] merge(int[][] inp) {
        int n = inp.length;
        ArrayList<Pair> l = new ArrayList<>();
        LinkedList<Pair> m = new LinkedList<>();

        for (int[] i : inp){
            l.add(new Pair(i[0],i[1]));
        }
        Collections.sort(l);
        
        m.add(l.get(0));
        for (int i = 1;i<n;i++){
            Pair pointer_m = m.getLast();
            Pair pointer_l = l.get(i);
            if (pointer_m.b>=pointer_l.a){
                pointer_m.b = Integer.max(pointer_m.b, pointer_l.b);
            } else{
                m.add(pointer_l);
            }
        }
        // System.out.println(m.size());
        int [][] re = new int[m.size()][2];
        int count = 0;
        for (Pair i : m){
            re[count][0] = i.a;
            re[count][1] = i.b;
            count++;
        }
        return re;
    }
}
class Pair implements Comparable<Pair>{
    int a;
    int b;
    public Pair(int x, int y){
        a = x;
        b = y;

    }
    @Override
    public int compareTo(Pair o){
        if (a == o.a) return Integer.compare(b,o.b);
        return Integer.compare(a,o.a);
    }

    @Override
    public String toString(){
        return a+" "+b;
    }
}