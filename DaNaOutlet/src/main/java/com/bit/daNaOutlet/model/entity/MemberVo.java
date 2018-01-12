package com.bit.daNaOutlet.model.entity;

import java.sql.Date;

public class MemberVo {

	private int mnum;
	private String name;
	private String phone;
	private Date mbirth;
	private String id;
	private String mail;
	private String addr;
	private String addrn;
	private String password;
	private String sex;

	public MemberVo() {
		// TODO Auto-generated constructor stub
	}

	public int getMnum() {
		return mnum;
	}

	public void setMnum(int mnum) {
		this.mnum = mnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getMbirth() {
		return mbirth;
	}

	public void setMbirth(Date mbirth) {
		this.mbirth = mbirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddrn() {
		return addrn;
	}

	public void setAddrn(String addrn) {
		this.addrn = addrn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public MemberVo(int mnum, String name, String phone, Date mbirth, String id, String mail, String addr, String addrn,
			String password, String sex) {
		super();
		this.mnum = mnum;
		this.name = name;
		this.phone = phone;
		this.mbirth = mbirth;
		this.id = id;
		this.mail = mail;
		this.addr = addr;
		this.addrn = addrn;
		this.password = password;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "MemberVo [mnum=" + mnum + ", name=" + name + ", phone=" + phone + ", mbirth=" + mbirth + ", id=" + id
				+ ", mail=" + mail + ", addr=" + addr + ", addrn=" + addrn + ", password=" + password + ", sex=" + sex
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((addrn == null) ? 0 : addrn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((mbirth == null) ? 0 : mbirth.hashCode());
		result = prime * result + mnum;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVo other = (MemberVo) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (addrn == null) {
			if (other.addrn != null)
				return false;
		} else if (!addrn.equals(other.addrn))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (mbirth == null) {
			if (other.mbirth != null)
				return false;
		} else if (!mbirth.equals(other.mbirth))
			return false;
		if (mnum != other.mnum)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
}
