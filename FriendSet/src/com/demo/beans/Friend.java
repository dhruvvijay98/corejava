package com.demo.beans;

import java.util.Objects;

public class Friend implements Comparable<Friend>{
	
	private int fid;
	private String name;
	private String mobile;
	
	public Friend() {
		super();
	}
	
	public Friend(int fid, String name, String mobile) {
		super();
		this.fid = fid;
		this.name = name;
		this.mobile = mobile;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(fid, mobile, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return fid == other.fid && Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Friend [fid=" + fid + ", name=" + name + ", mobile=" + mobile + "]";
	}

	@Override
	public int compareTo(Friend o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
