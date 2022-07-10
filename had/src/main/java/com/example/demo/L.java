package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class L {
	private int lid;
	private String brnd;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrnd() {
		return brnd;
	}
	public void setBrnd(String brnd) {
		this.brnd = brnd;
	}
	@Override
	public String toString() {
		return "L [lid=" + lid + ", brnd=" + brnd + "]";
	}
	
public void compile() {
System.out.println(" compiling");
}
}
