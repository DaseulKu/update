package chap09.sec02.exam01;

public class Anonymous {
	int field;

	void method(int arg1, int arg2) {
		int var1 = 1;
		int var2 = 2;
//		arg1 = 20; final 특성을 가지고 있어서 매개 변수나 필드 모두 값 수정 불가
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
//		calc.sum(); // 호출만 하면 결과를 사용할 수 없다
		int x = calc.sum(); // 결과를 변수에 저장하면 결과를 사용
		System.out.println(x);
//		System.out.println(calc.sum());, 메서드 호출을 통해 반환된 결과를 바로 출력
	}

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(2, 0);
	}
}
