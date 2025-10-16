package Method.Arrays;

public class Array_concept {
    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50};
        // index 0 to 4
        // collection of similar datatype (creation with pre-defined elements)
        System.out.println(marks[2]);
        System.out.println(marks[4]);
      //  System.out.println(marks[10]); // Array index out of bound exception

        System.out.println(marks.length); // length always starts with 1
        System.out.println(marks.length-1);
        System.out.println(marks[marks.length-1]); // lenght -1 -> 4 then marks[4] denotes the 4 th index so value is 50
    }
}
