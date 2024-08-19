package ch02.sec01;

public class VariavleInitializationExample {
	public static void main(String[] args)
	{
		int value;
		
		int result = value + 10;
		//초기화되지 않은 변수는 아직 메모리에 할당되지 않았기 때문에 변수를 통해 메모리 값을 읽을 수 없어서 컴파일 오류 발생
		
		System.out.println(result);
	}
}
