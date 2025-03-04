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
    //optimal
        public static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

}
