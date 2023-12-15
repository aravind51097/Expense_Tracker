package com.example.expenseTracker.Repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.expenseTracker.Entity.ExpenseCategory;
import com.example.expenseTracker.Entity.Expenses;
import com.example.expenseTracker.Entity.User;


@SpringBootTest
class ExpenseRepositoryTest {
	
	@Autowired
	private ExpenseRepository expenseRepo;

	@Test
	void saveExpense() {
		
		ExpenseCategory category=ExpenseCategory.builder().category("Food").build();
		
		User user=User.builder().userName("aravind").build();
		
		Expenses expense=Expenses.builder().amount(100.00).descriptions("Food expesne")
				.expenseCategory(category).user(user).build();
				
		
				
		
				expenseRepo.save(expense);
		
	}
	
}
