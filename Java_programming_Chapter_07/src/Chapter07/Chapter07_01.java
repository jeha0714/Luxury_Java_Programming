package Chapter07;

import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

public class Chapter07_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		
		int n ;
		System.out.print("����(-1�� �Էµ� ������)>> ");
		while(true) {
			n = sc.nextInt();
			
			if (n == (-1))
				break;
			
			v.add(n);
			
		}
		
		Iterator<Integer> it = v.iterator();
		int highNum = v.get(0);
		
		while(it.hasNext()) {
			int cNum = it.next();
			if (highNum < cNum)
				highNum = cNum;
		}
		
		System.out.println("���� ū ���� " + highNum);
		
		
		sc.close();
	}

}
