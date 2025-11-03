package com.ryan.portfolio.expensetracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Primary key column, auto-incremented by the database
    private Long id;

    // Column for storing the expense name
    private String name;

    // Column for storing the expense amount
    private Double amount;

    @Column(name = "date_added")
    // Column for storing the date when the expense is created
    private LocalDate date = LocalDate.now();

    // Default constructor required by JPA
    public Expense() {}

    // Constructor for creating a new Expense with name and amount
    public Expense(String name, Double amount) {
        this.name = name;
        this.amount = amount;
        this.date = LocalDate.now();
    }

    // Getter and setter for id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for amount
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    // Getter and setter for date
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
