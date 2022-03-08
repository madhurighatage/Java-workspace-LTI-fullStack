package com.store.customExceptions;

public class ErrorDetails {
	private String msg;

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ErrorDetails(String msg) {
		super();
		this.msg = msg;
	}
}
