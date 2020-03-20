import java.io.*;
import java.util.*;
class Median
{ 
    static int getMedian(int ar1[], int ar2[], int n) 
    {    
        int i = 0;   
        int j = 0;  
        int count; 
        int m1 = -1, m2 = -1; 
        for (count = 0; count <= n; count++) 
        { 
            if (i == n) 
            { 
                m1 = m2; 
                m2 = ar2[0]; 
                break; 
            } 
            else if (j == n) 
            { 
                m1 = m2; 
                m2 = ar1[0]; 
                break; 
            } 
       
            if (ar1[i] < ar2[j]) 
            { 
                m1 = m2;   
                m2 = ar1[i]; 
                i++; 
            } 
            else
            {
                m1 = m2;   
                m2 = ar2[j]; 
                j++; 
            } 
        } 
       
        return (m1 + m2)/2; 
    } 
       
    public static void main (String[] args) 
    { 
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
        int[] ar1 =new int[n];
	int[] ar2 =new int[n];
	for(int i=0;i<n;i++)
	{
		ar1[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		ar2[i]=in.nextInt();
	}
	System.out.println("Median is "+getMedian(ar1,ar2,n));
	
    }     
}