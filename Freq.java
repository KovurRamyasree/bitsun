import java.io.*;
import java.util.*;
public class Freq{
    static public void binarysearch(int low,int high,int arr[],int key)
    {
	
        int mid=(low+high)/2;
        if(arr[mid]==key)
        {
           	 count=count+1;
 
		if(low<=(mid-1))
		{
            		binarysearch(low,mid-1,arr,key);
		}
		if(high>=(mid+1))
		{
            		binarysearch(mid+1,high,arr,key);
		}           
        }
        else if(key>arr[mid])
        {
		if(high>=mid+1)
            binarysearch(mid+1,high,arr,key);
        }
        else if(key<arr[mid])
        {
	   if(mid-1>=low)	
            binarysearch(low,mid-1,arr,key);
        }
        
    }
    static int count=0;
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int k=in.nextInt();
        Arrays.sort(arr);
        binarysearch(0,n-1,arr,k);
	System.out.println("count is "+count);
    }
}