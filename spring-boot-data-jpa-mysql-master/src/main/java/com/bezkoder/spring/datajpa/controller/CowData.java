package com.bezkoder.spring.datajpa.controller;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "cow")
@Setter
@Getter
@ToString
public class CowData {
	public CowData() {}
	@Id
	private LocalDateTime time_stamp;
    private String id;
    private String mobility;
    private int bpm;
    private double temperature;
    private String jMobility;
    private String gps;
    public LocalDateTime getTimeStamp() {
		return time_stamp;
	}

	public void setTimeStamp(LocalDateTime time_stamp) {
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

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
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
	

    // Constructor
    public CowData(LocalDateTime time_stamp, String id, String mobility, int bpm, double temperature, String jMobility, String gps) {
        this.time_stamp = time_stamp;
        this.id = id;
        this.mobility = mobility;
        this.bpm = bpm;
        this.temperature = temperature;
        this.jMobility = jMobility;
        this.gps = gps;
    }

    // Getters and setters
    // You can generate getters and setters using your IDE or write them manually

    @Override
    public String toString() {
        return "CowData{" +
                "time_stamp='" + time_stamp + '\'' +
                ", id='" + id + '\'' +
                ", mobility=" + mobility +
                ", bpm=" + bpm +
                ", temperature=" + temperature +
                ", jMobility=" + jMobility +
                ", gps='" + gps + '\'' +
                '}';
    }

	/*
	 * public static void main(String[] args) { String data =
	 * "TimeStamp:DD-MM-YYYY/HH-MM-SS, ID:TC-001-23, Mobility:1000, BPM:62, Temperature:38, JMobility:1000, GPS:(6.932,79.857);"
	 * +
	 * "TimeStamp:DD-MM-YYYY/HH-MM-SS, ID:TC-001-23, Mobility:1000, BPM:62, Temperature:38, JMobility:1000, GPS:(6.932,79.857);"
	 * +
	 * "TimeStamp:DD-MM-YYYY/HH-MM-SS, ID:TC-001-23, Mobility:1000, BPM:62, Temperature:38, JMobility:1000, GPS:(6.932,79.857);"
	 * +
	 * "TimeStamp:DD-MM-YYYY/HH-MM-SS, ID:TC-001-23, Mobility:1000, BPM:62, Temperature:38, JMobility:1000, GPS:(6.932,79.857)"
	 * ;
	 * 
	 * String[] records = data.split(";");
	 * 
	 * List<CowData> cowDataList = new ArrayList<>();
	 * 
	 * for (String record : records) { String[] fields = record.split(", ");
	 * 
	 * // LocalDateTime timeStamp = fields[0].split(":")[1]; String timeStampString
	 * = fields[0].split(":")[1]; LocalDateTime timeStamp =
	 * LocalDateTime.parse(timeStampString, DateTimeFormatter.ISO_DATE_TIME); String
	 * id = fields[1].split(":")[1]; String mobility = fields[2].split(":")[1]; int
	 * bpm = Integer.parseInt(fields[3].split(":")[1]); double temperature =
	 * Double.parseDouble(fields[4].split(":")[1]); String jMobility =
	 * fields[5].split(":")[1]; String gps = fields[6].split(":")[1];
	 * 
	 * CowData cowData = new CowData(timeStamp, id, mobility, bpm, temperature,
	 * jMobility, gps); cowDataList.add(cowData); }
	 * 
	 * // Print the list of CowData objects for (CowData cowData : cowDataList) {
	 * System.out.println(cowData); } }
	 */}
