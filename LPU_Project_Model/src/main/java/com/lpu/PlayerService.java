package com.lpu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service

public class PlayerService {
	List<PlayerModel> list = new ArrayList<PlayerModel>();
	PlayerModel p1 = new PlayerModel(101, "Sachin Tandulkar");
	PlayerModel p2 = new PlayerModel(102, "MsDhoni");
	PlayerModel p3 = new PlayerModel(103, "Virat Kholi");
	PlayerModel p4 = new PlayerModel(104, "Rohit Sharma");
	
	public PlayerService() {
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
	}
	public List<PlayerModel> getAllPlayers(){
		return list;
	}
	public PlayerModel getSinglePlayer(int id) {
		for(PlayerModel p : list) {
			if(p.getId()==id) {
				return p;
			}
		}
		return null;
	}
	public void savePlayer(PlayerModel p) {
	 list.add(p);
		
	}
	public void updateplayerService(PlayerModel p1) {
		for(PlayerModel p2 : list) {
			if(p2.getId()==p1.id) {
				p2.setName(p1.getName());
			}
		}
		
	}
	public void deletePlayerById(int id) {
	
		
		for(PlayerModel p : list) {
			if(p.getId()==id) {
				list.remove(p);
				break;
			}
		
	}
	

	}
}
