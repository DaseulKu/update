package prop;

public class MakeObj {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Aaa obj = new Aaa();
//		obj.aaaprint();
		
		Class<?> handlerClass = Class.forName("prop.Aaa"); //prop 에 Aaa 클래스 있는지 확인
        Aaa handlerInstance = (Aaa) handlerClass.newInstance(); // 있으면 Aaa 객체 생성해서 해시맵에 저장
        handlerInstance.aaaprint();
	}

}
