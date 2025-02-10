// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int x=check(123,0);
        System.out.println(x);
    }
    public static int check(int x,int c){
        if(x==0){
            return c;
        }
        if(x%2==0){
            c=c+1;
            return check(x/2,c);
        }
        else{
            c=c+1;
            return check(x-1,c);
        }
    }  
}
