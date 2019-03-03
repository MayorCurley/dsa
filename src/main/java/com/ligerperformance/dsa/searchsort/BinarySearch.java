/**
 * 
 */
package com.ligerperformance.dsa.searchsort;

import java.util.Arrays;

/**
 * Perform a binary search on a sorted array
 * 
 * @author Mayor Curley
 *
 */
public class BinarySearch {

    /**
     * 
     */
    public int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    }
    
    /**
     * driver method for testing
     * 
     * @param args
     */
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        //int arr[] = { 2, 3, 4, 10, 40 };
        int [] arr = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(arr);
        System.out.println("Completely Sorted: " + Arrays.toString(arr));
        int n = arr.length; 
        int x = 32; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 

}
