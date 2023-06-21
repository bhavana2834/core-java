package com.xworkz.encapsulationapp.terminalapp;

import java.util.Scanner;

import com.xworkz.encapsulationapp.terminalapp.terminal.Terminal;

public class TerminalTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Terminal terminal=new Terminal();
		System.out.println("enter the terminalId");
		int terminalId=sc.nextInt();
		terminal.setTerminalId(terminalId);
		
		System.out.println("enter the terminalname");
		String terminalName=sc.next();
		terminal.setTerminalName(terminalName);
		
		System.out.println("enter the bloodGroup");
		int gate=sc.nextInt();
		terminal.setGate(gate);
		
		
		System.out.println(terminal.getTerminalId() + " " + terminal.getTerminalName() + " " + terminal.getGate() );
	}
}
