package com.xworkz.airport.terminal;

public class Terminal {
	
	private int terminalId;
	private String terminalName;
	private int gate;
	
	
	public void setTerminalId(int terminalId) {
		this.terminalId=terminalId;
	}
	public int getTerminalId() {
		return terminalId;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName=terminalName;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setGate(int gate) {
		this.gate=gate;
	}
	public int getGate() {
		return gate;
	}
}

