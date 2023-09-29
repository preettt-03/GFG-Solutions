//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
        int search(int arr[], int start, int end, int k){
        if(end < start) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid] == k) return mid;
        else if(k < arr[mid]){
            return search(arr,start,mid-1,k);
        }
        else{
            return search(arr,mid +1,end,k);
        }
    }
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start=0;
        int end=arr.length-1;
        int ans = search(arr,start,end,k);
        return ans;
 
    }
}