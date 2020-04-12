package com.norha.convertors;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.norha.Currency;
@Provider
public class CurrencyParamConverterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		return new ParamConverter<T> (){

			@Override
			public T fromString(String code) {
				Currency currency=null;
				switch(code.toUpperCase()){
					case "EUR":currency = new Currency(code, "EURO"); break;
					case "USD":currency = new Currency(code, "US DOLLERS"); break;
					case "INR":currency = new Currency(code, "INDIAIN RUPESS"); break;
				}
				return (T) currency;
			}

			@Override
			public String toString(T currency) {
				return currency.toString();
			}
		};
	}

}
