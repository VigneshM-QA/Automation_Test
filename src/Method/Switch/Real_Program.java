package Method.Switch;

import java.util.Scanner;

public class Real_Program {
    public static void main() {
        // Three browsers chrome, firefox and Edge browsers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("......");
                System.out.println("execute the test cases....");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("......");
                System.out.println("execute the test cases....");
                break;
            case "edge":
                System.out.println("Starting the Edge browser");
                System.out.println("......");
                System.out.println("execute the test cases....");
                break;
            default:
                System.out.println("no Idea, which browser to trigger");
                break;
        }
        sc.close();
    }
}
