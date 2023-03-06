import java.util.*;


import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        System.out.println("Please enter quiz grade 0 to 100.");
        System.out.println("To end the program enter 999.");
        Scanner input = new Scanner(System.in);
        int gradePercent = input.nextInt();
        int [] grade = new int[gradePercent];

        while(gradePercent >=10) {
            System.out.println("Enter the grade: ");
        }\
    }
}
























        {
            System.out.println("Please enter test scores that range from 0 to 100.");
            System.out.println("To end the program enter 999.");
            System.out.println();  // print a blank line
            Scanner sc = new Scanner(System.in);
            String choice = "y";


            while (!choice.equalsIgnoreCase("n"))
            {
                int scoreTotal = 0;
                int scoreCount = 0;
                int testScore = 0;
                System.out.println("Enter the number of test score to be entered: ");
                int numberOfTestScores = sc.nextInt();

                for (int i = 1; i <= numberOfTestScores; i++)
                {

                    System.out.print("Enter score " + i + ": ");
                    testScore = sc.nextInt();

                    if (testScore <= 100)
                    {
                        scoreCount = scoreCount + 1;
                        scoreTotal = scoreTotal + testScore;


                    }
                    else if (testScore > 100)
                        System.out.println("Invalid entry, not counted");
                }

                double averageScore = scoreTotal / scoreCount;
                String message = "\n" +
                        "Score count:   " + scoreCount + "\n"
                        + "Score total:   " + scoreTotal + "\n"
                        + "Average score: " + averageScore + "\n";
                System.out.println(message);
                System.out.println();
                System.out.println("Enter more test scores? (y/n)");
                choice= sc.next();
            }
        }
    }
}







