package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args)
	{
		int v1=15;
		if(v1>10) {
			int v2=v1-10;
		}
		int v3=v1+v2+5; //v2는 if 블록 안에서 선언이 되었으므로 사용 불가
	}
}
