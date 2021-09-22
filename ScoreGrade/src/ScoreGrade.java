
public class ScoreGrade {
	double[] testScore,
		average;
	
	ScoreGrade(double[] testScore) {
		this.testScore = testScore;
	}
	
	double calcAverage() {
		double sum=0;
		for(double x : testScore) sum+=x;
		return sum/5;
	}
	
	char determineGrade(double score) {
		if (score >= 90 && score <= 100) 
			return 'A';
		else if (score >= 80 && score < 90)
			return 'B';
		else if (score >= 70 && score < 80)
			return 'C';
		else if (score >= 60 && score < 70)
			return 'D';
		else if (score >= 0 && score < 60)
			return 'F';
		else
			return '\0';
	}

}
