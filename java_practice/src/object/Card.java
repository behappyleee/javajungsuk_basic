package object;

public class Card {
	
	// �ν��Ͻ� ����
	String kind; 	// ����
	int number;		// tntwk
	
	// Ŭ���� ���� (��� �ν��Ͻ��� ���� ��)
	static int width  = 100;	// ��
	static int height = 250;	// ����
	
	public static void main(String[] args) {
		
		System.out.println("CARD WIDTH : " + Card.width);
		System.out.println("CARD HEIGHT : " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		c1.width = 50;
		c1.height = 80;
		
		// c1 ���� ������ ���� ���� �Ͽ����� Ŭ���� ������ ���� �����Ͽ� c1 c2 width height ���� ��� �ٲ�
		System.out.println("C1 : " + c1.width + " , " + c1.height);
		System.out.println("C1 : " + c2.width + " , " + c2.height);
	
		
		// TODO
		// 249 page �޼��� ���� ���� !!!!
		
	}
	
}
