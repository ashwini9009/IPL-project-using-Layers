package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {

	public List<Player> getCSKTeams() 
	{
		System.out.println("we are in Dao ->");
		
		List<Player>cskteam=new ArrayList<Player>();
		Player p1=new Player(7,"MSD",7000,0,"CSK");
		Player p2=new Player(11,"Shivam Dube",2000,13,"CSK");
		Player p3=new Player(8,"Ravindra Jadeja",3000,2,"CSK");
		Player p4=new Player(31,"Ruturaj Gaikwad",7000,0,"CSK");
		cskteam.add(p1);
		cskteam.add(p2);
		cskteam.add(p3);
		cskteam.add(p4);
		return cskteam;
    }
	public List<Player> getRCBteams(){
		List<Player>rcbteam=new ArrayList<Player>();
		Player p5=new Player(7,"Virat Kohli",1000,1,"RCB");
		Player p6=new Player(73,"Mohammad siraj",25000,2,"RCB");
		Player p7=new Player(19,"Dinesh kartik",13000,3,"RCB");
		Player p8=new Player(32,"Maxwell",17000,4,"RCB");
		rcbteam.add(p5);
		rcbteam.add(p6);
		rcbteam.add(p7);
		rcbteam.add(p8);
		return rcbteam;
		}
	
	 public List<Player> getMIteams(){
		List<Player>miteam=new ArrayList<Player>();
		Player p9=new Player(45,"Rohit Sharma",70000,0,"MI");
		Player p10=new Player(33,"Hardik Pandya",20000,12,"MI");
		Player p11=new Player(23,"Ishan Kishan",4000,0,"MI");
		Player p12=new Player(8,"Tim David",5000,0,"MI");
		miteam.add(p9);
		miteam.add(p10);
		miteam.add(p11);
		miteam.add(p12);
		return miteam;
		}

}
