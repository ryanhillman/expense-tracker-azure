package com.ryan.portfolio.expensetracker.repository;

import com.ryan.portfolio.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
