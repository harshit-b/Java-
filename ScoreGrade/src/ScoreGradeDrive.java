import java.util.Scanner;

public class ScoreGradeDrive {

	public static void main(String[] args) {
		double score[] = new double[5];
		double average;
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Please enter Test Score " + (i+1) + " : ");
			score[i] = input.nextDouble();
		}
		
		ScoreGrade scores = new ScoreGrade(score);
		
		for(int i=0; i<5; i++) {
			System.out.println("The letter grade of Test Score " + (i+1) + " : " + scores.determineGrade(score[i]));
		}
		
		average = scores.calcAverage();
		System.out.println("The letter grade of the average score : " + scores.determineGrade(average));
	}

}
