// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    int[] arr={1,2,3,4};
    int[] a=reverseArr(arr,0);
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    }
    public static int[] reverseArr(int[] arr,int index){
        if(index==(arr.length/2)){
            return arr;
        }
        int temp=arr[index];
        arr[index]=arr[arr.length-index-1];
        arr[arr.length-index-1]=temp;
        return reverseArr(arr,index+1);
    }
}
