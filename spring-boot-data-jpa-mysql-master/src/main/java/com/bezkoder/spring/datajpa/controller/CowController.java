package com.bezkoder.spring.datajpa.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.datajpa.repository.Cowrepository;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CowController {

	@Autowired
	Cowrepository cowrepository;

	@GetMapping("health")
	public String health() {
		return "good";
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<CowData>> findAll() {
		{
			try {
				List<CowData> abc = cowrepository.findAll();
				System.out.println(abc);

				return new ResponseEntity<>(abc, HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			// }

		}
	}

	@PostMapping("/save")
	public ResponseEntity<CowData> postAPI(@RequestBody String data) {
		{
			// System.out.println(data);
			try {
				if (null != data) {
					List<Cowdata1> list = splitData(data);

					for (Cowdata1 c : list) {
						CowData cw = new CowData();
						//cw.setTemperature(c.getTemperature());
						//cw.setBpm(Integer.parseInt(c.getBpm().toString()));
					//	int value = Integer.parseInt((String) c.getBpm());
						//cw.setBpm(value);
						//Double s=Double.parseDouble((String) c.getTemperature());
						//cw.setTemperature(s);
						cw.setGps(c.getGps());
						cw.setId(c.getId());
						cw.setjMobility(c.getjMobility());
						cw.setMobility(c.getMobility());
						String l =c.getTime_stamp().replace("\'", "");
						String l2=l.replace("\"","");
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy/HH-mm-ss");
						if (null != c.getTime_stamp()) {
							LocalDateTime timestamp = LocalDateTime.parse(l2, formatter);
							cw.setTimeStamp(timestamp);
							cowrepository.save(cw);
						}

					}

				}

				return new ResponseEntity<>(null, HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}
	}

	private List<Cowdata1> splitData(String input) {
		String trimmedString = input.replace("\"data\": ", "");
		trimmedString = trimmedString.replace("{", "").replace("}", "");
		List<Cowdata1> cowDataList = new ArrayList<>();
		// System.out.println(trimmedString.trim());
		String[] objects = trimmedString.split(";");
		JsonObject jsonObject = null;

		for (String object : objects) {
			Cowdata1 cow = new Cowdata1();
			// System.out.println(object.trim());
			jsonObject = new JsonObject();
			String[] keyValuePairs = object.split(", ");
			for (String pair : keyValuePairs) {

				String[] keyValue = pair.split(":");
				jsonObject.addProperty(keyValue[0], keyValue[1]);

				// System.out.println(jsonObject);
				for (String key1 : jsonObject.keySet()) {
					Object value = jsonObject.get(key1);
					String s = value.toString();

					String key2 = key1.replaceAll("[\",]", "").trim();
					// System.out.println("Key: " + );//+ ", Value: " + value);
					// System.out.println(key1.trim());
					String key = key2.trim();
					// System.out.println(key);
					;
					if (key.trim().equals("TimeStamp")) {
						cow.setTime_stamp(value.toString());
					}
					if (key.equalsIgnoreCase("Mobility")) {
						cow.setMobility(value.toString());
					} else if (key.trim().equalsIgnoreCase("jMobility")) {
						cow.setjMobility(value.toString());
					} else if (key.equalsIgnoreCase("Temperature")) {
						cow.setTemperature(value);
					} else if (key.trim().equalsIgnoreCase("GPS")) {
						String s1 = s.replaceAll("\\\\r\\\\n", "");
						String s2 = s1.replace("\"", "");
						String s3 = s2.replace("\\", "");
						cow.setGps(s3);
					} else if (key.equalsIgnoreCase("BPM")) {
						cow.setBpm(value);
					} else if (key.equalsIgnoreCase("id")) {
						cow.setId(s);
					}

				}

			}
			System.out.println(cow);
			cowDataList.add(cow);
		}

		return cowDataList;
	}

	private static void setValue(Cowdata1 pojo, String key, String value) {
		switch (key) {

		case "id":
			// pojo.setId(value.toString());
			break;
		case "Mobility":
			pojo.setMobility(value);
			break;
		case "BPM":
			pojo.setBpm(Integer.parseInt(value));
			break;
		case "Temperature":
			pojo.setTemperature(Double.parseDouble(value));
			break;
		case "jMobility":
			pojo.setjMobility(value);
			break;
		case "TimeStamp":
			pojo.setTime_stamp(value);
			;
			break;
		default:
			// Handle unknown keys if needed
			break;
		}
	}
}
