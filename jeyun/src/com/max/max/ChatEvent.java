package com.max.max;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import com.max.max.Game.Startup;

public class ChatEvent implements Listener{
	public String St1 = ChatColor.RED + "ä�� ������ ���� �����Դϴ�." + ChatColor.GRAY
								+ "[You have no permission to do this!]";
	
	@EventHandler
	public void OnPlayerClientChat(PlayerChatEvent e) {
		String msg = e.getMessage(); //Client send �޼��� ȣ��, ���� �ű� ����
		Player p = e.getPlayer(); //Client send Player �� import
		GameMode gmd = p.getGameMode(); //Client send Player >> Gamemode �� ���Ӹ��
		
		if(gmd == GameMode.ADVENTURE) {
			p.sendMessage(St1);
			e.setCancelled(true);
			return;
		}
		if(msg.contains("test")) {
			Startup.Chk();
		}
		if(msg.contains("asdf")) {
			Bukkit.broadcastMessage(main.tw);
			main.getPlugin(main.class).getServer().reload();
		}
		
	}
}
