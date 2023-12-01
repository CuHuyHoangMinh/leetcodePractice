class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> re = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        int count = 0;
        int c = -1;
        for (int i=0;i<words.length;i++){
            count = count + words[i].length();
            c++;
            if (count+c<=maxWidth){
                q.add(words[i]);
            } else{
                String s = "";
                String sp = "";
                String sp1 = "";

                count = count - words[i].length();
                int numspace;
                int tempcount = 0;
                if (q.size() == 1) {
                    numspace = maxWidth - count;
                    tempcount = 0;
                } else{
                    numspace = (maxWidth - count) /(q.size() -1);
                    tempcount = (maxWidth - count) % (q.size() -1);
                }
                
                while (sp.length()<numspace) sp=sp+" ";
                while (sp1.length()<numspace+1) sp1=sp1+" ";
                System.out.println(tempcount + " "+ numspace);
                if (q.size() > 1)
                {
                    while (q.size()>1){
                    if (tempcount > 0){
                        s= s+ q.poll() + sp1;
                    }
                    else{
                        s= s+ q.poll() + sp;
                    }
                    tempcount--;
                    }
                    if (q.size()==1)
                    {
                        s= s+q.poll();
                    }
                } else{
                    s= s+q.poll();
                    while (s.length()<maxWidth){
                        s= s+" ";
                    }

                }
                
                re.add(s);
                q.add(words[i]);

                count = 0;
                c= -1;
                count = count + words[i].length();
                c++;
            }
        }
        String s = "";
        while (!q.isEmpty()){
            s = s + q.poll() +" ";
        }
        s = s.substring(0,s.length()-1);
        while (s.length()<maxWidth){
            s= s+" ";
        }

        re.add(s);
        for (String i:re){
            System.out.println(i);
        }
        System.out.println(re.get(0).length());

        return re;
        
    }
}
