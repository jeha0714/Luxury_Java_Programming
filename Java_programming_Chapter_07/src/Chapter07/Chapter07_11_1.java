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
		
		v.add(new Nation("�׸���", "���׳�"));
		v.add(new Nation("����", "�Ͼ��"));
		v.add(new Nation("�Ϻ�", "����"));
		v.add(new Nation("�߱�", "�ϰ�"));
		v.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		v.add(new Nation("����", "����"));
		v.add(new Nation("������", "�ĸ�"));
		v.add(new Nation("�̱�", "������"));
		v.add(new Nation("�����", "���������"));
		
		
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int chooseNum = sc.nextInt();
			
			if (chooseNum == 1) {
				System.out.println("���� " + v.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				
				while (true) {
					System.out.print("����� ���� �Է�" + (v.size()+1) + ">> ");
					String country = sc.next();
					
					if (country.equals("�׸�"))
						break;
					
					String capital = sc.next();
					
					Iterator <Nation> itV = v.iterator();
					int setCode = 0;
					
					while(itV.hasNext()) {
						Nation testN = itV.next();
						if(testN.returnCountry().equals(country)) {
							System.out.println(country + "�� �̹� �ֽ��ϴ�!");
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
					System.out.print(quizN.returnCountry() + "�� ������?");
					
					String quizAnswer = sc.next();
					if (quizAnswer.equals("�׸�"))
						break;
					
					if (quizAnswer.equals(quizN.returnCapital())) {
						System.out.println("����!!");
					}
					else
						System.out.println("�ƴմϴ�!!");
				}
			}
			
			else if (chooseNum == 3) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			else
				System.out.println("��ȣ�� �� �� �����ϼ̽��ϴ�. �ٽ� �������ּ���.");
			
		}
		
		
	}

}
