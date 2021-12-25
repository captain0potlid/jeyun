package com.max.max.Game;

import org.bukkit.Bukkit;

import com.max.max.Voids;

public class Startup {
	public static Void Chk() {
		Voids.them.toString();
		Bukkit.broadcastMessage(Integer.toString(Voids.them.size()));
		return null;
	}
}
