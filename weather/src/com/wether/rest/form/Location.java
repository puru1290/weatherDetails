package com.wether.rest.form;

public class Location {
	private String name;
	private String region;
	private String country;
	private Double lat;
	private Double lon;
	private String tz_id;
	// private Double localtime_epoch;
	private String localtime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public String getTz_id() {
		return tz_id;
	}

	public void setTz_id(String tz_id) {
		this.tz_id = tz_id;
	}

	public String getLocaltime() {
		return localtime;
	}

	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}

	/*
	 * public Double getLocaltime_epoch() { return localtime_epoch; }
	 * 
	 * public void setLocaltime_epoch(Double localtime_epoch) {
	 * this.localtime_epoch = localtime_epoch; }
	 */

}
