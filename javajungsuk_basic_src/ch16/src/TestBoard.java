import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestBoard {

	String test = "enumTest";
	SeasonTest testEnum = null;
	
	public TestBoard() {
		testEnum =  SeasonTest.°¡À»;
	
		for(SeasonTest season : SeasonTest.values()) {
			System.out.println(season);
		}
	
	
	}
	
	public void testEnum() {
		
	}
	
	
	public static void main(String[] args) {
		TestBoard aaa = new TestBoard();
		 
		String test = "test";
		
		// Stream a = new Stream<String>();
		
		Stream aStream = (Stream) test.chars();
		Stream testFilter = aStream.filter(a -> test.contains("test"));
		List<String> testList = new ArrayList<>();
		Stream listStream = testList.stream();
		
		// listStream.forEach(null);
			
		
		System.out.println("test Filter : "  + testFilter.toString());
		
		
		
		
		//	test.stream();
	
	
	
	}
	
	public @interface myAnnotation {
		
	}
	
	
}
