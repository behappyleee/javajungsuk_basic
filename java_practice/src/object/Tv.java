package object;

public class Tv {

	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	};
	
	void channelUp() {
		channel++;
	};
	
	void channelDown() {
		channel--;
	};
	
	public static void main(String[] args) {
		// Ŭ������ ����Ϸ��� �ν��Ͻ��� ������ �Ͽ��� ��
		// �ν��Ͻ��� ���������� ���Ͽ����� �ٷ� �� ������, ���������� Ÿ���� �ν��Ͻ��� Ÿ�԰� ��ġ�Ͽ��� ��
		Tv tv = new Tv();
		tv.channel = 7;
		tv.channelDown();
		tv.power();
		
		// tv �� ���� �Ǿ��ִ� �������� �ּ� ������ tv �ν��Ͻ��� �����Ͽ� channel �Ӽ� ���� ������
		System.out.println("���� ä���� : " + tv.channel);
		
		// tv2 �� ���� �ν��Ͻ��� �����ϱ� �� �̶� ����� �Ұ�
		Tv tv2 ;
		
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		
		// t3 �� �������� �̹Ƿ� �ν��ϼ� �ּҰ��� ������ �ϰ� ����
		// t4 ���� ������ �ִ� �������� ���� �Ҿ�����Ƿ� t4 �� �����ϰ��ִ� �ν��Ͻ���
		// �� �̻� ����� �� ���� �� (�ڽ��� �����ϰ� �ִ� �ϳ��� ���� �ν��Ͻ��� ������ �÷��Ϳ�����
		// �ڵ������� �޸𸮿��� ���� ��
		
		// ������������ �ϳ��� �� ���� ���� �� �� ����, �ϳ��� �������� ���� �� �̻���
		// �ν��Ͻ��� ����Ű�� ���� �Ұ��� �� 
		t4 = t3;
		
		// ���� ���� ��ü�� �ٷ��� �� �� ��ü �迭�� �ٷ�� ���� ���� ����� �ϳ���
		Tv tv5, tv6, tv7;
		Tv [] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
	}
	
}


