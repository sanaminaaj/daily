// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={10,3,2,1,66};
        bubblesort(arr,0,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubblesort(int[] arr,int index,int pass){
        if(pass==arr.length-1){
            return;
        }
        sort(arr,index,pass);
        bubblesort(arr,index,pass+1);
    }
    public static void sort(int[] arr,int index,int pass){
         if(index==arr.length-1){
            return;
        }
        if(arr[index+1]<arr[index]){
            int temp=arr[index];
            arr[index]=arr[index+1];
            arr[index+1]=temp;
        }
        sort(arr,index+1,pass);
    }
}
