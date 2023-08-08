package com.fitfinancial.myfitfinancial.Models.Capitals.Spendings;

import java.util.Date;

import com.fitfinancial.myfitfinancial.Models.Capitals.Capital;
import com.fitfinancial.myfitfinancial.Models.Capitals.CapitalType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "Spending")
@Entity(name = "Spending")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false, of = "id")
public class Spending extends Capital {

    public Spending(String description, Date paymentDate, double value, CapitalType type) {
        super(description, paymentDate, value, type);
    }
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
