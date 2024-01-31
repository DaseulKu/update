package chap08.sec02.verfy;

public class MysqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Mysql select");		
	}
	@Override
	public void insert() {
		System.out.println("Mysql insert");		
	}
	@Override
	public void update() {
		System.out.println("Mysql update");		
	}
	@Override
	public void delete() {
		System.out.println("Mysql delete");	
	}
}