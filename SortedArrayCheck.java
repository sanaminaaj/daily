// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,33,4};
        boolean b=checkSorted(arr,0);
        System.out.println("sorted Array:"+b);
    }
    public static boolean checkSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
        return checkSorted(arr,index+1);
        }
        else{
            return false;
        }
        
    }
}
