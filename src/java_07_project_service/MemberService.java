package java_07_project_service;

import java_07_project_container.Container;
import java_07_project_dao.MemberDao;
import java_07_project_dto.Member;

public class MemberService {

	private MemberDao memberDao;

	public MemberService() {
		this.memberDao = Container.memberDao;
	}

	public int getMemberIndexByLoginId(String loginId) {
		return memberDao.getMemberIndexByLoginId(loginId);
	}

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}

	public boolean isJoinableLoginId(String loginId) {
		return memberDao.isJoinableLoginId(loginId);
	}

	public void join(Member member) {
		memberDao.add(member);
	}

	public void withdraw(Member forWithdrawMember) {
		memberDao.remove(forWithdrawMember);
	}

	public String getMemberNameById(int memberId) {
		return memberDao.getMemberNameById(memberId);
	}

}
