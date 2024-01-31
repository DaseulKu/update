package jdbc2;

import java.util.ArrayList;

class EmpList {
	int empno;
	String ename;
	double sal;
	public EmpList(int empno, String ename, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpList [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
}
class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<EmpList> elist = new ArrayList<EmpList>();
//		elist.add(new EmpList(rs.getInt("empno"));
		}
	
}