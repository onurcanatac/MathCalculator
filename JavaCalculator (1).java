import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double quizSum;
        double hwSum;
        double midtermGrade;
        double sum;

        System.out.print("Quiz sum: ");
        quizSum = scan.nextDouble();
        System.out.println();

        System.out.print("Homework sum: ");
        hwSum = scan.nextDouble();
        System.out.println();

        System.out.print("Midterm grade: ");
        midtermGrade = scan.nextDouble();
        System.out.println();

        sum = quizSum + hwSum + midtermGrade * 0.4;

        findNeededPoints("D",30,sum);
        findNeededPoints("D+",40,sum);
        findNeededPoints("C-",45,sum);
        findNeededPoints("C",50,sum);
        findNeededPoints("C+",55,sum);
        findNeededPoints("B-",60,sum);
        findNeededPoints("B",65,sum);
        findNeededPoints("B+",70,sum);
        findNeededPoints("A-",75,sum);
        findNeededPoints("A",80,sum);

        scan.close();
    }

    public static void findNeededPoints(String letterGrade, int borderOfGrade, double sum)
    {
        System.out.println("For " + letterGrade + " you need " + (borderOfGrade - sum) * 2.5 + " points in the final exam.");
    }
}
