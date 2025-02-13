// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] a={4,39,32,1,15};
        swap(a,0);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void swap(int[] a,int index){
        if(index==a.length-2){
            return;
        }
        int min=index;
        min=minRemArr(a,index);
        int temp=a[index];
        a[index]=min;
        a[min]=temp;
        swap(a,index+1);
    }
    public static int minRemArr(int[] a,int index){
       int  min=index;
        if(index==a.length-1){
            return min;
        }
        if(a[index+1]<a[index]){
            min=index+1;
            return min;
        }
        return minRemArr(a,index+1);
    }
}
