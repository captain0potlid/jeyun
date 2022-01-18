package com.max.max.cmd;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.max.max.Voids;

public class _join implements CommandExecutor {
	public String warnLogo = ChatColor.GRAY  + " < " + ChatColor.RED + " ! " + ChatColor.GRAY + " > " + ChatColor.WHITE + "  |   ";
	public void warn(Player p, String a) {
		p.sendMessage(warnLogo + a);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
		Player player = (Player) sender;
		
		
		if (player.isOp()) {
			if (args.length == 0) {
				warn(player, "올바른 명령어 사용법이 아닙니다.");
				warn(player, "사용법 : /join <PlayerName>");
				return false;	
			}				
			if(Voids.them.values().contains(args[0])) return false;
			for (Player p : Bukkit.getOnlinePlayers()) {
				
				
				if (args[0].equalsIgnoreCase(p.getDisplayName())) {
					Voids.them.put(Voids.them.size() + 1, p.getDisplayName().toString());
					Bukkit.broadcastMessage("k");
				} else {
					continue;
				}
			}
		} else {
			player.sendMessage("명령어를 사용 할 권한이 없습니다!");
		}
		return true;
	}
}