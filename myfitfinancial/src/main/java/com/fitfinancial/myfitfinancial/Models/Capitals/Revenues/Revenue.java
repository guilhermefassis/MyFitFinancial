package com.fitfinancial.myfitfinancial.Models.Capitals.Revenues;

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

@Table(name = "Revenue")
@Entity(name = "Revenue")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false, of = "id")
public class Revenue extends Capital {

    public Revenue(String description, Date paymentDate, double value, CapitalType type) {
        super(description, paymentDate, value, type);
    }
    public Revenue(Capital capital) {
        this.setDescription(capital.getDescription());
        this.setPaymentDate(capital.getPaymentDate());
        this.setType(capital.getType());
        this.setValue(capital.getValue());
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}
