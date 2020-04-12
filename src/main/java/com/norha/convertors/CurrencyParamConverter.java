package com.norha.convertors;

import javax.ws.rs.ext.ParamConverter;

import com.norha.Currency;

public class CurrencyParamConverter implements ParamConverter<Currency> {

	@Override
	public Currency fromString(String code) {
		Currency currency=null;
		switch(code.toUpperCase()){
			case "EUR":currency = new Currency(code, "EURO"); break;
			case "USD":currency = new Currency(code, "US DOLLERS"); break;
			case "INR":currency = new Currency(code, "INDIAIN RUPESS"); break;
		}
		return currency;
	}

	@Override
	public String toString(Currency currency) {
		return currency.toString();
	}

}
