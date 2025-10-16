package Method.Arrays;

import java.util.Arrays;

public class Array_binarysearch {
    public static void main(String[] args) {
        int[] marks = {78, 34, 90, 76, 12};
        // Binary search is used to search an element in a sorted array
        Arrays.sort(marks);
        int item_index = Arrays.binarySearch(marks, 100);
        System.out.println(item_index);

//        marks array: {78, 34, 90, 76, 12}
//        After sorting: {12, 34, 76, 78, 90}
//        You're searching for 100, which does not exist in the array.
//        The Arrays.binarySearch() method returns:
//        The index of the item if found.
//                If not found, it returns (-(insertion point) - 1).
//        In this case, 100 would be inserted after 90 (which is at index 4), so the insertion point is 5.
//        So, result = - (5) - 1 = -6.
    }
}
