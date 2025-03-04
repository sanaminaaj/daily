import java.util.Stack;

public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
                Stack<Integer> s = new Stack<>();
                for(int i=n-1;i>=0;i--){
                    if(arr[i]>x){
                        s.push(i);
                    }
                    else if(s.isEmpty()){
                        return n;
                    }
                    else{
                        return s.pop();
                    }
                }
                return 0;
    }
}
