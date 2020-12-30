package wosaa_fashion_store_is;

/**
 *
 * Title: Wosaa Fashion Store Information System
 * Part: Binary Search
 * @author 19030375 Anwesh Dahal
 * @author 19030875 Bishesh Dangol
 * @author 19031389 Pratik Amatya
 * @author 19031710 Srijan Adhikari
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
