package Chapter07;

import java.util.*;

public class Chapter07_11_2 {

	public static void main(String[] args) {
		
		HashMap<String, String> maps = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		maps.put("그리스", "아테네");
		maps.put("독일", "하얼빈");
		maps.put("일본", "도쿄");
		maps.put("중국", "북경");
		maps.put("멕시코", "멕시코시티");
		maps.put("영국", "런던");
		maps.put("프랑스", "파리");
		maps.put("미국", "워싱턴");
		maps.put("브라질", "브라질리아");
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int chooseNum = sc.nextInt();
			
			if (chooseNum == 1) {
				System.out.println("현재 " + maps.size() + "개의 나라와 수도가 입력되어 있습니다.");
				
				while (true) {
					System.out.print("나라와 수도입력" + (maps.size() + 1) + ">> ");
					String country = sc.next();
					
					if (country.equals("그만"))
						break;
					
					String capital = sc.next();
					
					if (maps.containsKey(country)) {
						System.out.println(country + "는 이미 있습니다!");
					}
					else
						maps.put(country, capital);
				}
			}
			
			else if (chooseNum == 2) {
				
				Set<String> setKey = maps.keySet();
				Iterator <String> it = setKey.iterator();
				
				while(true) {
					
					String countryWhat = it.next();
					
					System.out.print(countryWhat + "의 수도는?");
					String sayAnswer = sc.next();
					
					if (sayAnswer.equals("그만"))
						break;
					
					if (maps.get(countryWhat).equals(sayAnswer))
						System.out.println("정답!!");
					else
						System.out.println("아닙니다!!");
					
				}
			}
			
			else if (chooseNum == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			else 
				System.out.println("숫자를 잘 못 입력하셨습니다. 다시 입력해주세요.");
			
		}
	}

}
