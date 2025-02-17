// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
    String s="[{())";
    Stack<Character> st=new Stack<Character>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{'){
           st.push(s.charAt(i)); 
        }
        else if(s.charAt(i)==']'){
            if(st.peek()=='['){
                st.pop();
            }
        }
        else if(s.charAt(i)=='}'){
            if(st.peek()=='{'){
                st.pop();
            }
        }
        else{
            if(st.peek()=='('){
                st.pop();
            }
        }
    }
    if(st.empty()){
        System.out.println("stack is balanced");
    }
    else{
        System.out.println("stack is not balanced");
    }
    }
}
