package com.fintrack.repository;

import com.fintrack.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByMonth(String month);
    List<Expense> findByCategory(String category);
    List<Expense> findByMonthAndCategory(String month, String category);
} 