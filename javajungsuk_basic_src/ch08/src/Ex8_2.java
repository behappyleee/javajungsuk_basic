import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Properties;

class Ex8_2 {
	public static void main(String args[]) throws SocketException {
			
		DatagramSocket ds = new DatagramSocket();
		ds.connect(new SocketAddress(){});
		Properties prop = new Properties();
		
		String test = "testString";
		test.getBytes();
	
		
		System.out.println(1);
			try {
				System.out.println(0/0);
				System.out.println(2); 	// ������� �ʴ´�.
			} catch (ArithmeticException ae)	{
				ae.printStackTrace();
				System.out.println(3);
			}	// try-catch�� ��
			System.out.println(4);
	}	// main�޼����� ��	
}
