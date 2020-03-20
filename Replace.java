import java.util.*;
import java.io.*;
import java.lang.Math;
class Replace{
    static void  pattern(int n,String s,int k)
    {
                 // System.out.println(s); 
		String s2="";
		count++;
		
			char[] ch=s.toCharArray();
			//System.out.println("char length"+ch.length);
			
			for(int i=0;i<ch.length;i++)
			{

				if(ch[i]=='0')
				{
					s2=s2+"01";
				}
				else if(ch[i]=='1')
				{
					s2=s2+"10";
				}
			}
		//System.out.println(s2);
		

		if(count<n)
		{
			//System.out.println(s2);    
			pattern(n,s2,k);
			
                        
		}
		else
		{
			//char[] chars=s2.toCharArray();
			//System.out.println(s2);  
			System.out.println(s2.charAt(k));
		}
		
   } 

    
static int count=1;
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       	int k=in.nextInt();
        if(n==1)
        {
            System.out.println("0");
        }
        else
        {
            
            String s;
            s="0";
            pattern(n,s,k);
        }
    }
}