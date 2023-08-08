package com.fitfinancial.myfitfinancial.Models.Capitals.Revenues;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Long> {   
}
