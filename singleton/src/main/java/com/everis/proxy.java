package com.everis;

public class proxy implements Ioperacion{
private Person person;
	
public proxy (Person person) {
	this.person = person;
}

@Override
	public void operacion() {
	before();
	this.person.operacion();
	afeter();
		
	}
private void before() {
	
}

private void after () {
	
}

}
