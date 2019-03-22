/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnr
 */
public class ForTestingStepThrough {

    public static void main(String[] args) {
        String[] names = {"Zoey", "Bob", "Sam", "Anne", "John"};
        sortOfStrings(names); 
        int resultString = binarySearchOfStrings(names, "Anne");
        if (resultString == -1) {
            System.out.println("The item is not in th database");
        }
        else{
            System.out.println("The item is in the database at element # " + resultString);
        }
        
        
        int[] arr = {23, 54, 234, 97, 234, 97};
        sortOfInts(arr);
        int result = binarySearchOfInts(arr, 54);
        if (result == -1) {
            System.out.println("The item is not in th database");
        }
        else{
            System.out.println("The item is in the database at element # " + result);
        }
    }
    
        public static void sortOfStrings(String[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int minIndex = i;      // Assumed index of smallest remaining value.
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j].compareToIgnoreCase(intArray[minIndex]) < 0) {
                    minIndex = j;  // Remember index of new minimum
                }
            }
            if (minIndex != i) {
                //Exchange current element with smallest remaining.
                //But note that this only happens once each outer loop iteration, at the end of the inner loop's looping
                String temp = intArray[i];
                intArray[i] = intArray[minIndex];
                intArray[minIndex] = temp;
            }
        }
    }

    public static int binarySearchOfStrings(String arr[], String key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {               // Keep on looking for the key until the low and the high cross each other - if that does happen, it means the key was not found.
            int mid = (low + high) / 2;
            if (arr[mid].equalsIgnoreCase(key)) {
                return mid;               // This is what will happen if/when we find the key in the array.
            } else if (arr[mid].compareToIgnoreCase(key) < 1) {
                low = mid + 1;            // since the arr[mid] value is less than the key, we can eliminate looking at the left side of the remaining elements
            } else {
                high = mid - 1;            // i.e. the arr[mid] value is greater than what we are looking for, so we can eliminate looking at the right side of the remaining elements
            }
        }
        return -1;
    }
    
    
    
    
    

    public static void sortOfInts(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int minIndex = i;      // Assumed index of smallest remaining value.
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[minIndex]) {
                    minIndex = j;  // Remember index of new minimum
                }
            }
            if (minIndex != i) {
                //Exchange current element with smallest remaining.
                //But note that this only happens once each outer loop iteration, at the end of the inner loop's looping
                int temp = intArray[i];
                intArray[i] = intArray[minIndex];
                intArray[minIndex] = temp;
            }
        }
    }

    public static int binarySearchOfInts(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {               // Keep on looking for the key until the low and the high cross each other - if that does happen, it means the key was not found.
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;               // This is what will happen if/when we find the key in the array.
            } else if (arr[mid] < key) {
                low = mid + 1;            // since the arr[mid] value is less than the key, we can eliminate looking at the left side of the remaining elements
            } else {
                high = mid - 1;            // i.e. the arr[mid] value is greater than what we are looking for, so we can eliminate looking at the right side of the remaining elements
            }
        }
        return -1;
    }

}
