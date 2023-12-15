package com.example.expenseTracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenseTracker.Entity.Expenses;
import com.example.expenseTracker.Repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	
	@Autowired
	private ExpenseRepository expenseRepo;
	
	
	@Override
	public Expenses addExpensesToDb(Expenses expense) {
		return expenseRepo.save(expense);
	}

}
