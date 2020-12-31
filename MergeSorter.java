package wosaa_fashion_store_is;

/**
 *
 * Title: Wosaa Fashion Store Information System
 * Part: Merge Sort
 * @author 19030375 Anwesh Dahal
 * @author 19030875 Bishesh Dangol
 * @author 19031389 Pratik Amatya
 * @author 19031710 Srijan Adhikari
 */
public class MergeSorter {
    /**
     * Sorts the array using merge sort
     * 
     * @param mainArray the array that needs to be sorted
     */
    public static void sort(Object[][] mainArray){
        if (mainArray.length <= 1){
            // if the length of the main array is less than one then the method 
            // is terminated from here
            return;
        }
        
        // The first array and the second Array 
        // is half the size of original array
        Object[][] firstArray = new Object[mainArray.length / 2][7];
        Object[][] secondArray = new Object[mainArray.length - firstArray.length][7];
        
        // Inserting value in first array
        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = mainArray[i];
        }
        
        // Inserting value in second array
        for (int i = 0; i < secondArray.length; i++){
            secondArray[i] = mainArray[firstArray.length + i];
        }
        
        // Breaks the arrays until their length is 1
        sort(firstArray);
        sort(secondArray);
        
        // merges the firstArray and secondArray into mainArray
        merge(firstArray, secondArray, mainArray);
    }
    
    /**
     * Sorts the main array by merging the firstArray and the secondArray
     * 
     * @param firstArray the array containing 1st 1/2 of main array
     * @param secondArray the array containing 2nd 1/2 of main array
     * @param mainArray the target array that needs to be sorted
     */
    private static void merge(Object[][] firstArray, Object[][] secondArray, Object[][] mainArray){
        int indexFirstArray = 0;
        int indexSecondArray = 0;
        int indexMainArray = 0;
        
        // Compares the elements of the first/ second row and
        // sorts them in the main array until the End of Index is reached
        // in any one of the array
        while (indexFirstArray < firstArray.length && indexSecondArray < secondArray.length){
            if(Integer.parseInt((String)firstArray[indexFirstArray][6]) < Integer.parseInt((String)secondArray[indexSecondArray][6])){
                mainArray[indexMainArray] = firstArray[indexFirstArray];
                indexFirstArray++;
            } else{
                mainArray[indexMainArray] = secondArray[indexSecondArray];
                indexSecondArray++;
            }
            indexMainArray++;
        }
        
        /**
         * if all the elements of firstArray is added in the mainArray
         * then Loop B is executed else Loop A is executed
         */
        
        // Loop A
        // adds the remaining element of the first array to the main array
        while (indexFirstArray < firstArray.length){
            mainArray[indexMainArray] = firstArray[indexFirstArray];
            indexFirstArray++;
            indexMainArray++;
        }
        
        // Loop B
        // adds the remaining element of the second array to the main array
        while(indexSecondArray < secondArray.length){
            mainArray[indexMainArray] = secondArray[indexSecondArray];
            indexSecondArray++;
            indexMainArray++;
        }
    }
}
