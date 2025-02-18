import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        int a[] = {4, 12, 5, 3, 1, 2, 5, 3, 2, 4, 6};
        st.push(a[a.length-1]);
        int res[] = new int[a.length];
        res[a.length-1]=-1;
        // Iterate from right to left to find the next greater element
        for (int i = a.length - 2; i >= 0; i--) {
            if(st.isEmpty()){
                res[i]=-1;
                st.push(a[i]);
            }
            else if (st.peek() > a[i]) {
                res[i] = st.peek();
                st.push(a[i]);
            } else {
                while (!st.isEmpty() && st.peek() <= a[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    res[i] = st.peek();
                } else {
                    res[i] = -1;
                }
                st.push(a[i]);
            }
        }

        // Print the next greater elements
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
