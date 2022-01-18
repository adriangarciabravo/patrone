package com.everis;

public class unit {
	public String name;
	private unit subordinado;
	
	public void executeCommand (String command) {
		if (subordinado == null) {
			
		}else {
			subordinado.executeCommand(command);
		}
		
	}
}
