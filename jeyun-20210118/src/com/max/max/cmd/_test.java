package com.max.max.cmd;

import java.util.Vector;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.max.max.Voids;
import com.max.max.main;
import com.max.max.Game.Startup;

public class _test implements CommandExecutor {
	public String games = "zombie, test";
	public String warnLogo = ChatColor.GRAY + " < " + ChatColor.RED + " ! " + ChatColor.GRAY + " > " + ChatColor.WHITE
			+ "  |   ";

	public void warn(Player p, String a) {
		p.sendMessage(warnLogo + a);
	}

	public int total, eq;
	@Override
	public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
		Player p = (Player) sender;
		Location w = p.getLocation();
		Location loc = w.clone();
		// paste here
		int count;
		count = Bukkit.getScheduler().scheduleSyncRepeatingTask(main.getPlugin(main.class), new Runnable() {
			@Override
			public void run() {
				total++;
				p.sendMessage(total + "");
				// code here
				
				Location TRX = loc.clone().add(Startup.misol() * 10/2, 30, Startup.misol() * 10/2);
				Location WXW = TRX.clone().add(-Startup.misol() * 10/2, 30, -Startup.misol() * 10/2);
				Location jam = WXW.clone().add(Startup.misol()/2, 30, Startup.misol()/2);
				Location mag = jam.clone().add(-Startup.misol()/2, 30, -Startup.misol()/2);
				mag.setY(110);

				if(mag.clone().getBlock().getType() == Material.BEACON) {
					eq++;
					Bukkit.broadcastMessage(total + " 회 시도, " + eq + " 회 일치 - " + eq*100/total + "%");
				}
				mag.clone().getBlock().setType(Material.BEACON);
				mag.setY(109);
				
//				mag.clone().getBlock().setType(Material.DIAMOND_BLOCK); 
//				mag.clone().add(-1, 0, -1).getBlock().setType(Material.DIAMOND_BLOCK);
//				mag.clone().add(1, 0, -1).getBlock().setType(Material.DIAMOND_BLOCK);
//				mag.clone().add(-1, 0, 1).getBlock().setType(Material.DIAMOND_BLOCK);
//				mag.clone().add(1, 0, 1).getBlock().setType(Material.DIAMOND_BLOCK);
//				mag.clone().add(-1, 0, 0).getBlock().setType(Material.DIAMOND_BLOCK);
//				mag.clone().add(0, 0, -1).getBlock().setType(Material.DIAMOND_BLOCK);
//				mag.clone().add(1, 0, 0).getBlock().setType(Material.DIAMOND_BLOCK);
//				mag.clone().add(0, 0, 1).getBlock().setType(Material.DIAMOND_BLOCK);

				// code here
			}
		}, 0L, 1L);

		// 무시

		// paste here

		return true;
	}
}