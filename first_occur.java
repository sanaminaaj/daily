// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,10,2,9,15};
        first(0,1,arr);

    }
    public static void first(int n,int ele,int[] arr){
        if(n==arr.length){
            System.out.println("not found");
            return;
        }
        if(arr[n]==ele){
            System.out.println("found:"+(n+1));
            return;
        }
        first(n+1,ele,arr);
        
    }
}
