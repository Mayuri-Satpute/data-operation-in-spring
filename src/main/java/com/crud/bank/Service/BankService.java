package com.crud.bank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.bank.BankApplication;
import com.crud.bank.Model.BankRepository;
import com.crud.bank.modern.BankEmployee;


@Service   // to provide service
public class BankService {
  
@Autowired // for connecting two different class and interface
private BankRepository bankrepository;


 //get the data
public List<BankEmployee> getAllbank()   
{
return bankrepository.findAll();
		
}
 // post the data
public BankEmployee saveBank(BankEmployee bankemployee) 
 {
	 return  bankrepository.save(bankemployee);
 }

 public void deleteid(Long id)
 {
	  bankrepository.deleteById(id);
 }
 
 
}
