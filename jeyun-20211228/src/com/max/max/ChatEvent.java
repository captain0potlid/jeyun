package com.max.max;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import com.max.max.Game.Startup;
import com.max.max.History.database;

public class ChatEvent implements Listener{
	public String St1 = ChatColor.RED + "ä�� ������ ���� �����Դϴ�." + ChatColor.GRAY
								+ "[You have no permission to do this!]";
	
	@EventHandler
	public void OnPlayerClientChat(PlayerChatEvent e) {
		String msg = e.getMessage(); //Client send �޼��� ȣ��, ���� �ű� ����
		Player p = e.getPlayer(); //Client send Player �� import
		
		if(msg.contains("asdf")) { //reload �Լ� �����Ƽ� ���� �س��� ����
			Bukkit.broadcastMessage(main.tw);
			main.getPlugin(main.class).getServer().reload();
		}
	}
}
