package com.dustin.springbootcrudsample.config;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

public class MyLocaleResolver implements LocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String language = request.getParameter("l");
		Locale locale = request.getLocale();
		if (!StringUtils.isEmpty(language)) {
			locale = new Locale(language.split("_")[0], language.split("_")[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
	}

}
