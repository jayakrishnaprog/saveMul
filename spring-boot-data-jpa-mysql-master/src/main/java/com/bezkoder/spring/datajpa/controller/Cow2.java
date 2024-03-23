package com.bezkoder.spring.datajpa.controller;

public class Cow2 {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobility() {
		return Mobility;
	}
	public void setMobility(String mobility) {
		Mobility = mobility;
	}
	public int getBPM() {
		return BPM;
	}
	public void setBPM(int bPM) {
		BPM = bPM;
	}
	@Override
	public String toString() {
		return "Cow2 [id=" + id + ", Mobility=" + Mobility + ", BPM=" + BPM + ", Temperature=" + Temperature
				+ ", jMobility=" + jMobility + ", GPS=" + GPS + ", TimeStamp=" + TimeStamp + "]";
	}
	public double getTemperature() {
		return Temperature;
	}
	public void setTemperature(double temperature) {
		Temperature = temperature;
	}
	public String getjMobility() {
		return jMobility;
	}
	public void setjMobility(String jMobility) {
		this.jMobility = jMobility;
	}
	public String getGPS() {
		return GPS;
	}
	public void setGPS(String gPS) {
		GPS = gPS;
	}
	public String getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	private String id;
    private String Mobility;
    private int BPM;
    private double Temperature;
    private String jMobility;
    private String GPS;
    private String TimeStamp;
}
