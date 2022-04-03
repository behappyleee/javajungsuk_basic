@FunctionalInterface
interface MyFunction {
	void run();  // public abstract void run();
}

// Lambda Expression 
// 함수 (메서드)를 간단한 식(expression) 으로 표현 하는 방법
// 람다식은 익명 함수
// 일반 함수 --> 람다식 변경 방법 = 반환 타입, 이름을 지움 
// 함수와 메서드의 차이는 근본적으로 동일 하지만 메서드는 객체지향개념 용어, 함수는 일반적 용어
// 클래스 안에 있으면 메서드(클래스 안에 종속적) 클래스 안에 포함되지 않은 것은 함수 (클래스에서 독립적)
// 반환값이 있는 경우 식이나 값만 적고 return 문 생략 가능 (끝에 ; 을 붙이지 않음)

// 람다식 작성 시 주의 사항 


class Ex14_1 {
	static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
		f.run();
	}

	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드 
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = ()-> System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() {  // 익명클래스로 run()을 구현
			public void run() {   // public을 반드시 붙여야 함
				System.out.println("f2.run()");
			}
		};

		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute( ()-> System.out.println("run()") );
	}
}