package ifexample;

import java.util.*;

public class IfExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("점수" : " + score);
		System.out.println("학점 : " + grade);
		
		
	}

}
