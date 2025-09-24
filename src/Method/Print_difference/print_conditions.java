package Method.Print_difference;

public class print_conditions {
    public static void main() {
        String a = "Hello world";
        System.out.println(a); // print in next line
        System.out.println();

        int b = 23;
        System.out.print(b); // print as it is in same line
        System.out.println();

        int c = 34;
        System.out.printf("My age is:%d" , c);// printf is a formatting condition whereas it will replace with the %d value
        System.out.println();

        String d = "Vicky";
        System.out.printf("My Name is: %s", d ); // it will format into string value with %s
        System.out.println();

        long phone_number = 98765432l ;
        System.out.printf("My mobile number is: %d", phone_number); // it will format into a number as a long
        System.out.println();

        boolean pass = true;
        System.out.printf("Subject Pass: %b", pass); // it will format into a boolean
        System.out.println();

    }
}
