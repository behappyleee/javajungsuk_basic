class Ex6_1 { 
	
	class Unit {
		
	}
	
	public void testVoid() {
		int a = 10;
		return;
	}
	
	public Unit te2stVoid() {
		Unit u = new Unit();
		return u;
	}
	
	public static void main(String args[]) { 
		
		String ab = "TEST 1";
		String c = "TEST 2";
		
		c = ab;
		ab = "TEST 3";
		
		System.out.println(c);
		
		Tv t;                 // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����       
		t = new Tv();         // Tv�ν��Ͻ��� �����Ѵ�. 
		t.channel = 7;        // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�. 
		t.channelDown();      // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�. 
		System.out.println("���� ä���� " + t.channel + " �Դϴ�."); 
	} 
}

class Tv { 
	// Tv�� �Ӽ�(�������)   
	String color;           // ���� 
	boolean power;         	// ��������(on/off) 
	int channel;           	// ä�� 

	// Tv�� ���(�޼���) 
	void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
	void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
	void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
}