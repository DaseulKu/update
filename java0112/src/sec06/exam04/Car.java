package sec06.exam04;

public class Car {
	int gas;
	
	void setGas(int gas) { // gas 에 값을 준다
		this.gas = gas;
	}
	boolean isLeftGas() { //gas 가 0인지 아닌지
		if(gas==0) {
			System.out.println("gas가 없습니다");
			return false; //메소드 탈출 > 아래 코드 실행 안함
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	void run() { // gas 떨어질 때까지 소진
		while(true) {
			if(gas>0) {
				System.out.println("달립니다 (gas잔량:"+gas+ ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다(gas잔량:"+gas+")");
				return; //메소드 탈출 > 반복문 실행 종료
			}
		}
	}
}
