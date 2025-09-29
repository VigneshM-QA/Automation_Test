package Method.If_Else;

import Method.Parsing.Parseint;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        // If age > 18, allowed to vote
       // int age = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age >18) {
            System.out.println("Allowed to vote");
        }
            else{
                System.out.println("Not allowed to vote");
            }
        }
    }
