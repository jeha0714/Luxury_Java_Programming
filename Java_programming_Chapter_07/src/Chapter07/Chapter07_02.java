package Chapter07;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Chapter07_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arList = new ArrayList<String>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		
		for (int i = 0; i <6 ; i++) {
			String n = sc.next();
			arList.add(n);
		}
		
		double average = 0;
		
		Iterator<String> it = arList.iterator();
		
		for (int i = 0; i < 6 ; i++) {
			String code = it.next();
			
			if(code.equals("A"))
				average += 4.0;
			else if (code.equals("B"))
				average += 3.0;
			else if (code.equals("C"))
				average += 2.0;
			else if (code.equals("D"))
				average += 1.0;
			else
				average += 0.0;
		}
		
		System.out.println(average / 6);
		
		
		
		sc.close();

	}

}
