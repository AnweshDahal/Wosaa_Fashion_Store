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
         * Binary Search to find the index of the price in the sorted list
         */
        
        if (low <= high){
            int mid = (low + high) / 2; // Gets the midpoint of the Array
            if (Integer.parseInt((String)array[mid][6]) == find){
                // if the item at midpoint is the required item, 
                // return the index
                return mid;
            } else if (Integer.parseInt((String)array[mid][6]) > find){
                // if the item at midpoint is larger than the item required
                // assigns the value of the midpoint + 1 to high
                high = mid - 1;
            } else if (Integer.parseInt((String)array[mid][6]) < find){
                // if the item at midpoint is lower than the required item
                // assign the value of midpoint -1 to low
                low = mid + 1;
            }
            // loops recursively until either
            // item at midpoint equals the required item
            // or low >= high
            return search(array, low, high, find);
        } else {
            // if low >= high returns -1
            // indicating item not found
            return -1;
        }
    }
}
