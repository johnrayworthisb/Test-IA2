/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnr
 */
public class AnotherSortAndSearch {
    // This is my array

    public void selectionSortByStudent(Student [] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            // Assume first element is min
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getName().compareTo(arr[min].getName()) < 0) {
                    min = j;

                }
            }
            if (min != i) {
                final Student temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            System.out.println(arr[i]);// I print the in ascending order
        }
    }

}
