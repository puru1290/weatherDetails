package com.wether.rest.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.wether.rest.form.WetherDetailForm;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

public class GetWeatherAction extends ActionSupport {

	private String REST_URL = "http://api.weatherapi.com/v1/current.json?key=d3903996667b4e9f840170308221311&aqi=no&q=";
	private WetherDetailForm wetherDetailForm;
	private String cityName;

	@Override
	public String execute() throws Exception {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(REST_URL + cityName).get().build();
		ResponseBody responseBody = client.newCall(request).execute().body();
		Gson gson = new Gson();
		WetherDetailForm entity = gson.fromJson(responseBody.string(), WetherDetailForm.class);
		this.wetherDetailForm = entity;
		return SUCCESS;
	}

	public WetherDetailForm getWetherDetailForm() {
		return wetherDetailForm;
	}

	public void setWetherDetailForm(WetherDetailForm wetherDetailForm) {
		this.wetherDetailForm = wetherDetailForm;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
