package ifexample;

import java.util.*;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rank = sc.nextInt();
		char medalColor;
		
		 switch(rank) {
		 	case 1: medalColor = 'G';
		 		System.out.println("�ݸ޴�");
		 		break;	
		 	case 2: medalColor = 'S';
		 		System.out.println("���޴�");
		 		break;
		 	case 3: medalColor = 'B';
		 		System.out.println("���޴�");
		 		break;
		 	default : medalColor = 'A';
		 }
		 System.out.println(rank + "���� " + medalColor + "�޴� �Դϴ�.");
	}

}
