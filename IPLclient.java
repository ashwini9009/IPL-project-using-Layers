package com.tka.client;

import java.util.List;
import java.util.Scanner;

import com.tka.controller.IPLteamController;
import com.tka.entity.Player;

public class IPLclient {
	
	public static void main(String args[])
	{
		IPLteamController controller=new IPLteamController();
		System.out.println("we are in client ->");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice->");
		System.out.println("1.CSK");
		System.out.println("2.RCB");
		System.out.println("3.MI");
		int choice=sc.nextInt();
		//List<Player>cskteam=controller.getCSKteams();
	
         switch(choice) 
         {
             case 1 :
            	 List<Player>cskteam=controller.getCSKteams();
            	 
            	 System.out.println("-----CSK Team------");
            	 for(Player p:cskteam) {
            		 System.out.println(p);
            	 }
            	 break;
            	 
             case 2:
            	 List<Player>rcbteam=controller.getRCBteams();
            	 System.out.println("-----RCB Team------");
            	 for(Player p:rcbteam) {
            		 System.out.println(p);
            	 }
            	 break;
            	 
             case 3:
            	 List<Player>miteam=controller.getMIteams(); 
            	 System.out.println("-----MI Team------");
            	 for(Player p:miteam) {
            		 System.out.println(p);
            	 }
            	 break;
            	 
             default:
            	 System.out.println("Invalid choice");
            	 break;
         }
         
       
	   
   
	

	}	

}
