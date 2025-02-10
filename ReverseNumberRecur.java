// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseNumberRecur {
    public static void main(String[] args) {
        reverse(1234);
    }
    public static void reverse(int s){
        if(s==0){
            return;
        }
        System.out.print(s%10);
        
        reverse(s/10);
    }
}
