package sec02.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;//메소드 블록에서 선언
		if(v1>10) {
			int v2;// if 블록에서 선언
			//v1과 v2 사용 가능
			v2 = v1 - 10;
		}
// int v3 = v1 + v2 +5;
//v2 변수를 사용 못함=v2를 해석할 수 없다는 에러
	}

}
