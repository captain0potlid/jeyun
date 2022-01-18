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
				warn(player, "올바른 명령어 사용법이 아닙니다.");
				warn(player, "사용법 : /game <GameType>");
				return false;	
			}				
			
			String t = args[0];
			
			if(t.contains("trxx")) { //real mode
				Startup.Chk();
			} else {
				warn(player, "알 수 없는 GameType[args[0]] 입니다.");
				player.sendMessage(ChatColor.GRAY + " - " + games);
				return true;
			}
		} else {
			player.sendMessage("명령어를 사용 할 권한이 없습니다!");
		}
		return true;
	}
}