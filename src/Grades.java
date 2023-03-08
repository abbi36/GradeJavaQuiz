import java.util.Scanner;
public class Grades {

    public static void main(String[] args) {

        {
            System.out.println("Please enter test scores that range from 0 to 100.");
            Scanner sc = new Scanner(System.in);
            String choice = "y";


            while (!choice.equalsIgnoreCase("n")) {
                int scoreTotal = 0;
                int scoreCount = 0;
                int testScore = 0;
                String letterGrade = "";
                System.out.println("Enter the number of test scores to be entered: ");
                int numberOfTestScores = sc.nextInt();

                for (int i = 1; i <= numberOfTestScores; i++) {

                    System.out.print("Enter score " + i + ": ");
                    testScore = sc.nextInt();

                    if (testScore <= 100) {
                        scoreCount = scoreCount + 1;
                        scoreTotal = scoreTotal + testScore;


                    } else if (testScore > 100)
                        System.out.println("Invalid entry, not counted");
                }

                int averageScore = scoreTotal / scoreCount;
                if (averageScore >= 90) {
                   letterGrade = "A";
                } else if (averageScore >= 80 && averageScore <90 ) {
                    letterGrade = "B";
                } else if (averageScore >=70 && averageScore <80) {
                    letterGrade = "C";
                } else if (averageScore >=60 && averageScore <70) {
                    letterGrade = "D";
                } else {
                    letterGrade = "F";
                }





                String message = "\n" +
                        "Score count:   " + scoreCount + "\n"
                        + "Score total:   " + scoreTotal + "\n"
                        + "Average score: " + averageScore + "\n"
                        + "You earned  a " +letterGrade + "!!! And, shout out to Katy, my inspiration!";
                System.out.println(message);
                System.out.println("Enter more test scores? (y/n)");
                choice = sc.next();
            }

        }
    }
}
