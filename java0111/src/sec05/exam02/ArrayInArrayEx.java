package sec05.exam02;

public class ArrayInArrayEx {

	public static void main(String[] args) {
		int[][] scores = {{95,80},{92,96}};//2차원배열
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
			for(int j=0; j<scores[i].length;j++) {
				System.out.printf("(%d, %d):",i,j);
				System.out.println(scores[i][j]);
			}
		}

	}

}
