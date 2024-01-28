package com.crud.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.bank.BankApplication;
import com.crud.bank.Service.BankService;
import com.crud.bank.modern.BankEmployee;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankservice;
	
	@GetMapping("/get")
	public List<BankEmployee> getAllbank()   
	{
	return bankservice.getAllbank();
			
}
	
@PostMapping("/post")
	public BankEmployee saveBank(@RequestBody  BankEmployee bankemployee) 
	{
		return bankservice.saveBank( bankemployee);
	}
	
@DeleteMapping("/{id}")
	public void  deleteid(@PathVariable long id)
	{
		bankservice.deleteid(id);
	}
	 
	 
	 
}
