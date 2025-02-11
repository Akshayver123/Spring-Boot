package com.lpu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class PlayerController {
	@Autowired
	PlayerService ps;
	@GetMapping("/players")
	public List<PlayerModel> showPlayers(){    
		return this.ps.getAllPlayers();
	}
	@GetMapping("/player/{id}")
	public PlayerModel getOnePlayer(@PathVariable int id) {
		return this.ps.getSinglePlayer(id);
	}
	
	
	@PostMapping("/player/save")
	public void addPlayer(@RequestBody PlayerModel p) {
		this.ps.savePlayer(p);
	}
	
	@PutMapping("player/update")
		public void updatePlayer(@RequestBody PlayerModel p) {
			this.ps.updateplayerService(p);
		}
	
	@DeleteMapping("player/delete/{id}")
	public void deletePlayer(@PathVariable int id) {
		System.out.println(id);
		this.ps.deletePlayerById(id);
	}
	

}
