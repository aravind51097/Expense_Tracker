package com.example.expenseTracker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.expenseTracker.Entity.Expenses;
import com.example.expenseTracker.Service.ExpenseService;

@RestController
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@PostMapping(path = "/addExpense",produces = MediaType.APPLICATION_JSON_VALUE)

	public Expenses addExpense(@RequestBody Expenses expense) {
			System.out.println(expense.toString());
				return expenseService.addExpensesToDb(expense);
		
		
	}

}
