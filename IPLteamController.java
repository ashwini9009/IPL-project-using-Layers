package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLservice;

public class IPLteamController {
	IPLservice service = new IPLservice();
	public List<Player> getCSKteams() {
		System.out.println("we are in controller ->");
		
		//IPLservice service = new IPLservice();
		List<Player>cskteam=service.getCSKteams();
		return cskteam;
		
	}

	public List<Player> getRCBteams() {
		//IPLservice service = new IPLservice();
		List<Player>rcbteam=service.getRCBteams();
		return rcbteam;
	}

	public List<Player> getMIteams() {
		//IPLservice service = new IPLservice();
		List<Player>miteam=service.getMIteams();
		return miteam;
	}

}
