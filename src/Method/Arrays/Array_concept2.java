package Method.Arrays;

public class Array_concept2 {
    public static void main(String[] args) {
        int[] marks = new int[5]; // fixed length
        marks[0] = 78;
        marks[1] = 90;
        marks[2] = 89;
        marks[3] = 67;
        marks[4] = 56;
        //  marks[5] = 45; // Index out of bound exception  ---> because fixed length is 5 so index value should 0 to 4
        System.out.println(marks[4]);
        System.out.println(marks[2]);
        //   System.out.println(marks[-2]); // index out of bound
        System.out.println(marks[20]); // index out of bound

    }
}
