package sec06.exam04;
//한 개에 같이 작성
public class Cal2 {
	
		double areaRectangle(double width) {
			return width * width;
		}
		
		double areaRectangle(double width, double heght) {
			return width * heght;
		}
		public static void main(String[]args) {
			Cal2 cal = new Cal2();
			System.out.println(cal.areaRectangle(11.5));
			System.out.println(cal.areaRectangle(11.5, 5.9));
		}
}
