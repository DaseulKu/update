package sec04.exam01;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i==3 && j==3)
					continue;
				System.out.printf("(%d, %d)\n",i,j);//3,0만 건너뛰고3,4부터다시
			}
		}

	}

}
