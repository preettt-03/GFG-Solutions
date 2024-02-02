//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here    
        // ArrayList<Integer> list = new ArrayList<>();
        // int u=0,l=0,n=0,s1=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)>=67 && s.charAt(i)<=90){
        //         u++;
        //     }else  if(s.charAt(i)>=97 && s.charAt(i)<=122){
        //         l++;
        //     }else  if(s.charAt(i)>=48 && s.charAt(i)<=57){
        //         n++;
        //     }else{
        //         s1++;
        //     }
        // }
        //     list.add(u);
        //     list.add(l);
        //     list.add(n);
        //     list.add(s1);
            
            
        //     int[] arr = new int[list.size()];
 
        // // ArrayList to Array Conversion
        // for (int i = 0; i < list.size(); i++)
        //     arr[i] = list.get(i);
 
        
        // return arr;
        
        int[] arr=new int[4];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                arr[0]++;
            }else if(ch>='a' && ch<='z')
            {
                arr[1]++;
            }
            else if(ch>='0' && ch<='9')
            {
                arr[2]++;
            }
            else
            {
                arr[3]++;
            }

        }
        return arr;
    }
}