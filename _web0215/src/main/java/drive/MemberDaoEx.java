package drive;

import member_dao.MemberDao;
import member_dto.Member;

public class MemberDaoEx {

	public static void main(String[] args) {
		//Member member = MemberDao.getInstance().select("admin");
		MemberDao dao = MemberDao.getInstance();
		Member member = dao.select("admin");
		System.out.println(member);
		
		Member member2 = dao.selectForLogin("hong1", "hong1@korea.com");
		System.out.println(member2);
		
//		Member member3 = new Member("test2", "test2@korea.com", "test22");
//		dao.insert(member3);
		
		Member member4 = new Member("test2", "test4@korea.com", "테스트");
		dao.update(member4);
	}

}
