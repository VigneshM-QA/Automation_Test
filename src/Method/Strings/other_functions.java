package Method.Strings;

import java.sql.SQLOutput;

public class other_functions {
    public static void main(String[] args) {
        String s1 = "Vicky is a good boy";
        String s2 = s1.substring(11, 15); // portion of a string is captured  by substring based on index
        System.out.println(s2);

        String s3 = "work";
        String s4 = s3.concat(" hard"); //concatenation
        System.out.println(s4);

        String fruits = "Apple, Orange, Banana";
        String[] split_string = fruits.split(",");
        System.out.println(split_string[0]);
        System.out.println(split_string[1]);
        System.out.println(split_string[2]);

        String s5 = "Success";
        System.out.println(s5.charAt(3));
        //  System.out.println(s5.charAt(10));  // String out of bound exception

        String ex = "  Sample  ";
        System.out.println(ex.trim());  // removing space

        String check = "Book";
        System.out.println(check.indexOf("k"));
        System.out.println(check.indexOf("o"));
        System.out.println(check.lastIndexOf("o"));

        String find = "this book is very informative";
        System.out.println(find.contains("very"));
        System.out.println(find.contains("z"));

        String s6 = "Sample";
        System.out.println(s6.replace('a', 'u'));

        String sentence = "Reaching the destination";
        System.out.println(sentence.startsWith("Rea"));
        System.out.println(sentence.endsWith("tion"));
        System.out.println(sentence.startsWith("rea")); //false based on  case-sensitive

        String seq = " Hello 123 World 3345";
        String result = seq.replaceAll("\\d", ""); // removing the numbers
        String result1 = seq.replaceAll("\\s", ""); // removing the space
        System.out.println(result);
        System.out.println(result1);


    }
}
