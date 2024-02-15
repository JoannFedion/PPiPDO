package com.example.repository;

import com.example.entity.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<Exchange, Integer> {
}