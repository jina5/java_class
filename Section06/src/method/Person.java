package method;

/* 
 * Person은 이름과 나이, 먹은 음식 내용을 가지고 있음
 * 생성자에서는 이름과 나이를 외부에서 받아서 초기화
 * 먹은 음식 내용은 빈문자열("")로 초기화
 */
public class Person {

	String name;
	int age;
	String food;

	//생성자 alt+shift+s -> o
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		food = "";
	}

	/*
	 * 메서드(method) - 기능 작성 
	 * 리턴타입 메서드명(매개변수...) 
	 * 실행할 코드; 
	 * [return 결과값;]
	 */

	/*
	 * 필드의 name과 age를 이용하여 Person에 정보를 출력 
	 * 이름 : ㅇㅇㅇ 나이 : ㅇㅇ
	 */


	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
/*
 * 나이 값을 외부로 부터 받아서 field에 있는 age에 저장하는 메서드
 * 단 나이를 외부에서 받아서 저장할 때는 
 * 받아온 나이값이 0보다 큰 값만 저장
 * 만약 0이하의 값이 들어오면 저장을 못하게 처리
 */
	
	void setAge(int n) {
		if (n>0) 
			age=n;
	}
	
// 다른방법
	void setAge2(int n) {
		if(n<1)
			return; //if - return : 메서드 종료
		age=n;
	}

	/* 외부로부터 먹은 음식을 받아서 
	 * food 문자열 끝에 붙여서 저장
	 */
	void setFood(String m) {
		food+=m+" ";
		//food=food+" "
	}
	
	String getFood() {
		return food;
	}
	
}
