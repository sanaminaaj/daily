package one;
import java.util.*;
public class ChocolateDistribution {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online
	
	    public static void main(String[] args) {
	        int[] a={7, 3, 2, 4, 9, 12, 56};
	        int m=3;
	        Arrays.sort(a);
	        //2,3,4,7,9,12,56
	        int min_val=Integer.MAX_VALUE;
	        for(int i=0;i+m-1<a.length;i++){
	            int diff=a[i+m-1]-a[i];
	            min_val=Math.min(min_val,diff);
	        }
	        System.out.println(min_val);
	   
	}
}
