package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.IpoPlaned;

public interface IPOPlanedDao extends JpaRepository<IpoPlaned, Integer>{
    List<IpoPlaned> findByCompanyCode(int companyCode);
}
