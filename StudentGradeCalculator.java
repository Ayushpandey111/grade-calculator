import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalScore = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the score for Subject " + i + ": ");
            double subjectScore = scanner.nextDouble();
            totalScore += subjectScore;
        }

        double averageScore = totalScore / numSubjects;
        char letterGrade = calculateLetterGrade(averageScore);

        System.out.println("Average Score: " + averageScore);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }

    public static char calculateLetterGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}