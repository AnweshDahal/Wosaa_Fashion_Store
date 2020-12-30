package wosaa_fashion_store_is;

/**
 *
 * @author Anwesh Dahal
 */
public class MergeSorter {
    public static void sort(Object[][] mainArray){
        if (mainArray.length <= 1){
            // if the length of the main array is less than one then the method is terminated from here
            return;
        }
        
        Object[][] firstArray = new Object[mainArray.length / 2][7];
        Object[][] secondArray = new Object[mainArray.length - firstArray.length][7];
        
        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = mainArray[i];
        }
        
        for (int i = 0; i < secondArray.length; i++){
            secondArray[i] = mainArray[firstArray.length + i];
        }
        
        sort(firstArray);
        sort(secondArray);
        
        merge(firstArray, secondArray, mainArray);
    }
    
    private static void merge(Object[][] firstArray, Object[][] secondArray, Object[][] mainArray){
        int indexFirstArray = 0;
        int indexSecondArray = 0;
        int indexMainArray = 0;
        
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
        
        while (indexFirstArray < firstArray.length){
            mainArray[indexMainArray] = firstArray[indexFirstArray];
            indexFirstArray++;
            indexMainArray++;
        }
        
        while(indexSecondArray < secondArray.length){
            mainArray[indexMainArray] = secondArray[indexSecondArray];
            indexSecondArray++;
            indexMainArray++;
        }
    }
}
