package com.tka.entity;

public class Player {
	
	private int jno;
	private String name;
	private int runs;
	private int wickets;
	private String tname;
	
	public Player() 
	{
		super();
	}

	public Player(int jno, String name, int runs, int wickets, String tname) {
		this.jno = jno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}
	

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", tname=" + tname + "]";
	}

	

	 
}
