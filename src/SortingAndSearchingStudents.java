/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author johnr
 */
public class SortingAndSearchingStudents {

    public static void main(String[] args) {
        Student s = new Student("Joe", 10, 4.2);
        Student s1 = new Student("Sally", 12, 4.2);
        Student s2 = new Student("Bill", 9, 4.2);
        Student [] students = {s, s1, s2};
        dumbBubbleSortByGrade(students);
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].getGrade());
        }
    }
    
    public static void dumbBubbleSortByGrade(Student[] studentArray) {
        for (int pass = 0; pass < studentArray.length - 1; pass++) {
            //The outer loop will achieve the bubbling up of the highest number each pass
            for (int i = 0; i < studentArray.length - 1; i++) {
                // The inner loop of "neighbor comparisons" get shorter by one each time (because of intArray.length -1)
                if (studentArray[i].getGrade() > studentArray[i + 1].getGrade()) {  //The "neighbor comparison"
                    //Swap
                    Student temp = studentArray[i];        //To understand the need for temp, imagine trying to swap two glasses of
                    studentArray[i] = studentArray[i + 1];   //juice...you will need a third glass.
                    studentArray[i + 1] = temp;
                }
            }
        }

    }

    public int binarySearch(int arr[], int key) {
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
