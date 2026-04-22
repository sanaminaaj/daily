class Solution {
    public boolean wordPattern(String pattern, String s) {
      Map<Character,String> m=new HashMap<Character,String>();
      Set<String> usedWords=new HashSet<String>();
      String[] words=s.split(" ");
       if(pattern.length() != words.length)
       {
        return false;
       }
         for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!m.containsKey(c)) {
             if (usedWords.contains(word)) {
                    return false;
                }
            m.put(c,word);
            usedWords.add(word);
            }
            else{
                if(!m.get(c).equals(word)){
                    return false;
                }
            }

      }  
    return true;

    }
}
