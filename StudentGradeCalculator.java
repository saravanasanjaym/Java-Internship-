import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects that you have: ");
        int NoOfSubjects = scanner.nextInt();
        
        
        int[] Marks = new int[NoOfSubjects];
        
        for (int i = 0; i < NoOfSubjects; i++) {
            System.out.print("Enter the mark for subject " + (i + 1) + ": ");
            Marks[i] = scanner.nextInt();
        }

        int SumOfMarks = 0;

        for (int i = 0; i < NoOfSubjects; i++) {
            SumOfMarks += Marks[i];
        }

	
	double AverageOfMarks = (double) SumOfMarks / NoOfSubjects;
	String grade;
	
        if (AverageOfMarks >= 90) {
        grade = "O Grade";

        } else if (AverageOfMarks >= 80) {
        grade = "A+ Grade";

        } else if (AverageOfMarks >= 70) {
        grade = "A Grade";

        } else if (AverageOfMarks >= 60) {
        grade = "B+ Grade";

        } else if (AverageOfMarks >= 50) {
        grade = "B Grade";

        } else if (AverageOfMarks >= 40) {
        grade = "C Grade";

        } else {
        grade = "Sorry you have failed";
        }

	System.out.println("================RESULT==================");
        System.out.println("Total Marks        : " + SumOfMarks);
        System.out.println("Average Percentage : " + AverageOfMarks);
        System.out.println("Result             : " + grade);
    }
}