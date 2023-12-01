class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
	        HashMap<String,List<String>> map = new HashMap<>();
	        HashMap<String,Integer> in = new HashMap<>();
	        HashMap<String,Integer> out = new HashMap<>();
	        List<String> path = new LinkedList<>();
	        for (List<String> i : tickets){
	            if (map.keySet().contains(i.get(0))){
	                map.get(i.get(0)).add(i.get(1));
	            } else{
	                map.put(i.get(0),new ArrayList<>());
	                map.get(i.get(0)).add(i.get(1));
	            }
	            if (!map.keySet().contains(i.get(1))){
	                map.put(i.get(1),new ArrayList<>());
	            }
	        }
	        for (String s : map.keySet()){
	            in.put(s,0);
	            out.put(s,0);
	        }

	        for (List<String> i:tickets){
	            String fr = i.get(0);
	            String to = i.get(1);
	            out.put(fr,out.get(fr)+1);
	            in.put(to,in.get(to)+1);
	        }
            for (String i: map.keySet()){
                Collections.sort(map.get(i),Collections.reverseOrder());
            }

	        //since the problem assume there is a path starting from JFK, im not writing code to check for ecluid path (there is 1 start and 1 end or all equal)
	        for (String i : map.keySet()){
	            System.out.print(i+":");
	            for (String j: map.get(i)){
	                System.out.print(j+", ");
	            }
	            System.out.println(in.get(i)+" "+out.get(i));
	        }
	        dfs("JFK",map,out,path);
	        

	        return path;
	        
	    }

	    public void dfs(String cur, HashMap<String,List<String>> map, HashMap<String,Integer> out, List<String> path){
	        System.out.println(cur +" "+ out.get(cur));
	        while(out.get(cur)!=0){
	            out.put(cur,out.get(cur)-1);
	            dfs(map.get(cur).get(out.get(cur)),map,out,path);

	            // for (String s:map.get(cur)){
	            // }
	        }
	        path.add(0,cur);
	    }
}