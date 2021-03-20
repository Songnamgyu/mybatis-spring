package com.greedy.chap01.section01.connection.javaconfig;

import java.util.Date;

public class GoodsDTO {

	private int no;
	private String name;
	private int price;
	private int writerMemberNo;
	private int typeNo;
	private java.util.Date createdDate;
	private String status;
	private java.util.Date ModifiedDate;
	
	public GoodsDTO() {}

	public GoodsDTO(int no, String name, int price, int writerMemberNo, int typeNo, Date createdDate, String status,
			Date modifiedDate) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.writerMemberNo = writerMemberNo;
		this.typeNo = typeNo;
		this.createdDate = createdDate;
		this.status = status;
		ModifiedDate = modifiedDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWriterMemberNo() {
		return writerMemberNo;
	}

	public void setWriterMemberNo(int writerMemberNo) {
		this.writerMemberNo = writerMemberNo;
	}

	public int getTypeNo() {
		return typeNo;
	}

	public void setTypeNo(int typeNo) {
		this.typeNo = typeNo;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "GoodsDTO [no=" + no + ", name=" + name + ", price=" + price + ", writerMemberNo=" + writerMemberNo
				+ ", typeNo=" + typeNo + ", createdDate=" + createdDate + ", status=" + status + ", ModifiedDate="
				+ ModifiedDate + "]";
	}
	
}
