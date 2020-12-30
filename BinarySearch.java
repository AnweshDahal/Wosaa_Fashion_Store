/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wosaa_fashion_store_is;

/**
 *
 * @author Anwesh Dahal
 * @universityID 19030735
 */
public class BinarySearch {
    public static int search(Object[][] array, int low, int high, int find){
        /**
         * Binary Search to find the index of the price in 
         */
        if (low <= high){
            int mid = (low + high) / 2;
            if (Integer.parseInt((String)array[mid][6]) == find){
                return mid;
            } else if (Integer.parseInt((String)array[mid][6]) > find){
                high = mid - 1;
            } else if (Integer.parseInt((String)array[mid][6]) < find){
                low = mid + 1;
            }
            return search(array, low, high, find);
        } else {
            return -1;
        }
    }
}
