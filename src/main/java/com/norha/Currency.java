package com.norha;

public class Currency {
	private String code;
	private String currency;
	public Currency(String code, String currency) {
		this.code = code;
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Currency [code=" + code + ", currency=" + currency + "]";
	}
	

}