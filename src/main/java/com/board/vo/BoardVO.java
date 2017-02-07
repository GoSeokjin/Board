package com.board.vo;

import java.sql.Date;

public class BoardVO {
	private Integer bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bregdate;
	private int bviewcnt;

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public Date getBregdate() {
		return bregdate;
	}

	public void setBregdate(Date bregdate) {
		this.bregdate = bregdate;
	}

	public int getBviewcnt() {
		return bviewcnt;
	}

	public void setBviewcnt(int bviewcnt) {
		this.bviewcnt = bviewcnt;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bregdate=" + bregdate + ", bviewcnt=" + bviewcnt + "]";
	}

}
