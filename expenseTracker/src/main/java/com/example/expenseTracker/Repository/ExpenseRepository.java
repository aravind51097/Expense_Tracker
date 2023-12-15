package com.example.expenseTracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expenseTracker.Entity.Expenses;


@Repository
public interface ExpenseRepository extends JpaRepository<Expenses, Long>{

}
