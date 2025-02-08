// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    reverse("sana",0);
    }
    public static void reverse(String s,int st){
        if(st==s.length()){
            return;
        }
        reverse(s,st+1);
        System.out.println(s.charAt(st));
    }
}
