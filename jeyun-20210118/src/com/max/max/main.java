package com.max.max;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.max.max.cmd._game;
import com.max.max.cmd._join;
import com.max.max.cmd._test;

public class main extends JavaPlugin implements Listener {
	
	static void Error(int code) {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "HOW DID THIS CODE GET HERE? " + code);
	}
	
	static ConsoleCommandSender consol = Bukkit.getConsoleSender();
	static double dValue = Math.random();
	static String tw = Double.toString(dValue);
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		this.getServer().getPluginManager().registerEvents(new ChatEvent(), this);
		getCommand("game").setExecutor(new _game());
		getCommand("join").setExecutor(new _join());
		getCommand("test").setExecutor(new _test());
		consol.sendMessage( ChatColor.AQUA + "[플러그인 활성화 중 입니다.]");
		consol.sendMessage(ChatColor.YELLOW + tw + " - version");
	}
	
	@Override
	public void onDisable() {
		consol.sendMessage( ChatColor.AQUA + "[플러그인 비활성화 중 입니다.]");
	}
}