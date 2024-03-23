package com.bezkoder.spring.datajpa.controller;

import java.time.LocalDateTime;

public class Cowdata1 {
	public Cowdata1() {}
	private String id;
    private String mobility;
    private Object bpm;
    private Object temperature;
    private String jMobility;
    private String gps;
    private String time_stamp;
	@Override
	public String toString() {
		return "Cowdata1 [time_stamp=" + time_stamp + ", id=" + id + ", mobility=" + mobility + ", bpm=" + bpm
				+ ", temperature=" + temperature + ", jMobility=" + jMobility + ", gps=" + gps + "]";
	}
	
	public Cowdata1(String time_stamp, String id, String mobility, int bpm, double temperature, String jMobility,
			String gps) {
		super();
		this.time_stamp = time_stamp;
		this.id = id;
		this.mobility = mobility;
		this.bpm = bpm;
		this.temperature = temperature;
		this.jMobility = jMobility;
		this.gps = gps;
	}
	public String getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobility() {
		return mobility;
	}
	public void setMobility(String mobility) {
		this.mobility = mobility;
	}
	public Object getBpm() {
		return bpm;
	}
	public void setBpm(Object value) {
		this.bpm = value;
	}
	public Object getTemperature() {
		return temperature;
	}
	public void setTemperature(Object value) {
		this.temperature = value;
	}
	public String getjMobility() {
		return jMobility;
	}
	public void setjMobility(String jMobility) {
		this.jMobility = jMobility;
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		this.gps = gps;
	}
	
}
