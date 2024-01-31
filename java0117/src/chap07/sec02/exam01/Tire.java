package chap07.sec02.exam01;

public class Tire {
	public int maxRotation; //최대 회전수
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
		public boolean roll() {
			++accumulatedRotation; //누적 회전수 1씩 증가
			if(accumulatedRotation < maxRotation) { // 누적회전수 < 최대회전수 = 아직 타이어 수명 남음
				System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRotation)+"회");
				return true;
			}else {
				System.out.println("*** "+ location + "Tire 펑크 ***");
				return false;
			}
		}
	}