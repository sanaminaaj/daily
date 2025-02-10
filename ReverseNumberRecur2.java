// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int x=reverse(1234,0);
        System.out.println("Reversed Number: "+x);
    }
    public static int reverse(int s,int res){
        if(s==0){
            return res;
        }
        res=(10*res)+(s%10);
        
        return reverse(s/10,res);
    }
}
