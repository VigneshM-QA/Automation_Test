package Method.Operators;

public class Ternary_Exercise {
    public static void main() {
        // If students scores are determined in grade system
        // If student score 90 and above the grade will  be 'A'
        // If student score 80 to 89 the grade will  be 'B'
        // If student score 70 to 79 the grade will  be 'C'
        // If student score 60 to 69 the grade will  be 'D'
        // If student score 50 to 59 the grade will  be 'E'
        // If student score less than 49 the grade will  be 'F'

        int score = 67;
        String result = (score >= 90) ? "A" : (score >=80) ? "B" : (score >= 70) ? "C" : (score >=60) ? "D" : (score >=50) ? "E" : "F" ;
        System.out.println("The Grade is" +result);

        //Another Example Eligible to vote program
        int age = 13;
        String Voting = (age >= 18) ? "Eligible to vote" : "Not-Eligible to vote";
        System.out.println("The Voting status is: " +Voting);
    }
}
