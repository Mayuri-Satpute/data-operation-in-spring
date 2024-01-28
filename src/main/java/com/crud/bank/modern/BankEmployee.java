package com.crud.bank.modern;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankEmployee {
	
public BankEmployee() {
	super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String city;
    private String accountno;
    
	
	
	public BankEmployee(Long id, String name, String city, String accountno) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.accountno = accountno;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	
}
   
    
     
     
     
     

