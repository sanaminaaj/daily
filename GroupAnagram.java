class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String> > map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String x=strs[i];
            char[] letters = x.toCharArray();
            Arrays.sort(letters);
            String newWord=new String(letters);
            if(map.containsKey(newWord)){
                map.get(newWord).add(x);
            }
            else{
                ArrayList<String> a=new ArrayList<>();
                a.add(x);
                map.put(newWord,a);
            }
        }
         List<List<String>> ans = new ArrayList<>();
        for (String s : map.keySet()) {
			List<String> values = map.get(s);
            ans.add(values);
        }
    return ans;
    }
}
