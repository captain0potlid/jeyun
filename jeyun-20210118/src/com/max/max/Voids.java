package com.max.max;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Voids {
	public static void Error(int code) {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "HOW DID THIS CODE GET HERE? " + code);
	}
	
	public static HashMap<Integer, String> them = new HashMap<Integer, String>();
	static HashMap<Player, String> isDisabled = new HashMap<Player, String>();
		//������ �Ҵ� ���� ���� Web, Server���� �ҷ�����. HashMap ������ Boolean "" ������.
	static HashMap<Player, String> Prefix = new HashMap<Player, String>();
		//������ NickName Prefix. �ʱⰪ ��� ����!!!!. ��� Prefix(���λ�)�� "[���]"
		//											Ȥ�� "[ADMIN]" ���� Selection â ���.	
	static String w = ChatColor.RED + " * " + ChatColor.GRAY
						+ "�����ͺ��̽����� �÷��̾� �����͸� ������ ã�� ���߽��ϴ�.[ERROR 1034]";
	
	public static String GetPrefix(Player p) { //DataBase Getters Function series I
		String a = "";
		
		if(Prefix.containsKey(p)) a = Prefix.get(p); //Prefix �����ͺ��̽����� ã������ return
		if(!Prefix.containsKey(p)) p.sendMessage(w); //������ȯ return ��ȣ ����
		
		return a;
	}
	
	public static Boolean GetIfDisabled(Player p) { //DataBase Getters Function series II
		if(!isDisabled.containsKey(p)) return false;
		if(isDisabled.get(p) == "FALSE") return false;
		if(isDisabled.get(p) == "TRUE") return true;
		else {
			main.consol.sendMessage(ChatColor.RED
					+ "ERROR CODE 2054, �����ͺ��̽� �Է� ���� ����!" + ChatColor.WHITE + "(returning false)");
			return false;
		}
	}
}
