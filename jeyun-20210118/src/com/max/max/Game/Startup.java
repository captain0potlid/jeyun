package com.max.max.Game;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.max.max.Voids;
import com.max.max.main;

public class Startup {
	public static String Players;
	public static Integer Time, Most_Damaged, Most_Attacked;
	public static Location Circut;
	
	public static String Session_ID;

	static public String w;
	
	public static int misol() {
		String mx = Math.random()*100 + "";
		Character w3 = mx.charAt(5);
		return w3;
	}
	
	public static void Chk() {
		Voids.them.toString();
		Bukkit.broadcastMessage(Integer.toString(Voids.them.size()) + "���� �÷��̾���� �����ϴ� M-"+ misol() +" ������ �����մϴ�. "); // �ο���
																											// broadcast.
		String w = GetStringify(Voids.them);
		Bukkit.broadcastMessage(ChatColor.GRAY + "PlayerList : " + w);
	}

	public static void startup_1() {
		Session_ID = com.max.max.History.database.NewID();
		Players = w;
		
		//random location setup *(settings times) repeat
		//end function smoothly
	}

	public static String GetStringify(HashMap<Integer, String> a) {
		String we = "";
		Object[] popa = a.values().toArray();
		
		for (int i = 0; i < a.size(); i++) {
			String target = (String) popa[i];
			Player p = Bukkit.getPlayer(target); // player �ҷ�����
			String name = p.getDisplayName(); // player.displayname ��������
			we = we + name;
			if (i != popa.length - 1)
				we = we + ", ";
		}

		if (we == "" || we.length() < 2) { // error instance flack

			Voids.Error(3912);
			return null;
		}

		return we;
	}
}
