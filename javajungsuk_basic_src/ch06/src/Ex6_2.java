class Ex6_2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		
		System.out.println("TV1 의 주소 값 해쉬 값 : " + t1.toString());
		System.out.println("TV 의 주소값 ? 해쉬 값 : " + t2.toString());
		
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		t1.channel = 7;    // channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	
		// 객체 배열도 같은 타입의 객체만 저장이 가능
		ObjectArray[] arrayTest = new ObjectArray[3];
		ObjectArray[] arrayTest_1 = {new ObjectArray(), new ObjectArray(), new ObjectArray()}; 
		
		
		// 프로그래밍 언어에서 데이터 처리를 위한 데이터 저장 형태의 발전
		// 변수 --> 배열 --> 구조체 --> 클래스
		
		TvTest tvT = new TvTest();
		tvT.volumeUp();
		tvT.volumeUp();
		// System.out.println(tvT.volume);
	
		InstanceTest ins = new InstanceTest();
		
		System.out.println(InstanceTest.testIns);
		
		System.out.println(ins.testIns);
		
		InstanceTest ins1 = new InstanceTest();
		
		ins1.testInsPlus();
		
		// 클래스 변수는 모든 객체와 값을 공유 함 !!!
		System.out.println(ins.testIns);
		
	}
	
}

class InstanceTest {
	static int testIns = 2;		// 클래스 변수 선언 !
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


