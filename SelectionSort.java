// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SelectionSort {
    public static void main(String[] args) {
        int a[]={5,4,3,2};
        for(int i=0;i<a.length;i++){
            int min1=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min1]){
                    min1=j;
                }
            }
            int temp=a[min1];
            a[min1]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
