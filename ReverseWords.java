class Solution {
    public String reverseWords(String st) {
        String s=st.trim();
        String[] arr=s.split("\\s+");
        for(int i=0;i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        String res="";
        for(int i=0;i<arr.length;i++){
            res=res+arr[i]+" ";
        }
        return res.trim();
    }
}
