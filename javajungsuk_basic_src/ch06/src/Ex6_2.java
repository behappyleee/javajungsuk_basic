class Ex6_2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();�� �� �������� ����
		Tv t2 = new Tv();
		
		System.out.println("TV1 �� �ּ� �� �ؽ� �� : " + t1.toString());
		System.out.println("TV �� �ּҰ� ? �ؽ� �� : " + t2.toString());
		
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		t1.channel = 7;    // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");

		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	
		// ��ü �迭�� ���� Ÿ���� ��ü�� ������ ����
		ObjectArray[] arrayTest = new ObjectArray[3];
		ObjectArray[] arrayTest_1 = {new ObjectArray(), new ObjectArray(), new ObjectArray()}; 
		
		
		// ���α׷��� ���� ������ ó���� ���� ������ ���� ������ ����
		// ���� --> �迭 --> ����ü --> Ŭ����
		
		TvTest tvT = new TvTest();
		tvT.volumeUp();
		tvT.volumeUp();
		// System.out.println(tvT.volume);
	
		InstanceTest ins = new InstanceTest();
		
		System.out.println(InstanceTest.testIns);
		
		System.out.println(ins.testIns);
		
		InstanceTest ins1 = new InstanceTest();
		
		ins1.testInsPlus();
		
		// Ŭ���� ������ ��� ��ü�� ���� ���� �� !!!
		System.out.println(ins.testIns);
		
	}
	
}

class InstanceTest {
	static int testIns = 2;		// Ŭ���� ���� ���� !
	public static void testInsPlus() {
		testIns++;
	}
}



class TimeTest {
	int seconds;
	int minutes;
	int hours;
	
	
	
	
}



class TvTest {
	int volume;
	void volumeUp() {
		++volume;
	}
	
}



class ObjectArray {
	
}


