package com.max.max;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TEST implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

		Player player = (Player) sender;

		if (player.isOp()) {

			if (args.length == 0)
				return false;

			for(Player p: Bukkit.getOnlinePlayers()) {
				if(args[0].equalsIgnoreCase(p.getDisplayName())) {
					Voids.them.put(p, Voids.them.values().size() + 1);
					Bukkit.broadcastMessage("k");
				}
				
			}

		} else {

			player.sendMessage("��ɾ ��� �� ������ �����ϴ�!");

		}

		return true;
	}
}