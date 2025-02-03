public  class Fibon{
    public static void main(String[] args) {
        fib(0,1,5);
    }
    public static void fib(int a,int b,int n){
        if(n==3){
            System.out.println(a+b);
            return;
        }
        int c=a+b;
        fib(b,c,n-1);
        
    }}
