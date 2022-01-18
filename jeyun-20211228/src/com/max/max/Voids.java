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
		//유저의 불능 상태 유무 Web, Server에서 불러오기. HashMap 형식은 Boolean "" 형식임.
	static HashMap<Player, String> Prefix = new HashMap<Player, String>();
		//유저의 NickName Prefix. 초기값 등록 금지!!!!. 운영자 Prefix(접두사)는 "[운영자]"
		//											혹은 "[ADMIN]" 으로 Selection 창 띄움.	
	static String w = ChatColor.RED + " * " + ChatColor.GRAY
						+ "데이터베이스에서 플레이어 데이터를 완전히 찾지 못했습니다.[ERROR 1034]";
	
	public static String GetPrefix(Player p) { //DataBase Getters Function series I
		String a = "";
		
		if(Prefix.containsKey(p)) a = Prefix.get(p); //Prefix 데이터베이스에서 찾았으면 return
		if(!Prefix.containsKey(p)) p.sendMessage(w); //내선순환 return 신호 무시
		
		return a;
	}
	
	public static Boolean GetIfDisabled(Player p) { //DataBase Getters Function series II
		if(!isDisabled.containsKey(p)) return false;
		if(isDisabled.get(p) == "FALSE") return false;
		if(isDisabled.get(p) == "TRUE") return true;
		else {
			main.consol.sendMessage(ChatColor.RED
					+ "ERROR CODE 2054, 데이터베이스 입력 형식 오류!" + ChatColor.WHITE + "(returning false)");
			return false;
		}
	}
}
