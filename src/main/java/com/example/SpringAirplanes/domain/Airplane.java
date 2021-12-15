package com.example.SpringAirplanes.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity 
public class Airplane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	// @Column(nullable = false)
	@NotNull(message = "Airplane Name")
	private long name;
	
	
	@Column 
	private String type;
	
	
	@Column
	private long age;
	
	@Column
	private long numberOfEngines;
	
	
	//Default constructor 
	public Airplane()  {
		
		
	}

   // For testing
	public Airplane(long id, long name, String type, long age,
			long numberOfEngines) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
		this.numberOfEngines = numberOfEngines;
	}
	
	// For creating
     public Airplane(long name, String type, long age, long numberOfEngines) {
	    super();
	    this.name = name;
	    this.type = type;
	    this.age = age;
	    this.numberOfEngines = numberOfEngines;
   }
     
     
     // Getters and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getName() {
		return name;
	}

	public void setName(long name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public long getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(long numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, numberOfEngines, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return age == other.age && id == other.id && name == other.name && numberOfEngines == other.numberOfEngines
				&& Objects.equals(type, other.type);
	}

     
     
     
     
}



	
	
	
	
	
	


