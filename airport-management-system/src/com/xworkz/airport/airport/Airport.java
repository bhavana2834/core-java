package com.xworkz.airport.airport;

import com.xworkz.airport.terminal.Terminal;

public class Airport {

		Terminal terminal[];
		int index;
		
		
		public Airport() {
			
			
		} 
		
		public Airport(int size){
			
		System.out.println("Airport object is created ");
		terminal=new Terminal[size];
		
		}
		
		
		public boolean creat(Terminal terminal){
			
		System.out.println("creat process started");
		boolean isCreated = false;	
		if(terminal.getTerminalName()!= null && terminal.getTerminalName()!=""){
		this.terminal[index++] = terminal;
		System.out.println("terminal  added succesfully");
		isCreated = true;	
		}
			
		System.out.println("creat process ended");
		return isCreated;
        }
			
		public  void getTerminal(){
		System.out.println("list of terminal detail");
		for(int in =0;in<this.terminal.length;in++){
					System.out.println(terminal[in].getTerminalId() + " " +terminal[in].getTerminalName() + " " + terminal[in].getGate() );
				}
			}
		public Terminal getTerminalByTerminalId(int terminalId) {
			System.out.println("inside getTerminalByTerminalId method ");
			for(int in=0;in<terminal.length;in++) {
				if(terminal[in].getTerminalId()==terminalId) {
					System.out.println("terminal Id is matching...proceed the data");
		
				
					System.out.println(terminal[in].getTerminalId() + " " +terminal[in].getTerminalName() + " " + terminal[in].getGate() );
	             return terminal[in];
	}
				System.out.println("end of getTerminalByTerminalId ");
				}
			return null;
			}
		
		public Terminal getTerminalByTerminalName(String terminalName) {
			System.out.println("inside getTerminalByTerminalId method ");
			for(int in=0;in<terminal.length;in++) {
				if(terminal[in].getTerminalName()==terminalName) {
					System.out.println("terminal Nameis matching...proceed the data");
					System.out.println(terminal[in].getTerminalId() + " " +terminal[in].getTerminalName() + " " + terminal[in].getGate() );
	return terminal[in];
	}
				System.out.println("end of getTerminalByTerminalName ");
				}
			return null;
			}
		
		public Terminal getTerminalByTerminalGate(int gate) {
			System.out.println("inside getTerminalByTerminalId method ");
			for(int in=0;in<terminal.length;in++) {
				if(terminal[in].getGate()==gate) {
					System.out.println("terminal Gate is matching...proceed the data");
					System.out.println(terminal[in].getTerminalId() + " " +terminal[in].getTerminalName() + " " + terminal[in].getGate() );
	return terminal[in];
	}
				System.out.println("end of getTerminalByTerminalGate ");
				}
			return null;
			}
		
		public boolean updateterminalNameByGate(String newName, int  gate) {
			boolean isNameUpdated = false;
			System.out.println("updateterminalNameBygate is started");
			for(int i=0;i<terminal.length;i++) {
				if(terminal[i].getGate() == gate) {
					System.out.println("the current name is "+terminal[i].getTerminalName());
					terminal[i].setTerminalName(newName);
					System.out.println("the updated name is "+terminal[i].getTerminalName());
					
				}
			}
			return isNameUpdated;
			
		}
		
			
		}
		
	

	
	
	
	

