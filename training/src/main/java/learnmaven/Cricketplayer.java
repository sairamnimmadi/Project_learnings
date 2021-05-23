/* 
 * Clean code example
 * 
 * File structure format is :
 * 
 * Package statement
 * 
 * Import statements
 * 
 * Exactly one top-level class
 * 
 * Class variables
 * 
 * Constructors
 * 
 * Methods
 * 
 * Instance variables
 * 
 * */

package learnmaven;

import java.text.*;
import java.util.*;


public class Cricketplayer {
	
	private String playerName;
	private Date debutDate;
	
	public Cricketplayer(String playerName, Date debutDate) {
		this.playerName = playerName;
		this.debutDate = debutDate;
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public Date getDebutDate() {
		return this.debutDate;
	}
	
	public static void main(String[] args) throws ParseException {
		Cricketplayer Player = new Cricketplayer("ViratKohli", new SimpleDateFormat("dd/MM/yyyy").parse("18/08/2008"));
		System.out.println(Player.getPlayerName());
		System.out.println(Player.getDebutDate());
	}

}
