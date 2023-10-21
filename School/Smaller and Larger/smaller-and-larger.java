//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().getMoreAndLess(arr, n, x);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        // int x=0;
        // int y=0;
        // int start=0;
        // int end = n-1;
        // while(start<end){
        //     int mid=start+(end-start)/2;
        //     if(arr[mid]==k){
        //         x=mid-1;
        //         y=n-mid;
        //         return new int[]{x,y};
        //     }
        //     else if(arr[mid]<x){
        //         mid=start+1;
        //     }else{
        //         mid=end-1;
        //     }
        // }
        // return new int[]{0,0};
        
         int c1=0; 
         int c2=0;
        
        for(int i = 0; i<n; i++){
            if(arr[i] <= x){
                c1++;
            }
            
            if(arr[i] >= x){
                c2++;
            }
        }
          return new int[]{c1,c2};
    }
}