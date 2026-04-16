class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            String s1=expand(s,i,i);
            String s2=expand(s,i,i+1);
            if(s1.length()>res.length()){
                res=s1;
            }
            if(s2.length()>res.length()){
                res=s2;
            }
        }
        return res;
    }
    public static String expand(String s,int l,int r){
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            return s.substring(l+1,r);
        }
}
