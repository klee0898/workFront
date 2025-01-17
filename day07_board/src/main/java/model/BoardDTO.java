package model;

import java.sql.Timestamp;

public class BoardDTO {
	private int bid;
	private String title;
	private String writer;
	private String content;
	private Timestamp regDate;
	
	private int hit, bgroup, bstep, bindent;
	
	// 기본생성자
	public BoardDTO() {}

	// 인자 생성자
	public BoardDTO(int bid, String title, String writer, String content, Timestamp regDate, int hit, int bgroup,
			int bstep, int bindent) {
		super();
		this.bid = bid;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		this.hit = hit;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
	}

	// toString()
	@Override
	public String toString() {
		return "BoardDTO [bid=" + bid + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", regDate=" + regDate + ", hit=" + hit + ", bgroup=" + bgroup + ", bstep=" + bstep + ", bindent="
				+ bindent + "]";
	}
	
	// getter/setter
	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getBgroup() {
		return bgroup;
	}

	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}

	public int getBstep() {
		return bstep;
	}

	public void setBstep(int bstep) {
		this.bstep = bstep;
	}

	public int getBindent() {
		return bindent;
	}

	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	
	
	
	
}
