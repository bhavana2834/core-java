package com.xworkz.airport;

import java.util.Scanner;

import com.xworkz.airport.airport.Airport;
import com.xworkz.airport.terminal.Terminal;

public class AirportTester {

      public static void main(String air[]){
		
		
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Airport airport=new Airport(size);
		
		Terminal terminal=new Terminal();
		System.out.println("enter the terminalId");
		int terminalId=sc.nextInt();
		terminal.setTerminalId(terminalId);
		
		System.out.println("enter the terminalname");
		String terminalName=sc.next();
		terminal.setTerminalName(terminalName);
		
		System.out.println("enter the gate");
		int gate=sc.nextInt();
		terminal.setGate(gate);
		
		
		System.out.println(terminal.getTerminalId() + " " + terminal.getTerminalName() + " " + terminal.getGate() );
	
			int option=0;
			String answer="yes";
         
		do {
          System.out.println("Enter 1 to fetch all the terminals");
          System.out.println("Enter 2 to fetch terminal id");
          System.out.println("Enter 3 to update terminal name  by terminal id");
          System.out.println("Enter 4 to Exit");
          System.out.println("Enter 5 to continue");
          
           option = sc.nextInt();
         
           switch(option) {
          case 1: airport.getTerminal();
          break;

        case 2: System.out.println("Enter the Id to be fetched");

          int id = sc.nextInt();
          airport.getTerminalByTerminalId(id);
          
          break;
         
          case 3: System.out.println("Enter the updated name");
                String  updateName = sc.next();
                  System.out.println("Enter the terminal name");
                int gate1 = sc.nextInt();
                airport.updateterminalNameByGate(updateName, gate1);
              break;
          case 4: System.out.println("thank you for visiting");
                System.out.println("do you want to continue yes or no");
                
                }
                
		}while(answer.equals(sc.next()));
		System.out.println("the main method ended");
          sc.close();
          
          
          
          
          
}

}


		/*for(int i=0;i<size;i++) {
			
			System.out.println("Enter the terminal Id");
			int terminalId=scanner.nextInt();
			System.out.println("Enter the terminal Name");
			String terminalName=scanner.next();
			System.out.println("Enter the terminal gate ");
			int gate=scanner.nextInt();
			
			Terminal terminal=new Terminal(terminalId,terminalName,gate);
			airport.creat(terminal);	
		}
		
		airport.getTerminal();
		
		System.out.println("getTerminalByTerminalId is procced....");
		airport.getTerminalByTerminalId(1);
		
		System.out.println("getTerminalByTerminalName is proceed...");
		airport.getTerminalByTerminalName("manik");
		
		System.out.println("getTerminalByTerminalGate is proceed...");
		airport.getTerminalByTerminalGate(2);
		
		System.out.println("updating the terminal info");
		airport.updateterminalNameByGate("bhavana",1);
		
		airport.getTerminal();
		
		System.out.println("main method ended");*/
       
	
	
		
	

	
	
	

