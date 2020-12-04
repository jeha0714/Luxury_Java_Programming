package Chapter07;

import java.util.*;

public class Chapter07_04 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int sayNum = sc.nextInt();
			
			if (sayNum == 0)
				break;
			
			v.add(sayNum);
			
			Iterator<Integer> it = v.iterator();
			
			int average = 0;
			while(it.hasNext()) {
				int n = it.next();
				average += n;
				System.out.print(n + " ");
			}
			System.out.println("");
			System.out.println("현재 평균 " + average/ v.size());
			
		}

	}


}
