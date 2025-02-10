// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        countZero(100020430,0);
    }
    public static void countZero(int s,int count){
        if(s==0){
            System.out.println(count);
            return;
        }
        if(s%10==0){
            count=count+1;
        }
        countZero(s/10,count);
    }
}
