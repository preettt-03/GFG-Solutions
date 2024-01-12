//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution

// {
//     //  public static boolean isvowel(char ch){
//     //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//     //         return true;
//     //     }
//     //     return false;
//     // }
    
//     private static boolean isvowel(char c){
//         return "aeiouAEIOU".indexOf(c) != -1;
    
//     }
//     String modify (String s)
//     {
//         // your code here
//         char c[]=s.toCharArray();
//         int i=0;
//         int j=s.length()-1;
        
//         while(i<j){
//             if(isvowel(c[i])&&isvowel(c[j])){
//                  char temp=c[i];
//                 c[i]=c[j];
//                 c[j]=temp;
//                 i++;
//                 j++;
//             }else{
            
//             if(!isvowel(c[i])){
//                 i++;
//             }if(!isvowel(c[j])){
//                 j--;
//             }
//             }
//         }
//         // return String.valueOf(c);
//         return new String(c);
//     }
    
   
// }



class Solution
{
    String modify(String s)
    {
        char s1[] = s.toCharArray();
        int l = 0;
        int h = s1.length - 1;
        while (l < h)
        {
            if (!check_vowel(s1[l]))
                l++;
            else if (!check_vowel(s1[h]))
                h--;  // Fix: decrement h instead of incrementing
            else
            {
                char temp = s1[l];
                s1[l] = s1[h];
                s1[h] = temp;
                l++;
                h--;
            }
        }
        return new String(s1);
    }

    boolean check_vowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

