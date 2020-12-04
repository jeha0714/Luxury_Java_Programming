package Chapter07;

import java.util.*;

public class Chapter07_11_2 {

	public static void main(String[] args) {
		
		HashMap<String, String> maps = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		maps.put("�׸���", "���׳�");
		maps.put("����", "�Ͼ��");
		maps.put("�Ϻ�", "����");
		maps.put("�߱�", "�ϰ�");
		maps.put("�߽���", "�߽��ڽ�Ƽ");
		maps.put("����", "����");
		maps.put("������", "�ĸ�");
		maps.put("�̱�", "������");
		maps.put("�����", "���������");
		
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int chooseNum = sc.nextInt();
			
			if (chooseNum == 1) {
				System.out.println("���� " + maps.size() + "���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				
				while (true) {
					System.out.print("����� �����Է�" + (maps.size() + 1) + ">> ");
					String country = sc.next();
					
					if (country.equals("�׸�"))
						break;
					
					String capital = sc.next();
					
					if (maps.containsKey(country)) {
						System.out.println(country + "�� �̹� �ֽ��ϴ�!");
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
					
					System.out.print(countryWhat + "�� ������?");
					String sayAnswer = sc.next();
					
					if (sayAnswer.equals("�׸�"))
						break;
					
					if (maps.get(countryWhat).equals(sayAnswer))
						System.out.println("����!!");
					else
						System.out.println("�ƴմϴ�!!");
					
				}
			}
			
			else if (chooseNum == 3) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			else 
				System.out.println("���ڸ� �� �� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			
		}
	}

}
