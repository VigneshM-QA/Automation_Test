package Method;

import java.util.Scanner;

public class Triangle_program {
    public static void main(String[] args) {
        // Check the Triangle which is Equilateral, Isoceles or Isolene
        // 3 sides equal is Equilateral triangle
        // 2 sides equal is Isoceles
        // all different is Isolene
        //Input -> taking 3 Sides as Side1, Side2, Side3
        //Logic
        Scanner sc = new Scanner(System.in);
        System.out.println("The Side1 value is");
        double side1 = sc.nextDouble();
        System.out.println("The Side2 value is");
        double side2 = sc.nextDouble();
        System.out.println("The Side3 value is");
        double side3 = sc.nextDouble();
        //Condition statements
        if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("It is Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("It is Isoceles triange");
        } else {
            System.out.println("It is Isolene triangle");
        }
        sc.close();
    }
}
