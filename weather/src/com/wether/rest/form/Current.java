package com.wether.rest.form;

public class Current {

	private String last_updated;
	private Double temp_c;
	private Double temp_f;
	private Integer is_day;
	private Double humidity;

	public Double getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(Double temp_c) {
		this.temp_c = temp_c;
	}

	public Double getTemp_f() {
		return temp_f;
	}

	public void setTemp_f(Double temp_f) {
		this.temp_f = temp_f;
	}

	public Integer getIs_day() {
		return is_day;
	}

	public void setIs_day(Integer is_day) {
		this.is_day = is_day;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

}
