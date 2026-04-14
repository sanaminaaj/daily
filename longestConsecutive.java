

import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
    Set<Integer> s=new HashSet<>();
    for(int i:nums){
        s.add(i);
    }
    int longNum=0;
    for(int i:s){
        if(!s.contains(i-1)){
            int curr=i;
            int count=1;
            while(s.contains(curr+1)){
                count=count+1;
                curr=curr+1;
            }
            longNum=Math.max(longNum,count);
        }

    }
    return longNum;
    }
}
