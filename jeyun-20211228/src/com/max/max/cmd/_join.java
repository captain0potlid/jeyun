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
				warn(player, "�ùٸ� ��ɾ� ������ �ƴմϴ�.");
				warn(player, "���� : /join <PlayerName>");
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
			player.sendMessage("��ɾ ��� �� ������ �����ϴ�!");
		}
		return true;
	}
}