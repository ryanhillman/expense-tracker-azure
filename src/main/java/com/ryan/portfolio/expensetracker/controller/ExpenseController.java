package com.ryan.portfolio.expensetracker.controller;

import com.ryan.portfolio.expensetracker.model.Expense;
import com.ryan.portfolio.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    // GET all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    // POST a new expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }

    // DELETE expense by id
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseRepository.deleteById(id);
    }
}
