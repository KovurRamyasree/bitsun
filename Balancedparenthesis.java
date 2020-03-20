
import java.io.*; 
  
class Balancedparenthesis 
{ 
    static void _printParenthesis(char str[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 

            for(int i=0;i<str.length;i++) 
                System.out.print(str[i]); 
            System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = '}'; 
                _printParenthesis(str, pos+1, n, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '{'; 
                _printParenthesis(str, pos+1, n, open+1, close); 
            } p
        } 
    } 
    static void printParenthesis(char str[], int n) 
    { 
        if(n > 0) 
        _printParenthesis(str, 0, n, 0, 0); 
        return; 
    } 
      
    public static void main (String[] args)  
    { 
	Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        char[] str = new char[2 * n]; 
        printParenthesis(str, n); 
    } 
} 
  
