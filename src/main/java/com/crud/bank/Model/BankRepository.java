package com.crud.bank.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.bank.BankApplication;
import com.crud.bank.modern.BankEmployee;

@Repository
public interface BankRepository extends JpaRepository<BankEmployee,Long> {
	
    
}
