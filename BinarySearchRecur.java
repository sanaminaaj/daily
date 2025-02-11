// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int value=binarySearch(arr,2,0,5);
        System.out.println(value);
    }

    public static int binarySearch(int[] arr,int key,int s,int e){
        if(s<e){
        int mid=(s+e)/2;
        if(key==arr[mid]){
            return mid;
        }
        else if(key<arr[mid]){
            return binarySearch(arr,key,s,mid);
        }
        else{
            return binarySearch(arr,key,mid+1,e);
        }
        }
        else{
            return -1;
        }
    }
}
