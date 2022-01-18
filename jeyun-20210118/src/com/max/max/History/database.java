package com.max.max.History;

import java.util.HashMap;
import java.util.Random;

import javax.tools.DocumentationTool.Location;

public class database {
	static HashMap<String, String> Players = new HashMap<String, String>();
	static HashMap<String, Integer> Time = new HashMap<String, Integer>();
	static HashMap<String, Location> Circut = new HashMap<String, Location>();
	static HashMap<String, Integer> Most_Damaged = new HashMap<String, Integer>();
	static HashMap<String, Integer> Most_Attacked = new HashMap<String, Integer>();
	
	public static HashMap<String, String> getPlayers() {
		return Players;
	}

	public static void setPlayers(HashMap<String, String> players) {
		Players = players;
	}

	public static HashMap<String, Integer> getTime() {
		return Time;
	}

	public static void setTime(HashMap<String, Integer> time) {
		Time = time;
	}

	public static HashMap<String, Location> getCircut() {
		return Circut;
	}

	public static void setCircut(HashMap<String, Location> circut) {
		Circut = circut;
	}

	public static HashMap<String, Integer> getMost_Damaged() {
		return Most_Damaged;
	}

	public static void setMost_Damaged(HashMap<String, Integer> most_Damaged) {
		Most_Damaged = most_Damaged;
	}

	public static HashMap<String, Integer> getMost_Attacked() {
		return Most_Attacked;
	}

	public static void setMost_Attacked(HashMap<String, Integer> most_Attacked) {
		Most_Attacked = most_Attacked;
	}

	public static String NewID() {
		
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 2;
	    Random random = new Random();

	    String ID1 = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString().toUpperCase();
		
	    String ID2 = random.ints(leftLimit, rightLimit + 1)
	  	      .limit(targetStringLength)
	  	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	  	      .toString().toUpperCase();
	  		
	    String w1 = ID1 + "-" + ID2;
	    
	    double randomValue = Math.random();
	    int a = (int)(randomValue * 100) + 1; //1 - 100
	    int b = (int)(randomValue * 100); //0 - 99
	    
	    String w2 = ID1 + b;
	    String w3 = ID1 + a + b;
	    
		return w2;
	}
}
