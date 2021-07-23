package java_07_project_dto;

public class Member extends Dto {
	public String memberId;
	public String memberPassword;
	public String memberName;
	
	public Member(int id, String regDate, String memberId, String memberPassword, String memberName) {
		this.id = id;
		this.regDate = regDate;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
	}
}