package com.everis;
import com.everis.*;
public class person implements Iprototype,Ipersondecorator,Ioperacion {
	
	public String name; 
	public int edad;
	
	public person( String name, int edad ) {​
		super();
		this.name = name;
		this.edad = edad;
	
	}
	public String getPerson() {
		return name;
	}
	​
	@Override​

	public Iprototype clone() {
		person p = new Person (this.name);
		return p;
	}​
	
}

public static class PersonBuilder {
    private String name;
    private int edad;
    public PersonBuilder name (String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder edad (int edad) {
        this.edad = edad;
        return this;
    }
    public Person build () {
        return new Person(this);
    }
private Person(PersonBuilder personBuilder) {
    super();
    this.name = personBuilder.name;
    this.edad = personBuilder.edad;
}


}

public static PersonBuilder builder() {
    return new PersonBuilder();
}
@Override
 public void operacion() {
	 System.out.print("ejecutar");
 }

