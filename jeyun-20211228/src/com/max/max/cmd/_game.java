package com.max.max.cmd;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.max.max.Voids;
import com.max.max.Game.Startup;

public class _game implements CommandExecutor {
	public String games = "zombie, test";
	public String warnLogo = ChatColor.GRAY  + " < " + ChatColor.RED + " ! " + ChatColor.GRAY + " > " + ChatColor.WHITE + "  |   ";
	public void warn(Player p, String a) {
		p.sendMessage(warnLogo + a);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
		Player player = (Player) sender;
		
		Bukkit.broadcastMessage("new nexwa");
		if (player.isOp()) {
			if (args.length == 0) {
				warn(player, "�ùٸ� ��ɾ� ������ �ƴմϴ�.");
				warn(player, "���� : /game <GameType>");
				return false;	
			}				
			
			String t = args[0];
			
			if(t.contains("trxx")) { //real mode
				Startup.Chk();
			} else {
				warn(player, "�� �� ���� GameType[args[0]] �Դϴ�.");
				player.sendMessage(ChatColor.GRAY + " - " + games);
				return true;
			}
		} else {
			player.sendMessage("��ɾ ��� �� ������ �����ϴ�!");
		}
		return true;
	}
}