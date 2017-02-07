package com.member.vo;

import java.sql.Date;

public class MemberVO {
	private int mno;
	private String mid;
	private String mpassword;
	private String mname;
	private Date regdate;
	private Date logindate;
	
	public MemberVO() {
	
	}
	public MemberVO(int mno, String mid, String mpassword, String mname, Date regdate, Date logindate) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.regdate = regdate;
		this.logindate = logindate;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getLogindate() {
		return logindate;
	}

	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}

	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", regdate="
				+ regdate + ", logindate=" + logindate + "]";
	}
	
	
	
	
	
	
}
