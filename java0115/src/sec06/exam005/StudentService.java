package sec06.exam005;

public class StudentService {
	Student student = new Student();
	private static StudentService studentServise = new StudentService();
	private StudentService() {		
	}
	public static StudentService getInstance() {
		return studentServise;
	}
}
