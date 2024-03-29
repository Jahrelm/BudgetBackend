package com.example.budgetmanagement.service;

import com.example.budgetmanagement.model.Budget;

public interface IBudgetService {
    public Budget addBudget(Budget budget);

    Budget getBudget(Integer id);

    Budget updateBudget(Budget budget);

    String deleteBudget (Integer id);
}
