package Chapter07;

import java.util.*;

class Nation{
	String country;
	String capital;
	
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	
	String returnCountry () {
		return country;
	}
	
	String returnCapital() {
		return capital;
	}
	
}

public class Chapter07_11_1 {

	public static void main(String[] args) {
		
		Vector<Nation> v = new Vector<Nation>();
		Scanner sc = new Scanner(System.in);
		
		v.add(new Nation("그리스", "아테네"));
		v.add(new Nation("독일", "하얼빈"));
		v.add(new Nation("일본", "도쿄"));
		v.add(new Nation("중국", "북경"));
		v.add(new Nation("멕시코", "멕시코시티"));
		v.add(new Nation("영국", "런던"));
		v.add(new Nation("프랑스", "파리"));
		v.add(new Nation("미국", "워싱턴"));
		v.add(new Nation("브라질", "브라질리아"));
		
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int chooseNum = sc.nextInt();
			
			if (chooseNum == 1) {
				System.out.println("현재 " + v.size() + "개 나라와 수도가 입력되어 있습니다.");
				
				while (true) {
					System.out.print("나라와 수도 입력" + (v.size()+1) + ">> ");
					String country = sc.next();
					
					if (country.equals("그만"))
						break;
					
					String capital = sc.next();
					
					Iterator <Nation> itV = v.iterator();
					int setCode = 0;
					
					while(itV.hasNext()) {
						Nation testN = itV.next();
						if(testN.returnCountry().equals(country)) {
							System.out.println(country + "는 이미 있습니다!");
							setCode = 1;
							break;
							
						}
					}
					
					if (setCode == 1)
						continue;
					else {
						v.add(new Nation(country, capital));
					}
					
				}
			}
			
			else if (chooseNum == 2) {
				for (;;) {
					int random = (int) (Math.random()*v.size());
					Nation quizN = v.get(random);
					System.out.print(quizN.returnCountry() + "의 수도는?");
					
					String quizAnswer = sc.next();
					if (quizAnswer.equals("그만"))
						break;
					
					if (quizAnswer.equals(quizN.returnCapital())) {
						System.out.println("정답!!");
					}
					else
						System.out.println("아닙니다!!");
				}
			}
			
			else if (chooseNum == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			else
				System.out.println("번호를 잘 못 선택하셨습니다. 다시 선택해주세요.");
			
		}
		
		
	}

}
