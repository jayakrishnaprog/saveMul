package com.bezkoder.spring.datajpa.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
	 String input = "GPS:(6.932,79.857)";

     // Find the index of "(" and ")"
     int startIndex = input.indexOf("(");
     int endIndex = input.indexOf(")");

     if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {
         // Extract the substring between "(" and ")"
         String gpsValue = input.substring(startIndex + 1, endIndex);

         // Output the extracted GPS value
         System.out.println("GPS value: " + gpsValue);
     } else {
         // Handle the case where "(" or ")" is missing
         System.out.println("Invalid GPS format");
     }
}}
