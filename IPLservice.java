package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLservice {
	IPLDao dao=new IPLDao();
	
	public List<Player> getCSKteams() {
		System.out.println("we are in service method ->");
		
		List<Player> cskteam=dao.getCSKTeams();
		return cskteam;
		}
	
	public List<Player> getRCBteams() {
		//System.out.println("we are in service method ->");
		//IPLDao dao=new IPLDao();
		List<Player> rcbteam=dao.getRCBteams();
		return rcbteam;
		}

	public List<Player> getMIteams() {
		//System.out.println("we are in service method ->");
		//IPLDao dao=new IPLDao();
		List<Player> miteam=dao.getMIteams();
		return miteam;
		}
}
